package com.johnny.pageslidingtab.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.johnny.pageslidingtab.R;
import com.johnny.pageslidingtab.ui.fragment.FragmentFactory;
import com.johnny.pageslidingtab.utils.CommonUtil;

public class MainPagerAdapter extends FragmentPagerAdapter {

    private String[] tabArr;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
        tabArr = CommonUtil.getStringArray(R.array.tab_names);
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentFactory.create(position);
    }

    @Override
    public int getCount() {
        return tabArr.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabArr[position];
    }
}