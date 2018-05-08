package com.example.lh.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

/**
 * Created by lihang on 18-4-28.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private Fragment fragment1, fragment2, fragment3, fragment4;


    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return fragment1;
            case 1:
                return fragment2;
            case 2:
                return fragment3;
            case 3:
                return fragment4;
            default:
                  return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
