package com.example.countryinformationproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String [] country_resource;
    private int [] flags;
    private LayoutInflater layoutInflater;

    CustomAdapter(Context context,
                  String [] country_resource,
                  int [] flags){
        this.context = context;
        this.country_resource = country_resource;
        this.flags= flags;

    }

    @Override
    public int getCount() {
        return flags.length;
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
    public View getView(int position, View ConvertView, ViewGroup parent) {


        if (ConvertView == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            ConvertView = layoutInflater.inflate(R.layout.listview_source,parent,false);
        }

        ImageView imageView;
        TextView textView;
        imageView = ConvertView.findViewById(R.id.flag_id);
        textView = ConvertView.findViewById(R.id.list_view_source_id);

        imageView.setImageResource(flags[position]);
        textView.setText(country_resource[position]);



        return ConvertView;
    }
}
