package com.gigamole.sample.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.gigamole.sample.screens.HorizontalPagerFragment;
import com.gigamole.sample.screens.TwoWayPagerFragment;
import com.gigamole.sample.screens.VerticalPagerFragment;

/**
 * Created by GIGAMOLE on 8/18/16.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private final static int COUNT = 3;

    private final static int HORIZONTAL = 0;
    private final static int TWO_WAY = 1;

    public MainPagerAdapter(final FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case TWO_WAY:
                return new TwoWayPagerFragment();
            case HORIZONTAL:
                new VerticalPagerFragment();
            default:
                return new HorizontalPagerFragment();
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
