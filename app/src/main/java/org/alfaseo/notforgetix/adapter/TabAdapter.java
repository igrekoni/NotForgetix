package org.alfaseo.notforgetix.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import org.alfaseo.notforgetix.fragment.CurrentTaskFragment;
import org.alfaseo.notforgetix.fragment.DoneTaskFragment;

/**
 * Created by Gre on 11.03.2016.
 */
public class TabAdapter extends FragmentStatePagerAdapter {


    private int numberOfTabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION =0;
    public static final int DONE_TASK_FRAGMENT_POSITION =1;

    private CurrentTaskFragment currentTaskFragment;
    private DoneTaskFragment doneTaskFragment;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        currentTaskFragment = new CurrentTaskFragment();
        doneTaskFragment = new DoneTaskFragment();
    }


    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0:
                return currentTaskFragment;
            case 1:
                return doneTaskFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
