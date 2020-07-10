package ru.startandroid.develop.guide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs = 3 ;
    String[] titles = {"Monuments","Parks","Restaurants"};
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        mFragmentList.clear();
        this.numOfTabs = numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
         return titles[position];
    }
    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
