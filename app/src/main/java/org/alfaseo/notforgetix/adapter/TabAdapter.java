package org.alfaseo.notforgetix.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

/**
 * Created by Gre on 11.03.2016.
 */
public class TabAdapter extends FragmentStatePagerAdapter {


    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }


    @Override
    public Fragment getItem(int position) {


        return null;
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
