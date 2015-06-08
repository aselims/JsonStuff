package co.rahala.selim.rocketinternet1;

import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import co.rahala.selim.rocketinternet1.adapter.CustomListAdapter;
import co.rahala.selim.rocketinternet1.model.Items;
import co.rahala.selim.rocketinternet1.model.Result;
import co.rahala.selim.rocketinternet1.network.APIClient;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends ActionBarActivity {


    private static final String TAG = MainActivity.class.getSimpleName();
    private ProgressDialog pDialog;
    private List<Result> resultList = new ArrayList<Result>();
    private Button sortButton;
    private ListView listView;
    private CustomListAdapter adapter;

    void dismissPDialog() {
        if (pDialog != null) {
            pDialog.dismiss();
            pDialog = null;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // pDialog = new ProgressDialog(this);

        listView = (ListView) findViewById(R.id.listView);
        final Spinner spinner = (Spinner) findViewById(R.id.spinnerOrder);
        ArrayAdapter<CharSequence> sadapter = ArrayAdapter.createFromResource(this,
                R.array.sort_array, android.R.layout.simple_spinner_item);
        sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(sadapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                // Showing progress dialog before making http request
                /*pDialog.setMessage("Loading ...");
                pDialog.show();*/

                switch (position) {
                    case 0:
                        download("popularity", "desc");
                        break;
                    case 1:
                        download("price", "asc");
                        break;
                    case 2:
                        download("name", "asc");
                        break;
                    case 3:
                        download("brand", "asc");

                }
                //dismissPDialog();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        resultList = new ArrayList<>();

        adapter = new CustomListAdapter(this, resultList);
        listView.setAdapter(adapter);


        download("popularity", "desc");
    }


    private void download(String sort, String dir) {
        resultList.clear();
        APIClient.getsApiInterface().getItems(sort, dir, new Callback<Items>() {
            @Override
            public void success(Items items, Response response) {

                resultList.addAll(items.getMetadata().getResults());
                adapter.notifyDataSetChanged();

                // for(items.getMetadata().getResults() result : )
                Log.d(TAG, "brand " + items.getMetadata().getResults().get(0).getData().getBrand());

                Log.d(TAG, "count= " + items.getMetadata().getCategory_ids());
                Log.d(TAG, "price= " + items.getMetadata().getResults().get(0).getData().getPrice());
                Log.d(TAG, "image= " + items.getMetadata().getResults().get(0).getImages().get(0).getPath());
            }

            @Override
            public void failure(RetrofitError error) {

                Log.d(TAG, "error" + error);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
