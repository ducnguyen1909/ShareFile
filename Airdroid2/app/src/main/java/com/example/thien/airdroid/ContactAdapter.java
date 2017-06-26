package com.example.thien.airdroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thien on 4/22/2017.
 */

public class ContactAdapter extends ArrayAdapter {
    private Context context;
    private ArrayList<Contact> listContact;
    public ContactAdapter(Context context, int resource, ArrayList<Contact> listContact) {
        super(context, resource, listContact);
        this.context = context;
        this.listContact = listContact;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.contact_item, parent, false);
        TextView name = (TextView) convertView.findViewById(R.id.txt_name);
        TextView phone = (TextView) convertView.findViewById(R.id.txt_sodienthoai);
        name.setText(listContact.get(position).getName());
        phone.setText(listContact.get(position).getPhone());
        return convertView;
    }
}
