package com.example.thien.airdroid;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.squareup.picasso.Picasso;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nguyenvan on 5/4/2017.
 */

public class ImageAdapter extends BaseAdapter  {

    Context c;
    ArrayList<File> lstImg;

    public ImageAdapter(Context c, ArrayList<File> lstImg) {
        this.c = c;
        this.lstImg = lstImg;
    }

    @Override
    public int getCount() {
        return lstImg.size();
    }

    @Override
    public Object getItem(int i) {
        return lstImg.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = LayoutInflater.from(c).inflate(R.layout.gridview_item_picture,viewGroup,false);

        ImageView iv = (ImageView) view.findViewById(R.id.img);
        iv.setImageURI(Uri.parse(getItem(i).toString()));
        return view;
    }


}

