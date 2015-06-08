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

        final Holder holder;
        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            holder = new Holder();
            convertView = inflater.inflate(R.layout.item_row, null);

            holder.thumbnail = (ImageView) convertView.findViewById(R.id.thumbnail);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.price = (TextView) convertView.findViewById(R.id.price);
            holder.brand = (TextView) convertView.findViewById(R.id.brand);

            convertView.setTag(holder);

        } else {
            holder = (Holder) convertView.getTag();

        }


        Result r = resultList.get(position);

        Picasso.with(activity)
                .load(r.getImages().get(0).getPath())
                .into(holder.thumbnail);
        holder.name.setText(r.getData().getName());
        holder.price.setText(r.getData().getPrice());
        holder.brand.setText(r.getData().getBrand());


        return convertView;
    }

    static class Holder {
        ImageView thumbnail;
        TextView name;
        TextView price;
        TextView brand;
    }

}