package com.arsalan.pc.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionStatePagerAadapter extends FragmentStatePagerAdapter {
//https://www.youtube.com/watch?v=UqtsyhASW74
    private final static List<Fragment> mFragmentList = new ArrayList<>();
    private final static List<String> mFragmentTitleList = new ArrayList<>();

    public SectionStatePagerAadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragemnt(Fragment fragment,String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
}
