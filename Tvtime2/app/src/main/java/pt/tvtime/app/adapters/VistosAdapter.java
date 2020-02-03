package pt.tvtime.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import pt.tvtime.app.R;
import pt.tvtime.app.model.Visto;

public class VistosAdapter extends BaseAdapter {

    private List<Visto> vistoList;
    private Context context;

    public VistosAdapter(Context context){
        this.context = context;
        this.vistoList = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return this.vistoList.size();
    }

    @Override
    public Visto getItem(int position) {
        return this.vistoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(this.context).inflate(R.layout.row, parent, false);
        }

        Visto visto = getItem(position);

        ImageView serieImage = convertView.findViewById(R.id.serieImage1);
        Glide.with(this.context).load(visto.getImage()).into(serieImage);

        return convertView;
    }

    public void updateVisto(List<Visto> vistos){
        this.vistoList = vistos;
        notifyDataSetChanged();
    }
}
