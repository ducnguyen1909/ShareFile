package com.example.thien.airdroid;

import android.support.annotation.NonNull;

/**
 * Created by Nguyenvan on 5/11/2017.
 */

public class Folder{
    private String nameFolder;

    public Folder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    public String getNameFolder() {
        return nameFolder;
    }

    public void setNameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
    }
}
