package com.example.tvtime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] numberWord;
    private int[] numberImage;

public HomeAdapter(Context c, String[] numberWord, int[] numberImage ){

    context=c;
    this.numberWord=numberWord;
    this.numberImage=numberImage;
}
    @Override
    public int getCount() {
        return numberWord.length;

    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
    if( inflater == null){
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    if(convertView == null){
        convertView = inflater.inflate(R.layout.row_item,null);
    }

        ImageView imageView = convertView.findViewById(R.id.imageView99);
        TextView textView = convertView.findViewById(R.id.imageView99);

        imageView.setImageResource(numberImage[i]);
        textView.setText(numberWord[i]);
        return convertView;

    }
}
