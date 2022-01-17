package com.example.gridviewarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class ImageAdapter extends ArrayAdapter {
    private Context mContext;
    private String gvstring[];
    private int imgarray[];
    LayoutInflater inflator = null;

    public ImageAdapter(@NonNull Context context, int resource, String s[], int x[]) {
        super(context, resource);
        mContext = context;
        gvstring = s;
        imgarray = x;
        inflator = LayoutInflater.from(context);
    }
    @Override
    public int getCount()
    {
        return imgarray.length;
    }
    @Override
    public Object getItem(int position)
    {
        return null;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
            convertView = inflator.inflate(R.layout.lview,null);
        TextView country = (TextView) convertView.findViewById(R.id.tv1);
        ImageView icon = (ImageView) convertView.findViewById(R.id.imgv1);
        icon.setImageResource(imgarray[position]);
        country.setText(gvstring[position]);
        return convertView;
    }
}
