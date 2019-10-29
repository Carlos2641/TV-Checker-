package com.example.tvtime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class HomeAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] numberWord;
    private int[] numberImage;

public HomeAdapter(Context c, String[] numberWord,int[] numberImage ){

    context=c;
    this.numberWord=numberWord;
    this.numberImage=numberImage;
}
    @Override
    public int getCount() {
        return 0;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
