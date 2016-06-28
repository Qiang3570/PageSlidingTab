package com.johnny.pageslidingtab.ui.fragment;

import android.support.v4.app.Fragment;

/**
 * Fragment工厂类
 */
public class FragmentFactory {
    /**
     * 根据position生产不同的fragment
     * @param position
     * @return
     */
    public static Fragment create(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new OneFragment();
                break;
            case 1:
                fragment = new TwoFragment();
                break;
            case 2:
                fragment = new ThreeFragment();
                break;
            case 3:
                fragment = new FourFragment();
                break;
            case 4:
                fragment = new FiveFragment();
                break;
            case 5:
                fragment = new SixFragment();
                break;
            case 6:
                fragment = new SevenFragment();
                break;
            case 7:
                fragment = new EightFragment();
                break;
            case 8:
                fragment = new NineFragment();
                break;
            case 9:
                fragment = new TenFragment();
                break;
        }
        return fragment;
    }
}