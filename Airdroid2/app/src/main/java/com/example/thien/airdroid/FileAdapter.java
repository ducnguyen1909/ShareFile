package com.example.thien.airdroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Thien on 4/3/2017.
 */

public class FileAdapter extends ArrayAdapter<FileType>{
    private Context context;
    ArrayList<FileType> listFileType;
    public FileAdapter(Context context, int resource, ArrayList<FileType> lst) {
        super(context, resource, lst);
        this.context = context;
        this.listFileType = lst;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.file_type_layout, parent, false);
        ImageView hinh = (ImageView)convertView.findViewById(R.id.type_image);
        TextView ten = (TextView)convertView.findViewById(R.id.file_type_name);
        hinh.setImageResource(listFileType.get(position).getHinhAnh());
        ten.setText(listFileType.get(position).getTenLoai());
        return convertView;
    }
}
