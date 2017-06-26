package com.example.thien.airdroid;

/**
 * Created by Thien on 4/3/2017.
 */

public class FileType {
    private String tenLoai;
    private int hinhAnh;

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public FileType(String tenLoai, int hinhAnh) {
        this.tenLoai = tenLoai;
        this.hinhAnh = hinhAnh;
    }
}
