package com.example.tablayouts.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragmentList;
    List<String> nameList;
    public ViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> fragmentList,List<String> nameList) {
        super(fm);
        this.fragmentList=fragmentList;
        this.nameList=nameList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return this.fragmentList.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return nameList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentList.size();
    }

}

