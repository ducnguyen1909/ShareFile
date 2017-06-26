package com.example.thien.airdroid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nguyenvan on 5/11/2017.
 */

public class FolderAdapter extends ArrayAdapter {
    private List<Folder> fLst;
    private Context adapContext;

    public FolderAdapter(Context context, int textViewResourceId,
                     List<Folder> fLst) {
        super(context, textViewResourceId, fLst);
        this.fLst = fLst;
        adapContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        view = View.inflate(adapContext, R.layout.listview_item_folder, null);


        TextView fNameView = (TextView) view.findViewById(R.id.fname);

        view.setTag(fNameView);

        Folder fd = fLst.get(position);


        fNameView.setText(fd.getNameFolder());

        return view;
    }
}



