package com.arsalan.pc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.arsalan.pc.adapter.SectionStatePagerAadapter;
import com.arsalan.pc.fragment.Fragment1;
import com.arsalan.pc.fragment.Fragment2;
import com.arsalan.pc.fragment.Fragment3;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private SectionStatePagerAadapter mPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPagerAdapter = new SectionStatePagerAadapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        setupPager(mViewPager);
    }

    private void setupPager(ViewPager viewPager){
        SectionStatePagerAadapter adapter = new SectionStatePagerAadapter(getSupportFragmentManager());
        adapter.addFragemnt(new Fragment1(),"Fragment1");
        adapter.addFragemnt(new Fragment2(),"Fragment2");
        adapter.addFragemnt(new Fragment3(),"Fragment3");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int index){
        mViewPager.setCurrentItem(index);
    }
}
