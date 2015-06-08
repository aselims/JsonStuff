package co.rahala.selim.rocketinternet1.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import co.rahala.selim.rocketinternet1.R;
import co.rahala.selim.rocketinternet1.model.Result;


public class CustomListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<Result> resultList;

    public CustomListAdapter(Activity activity, List<Result> resultList) {
        this.activity = activity;
        this.resultList = resultList;
    }

    @Override
    public int getCount() {
        return resultList.size();
    }

    @Override
    public Object getItem(int location) {
        return resultList.get(location);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.item_row, null);


        ImageView thumbnail = (ImageView) convertView
                .findViewById(R.id.thumbnail);
        TextView name = (TextView) convertView.findViewById(R.id.name);
        TextView price = (TextView) convertView.findViewById(R.id.price);
        TextView brand = (TextView) convertView.findViewById(R.id.brand);


        Result r = resultList.get(position);

        Picasso.with(activity)
                .load(r.getImages().get(0).getPath())
                .into(thumbnail);
        name.setText(r.getData().getName());
        price.setText(r.getData().getPrice());
        brand.setText(r.getData().getBrand());


        return convertView;
    }

}