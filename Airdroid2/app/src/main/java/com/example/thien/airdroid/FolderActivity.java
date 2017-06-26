package com.example.thien.airdroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Nguyenvan on 5/11/2017.
 */

public class FolderActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Folder> fileNameList;
    private FolderAdapter mAdapter;
    private File file;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        mListView = (ListView) findViewById(R.id.lvFolder);
        file = Environment.getExternalStorageDirectory();
        fileNameList = getFileListfromSDCard();
        mAdapter = new FolderAdapter(FolderActivity.this, R.layout.listview_item_folder, fileNameList);
        mListView.setAdapter(mAdapter);
    }

    private List<Folder> getFileListfromSDCard() {
        String state = Environment.getExternalStorageState();
        fileNameList = new ArrayList<Folder>();
        if (Environment.MEDIA_MOUNTED.equals(state) && file.isDirectory()) {
            File[] fileArr = file.listFiles();
            int length = fileArr.length;
            for (int i = 0; i < length; i++) {
                File f = fileArr[i];

                fileNameList.add(new Folder(f.getName()));
            }
        }

        return fileNameList;
    }



}
