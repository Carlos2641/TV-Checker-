package com.example.tvtime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class rowAdapter extends BaseAdapter {

    private List<Series> seriesList;
    private Context context;

    public rowAdapter (Context context){
        this.context = context;
        this.seriesList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return this.seriesList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.seriesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            assert layoutInflater != null;
            convertView = layoutInflater.inflate(R.layout.row, null);
        }

        Series series = getItem(position);

        ImageView imageView1 = convertView .findViewById(R.id.serieImage1);
        Glide.with(this.context).load(series.getImage()).into(imageView1);

        ImageView imageView2 = convertView .findViewById(R.id.serieImage2);
        Glide.with(this.context).load(series.getImage()).into(imageView2);

        return convertView;
    }

    public void updateSpeakers(List<Series> series) {
        this.seriesList = series;
        notifyDataSetChanged();
    }
}
