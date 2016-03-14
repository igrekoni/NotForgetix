package org.alfaseo.notforgetix.adapter;

import android.support.v4.app.FragmentStatePagerAdapter;

import org.alfaseo.notforgetix.fragment.CurrentTaskFragment;
import org.alfaseo.notforgetix.fragment.DoneTaskFragment;

/**
 * Created by Gre on 11.03.2016.
 */
public class TabAdapter extends FragmentStatePagerAdapter {


    private int numberOfTabs;

    public TabAdapter(android.support.v4.app.FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }


    @Override
    public android.support.v4.app.Fragment getItem(int i) {

        switch (i) {
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
