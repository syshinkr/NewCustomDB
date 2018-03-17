package com.example.admin.newcustomdb.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.admin.newcustomdb.Fragment.SunFragment;

/**
 * Created by admin on 2017-12-28.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter{
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    //변경 사항
    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                SunFragment sunFragment = new SunFragment();
                return null;
            case 1:
                return null;

            case 2 :
                return null;
            case 3 :
                return null;
            case 4 :
                return null;
            case 5 :
                return null;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
