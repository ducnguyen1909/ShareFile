package com.example.thien.airdroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Thien on 4/22/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> listFragment;
    public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> listFragment) {
        super(fm);
        this.listFragment = listFragment;
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }
}
