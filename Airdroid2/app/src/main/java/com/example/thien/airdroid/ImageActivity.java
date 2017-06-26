package com.example.thien.airdroid;

import android.app.Activity;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity{

    GridView gv;
    ArrayList<File> lstImg;
    ImageAdapter imgAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        lstImg = imageReader(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));

        gv = (GridView) findViewById(R.id.gvImage);
        imgAdapter = new ImageAdapter(this,lstImg);
        gv.setAdapter(imgAdapter);

;

    }

    private ArrayList<File> imageReader(File root)
    {
        ArrayList<File> a = new ArrayList<>();

        File[] files = root.listFiles();
        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
                a.addAll(imageReader(files[i]));
            }else {
                if(files[i].getName().endsWith(".jpg")){
                    a.add(files[i]);
                }
            }
        }
        return a;
    }

//    public byte[] convertImgToByte(String path){
//        File fi = new File(path);
//
//    }

}



