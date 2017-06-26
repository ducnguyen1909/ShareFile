package com.example.thien.airdroid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener{
    ViewPager viewPager;
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager();
        initTabhost();
    }
    private void initViewPager() {
        viewPager = (ViewPager)findViewById(R.id.viewpager);
        ArrayList<Fragment> listFragment = new ArrayList<>();
        listFragment.add(new ContactFragment());
        listFragment.add(new SmsFragment());
        listFragment.add(new FileFragment());
        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), listFragment);
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(this);
    }

    private void initTabhost() {
        tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup();
        String[] tabName = {"Contact", "Sms", "File"};
        for (int i = 0; i < tabName.length; i++){
            TabHost.TabSpec tabSpec;
            tabSpec = tabHost.newTabSpec(tabName[i]);
            tabSpec.setIndicator(tabName[i]);
            tabSpec.setContent(new FakeContent(getApplicationContext()));
            tabHost.addTab(tabSpec);
            tabHost.setOnTabChangedListener(this);
        }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        tabHost.setCurrentTab(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    //tab host change listener
    @Override
    public void onTabChanged(String tabId) {
        int selectTab = tabHost.getCurrentTab();
        viewPager.setCurrentItem(selectTab);
    }

    public class FakeContent implements TabHost.TabContentFactory{
        Context context;

        public FakeContent(Context context) {
            this.context = context;
        }

        @Override
        public View createTabContent(String tag) {
            View fakeView = new View(context);fakeView.setMinimumHeight(0);
            fakeView.setMinimumWidth(0);
            return  fakeView;
        }
    }
}
