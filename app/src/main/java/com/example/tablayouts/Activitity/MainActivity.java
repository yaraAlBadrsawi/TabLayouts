package com.example.tablayouts.Activitity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.example.tablayouts.Adapter.ViewPagerAdapter;
import com.example.tablayouts.Fragments.SeconedFragment;
import com.example.tablayouts.Fragments.ThirdFragment;
import com.example.tablayouts.Fragments.firstFragment;
import com.example.tablayouts.R;
import com.example.tablayouts.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int [] img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(this.binding.getRoot());

        List<Fragment> fragmentList=new ArrayList<>();
        this.binding.tabLayout.setupWithViewPager(this.binding.viewPager);

        fragmentList.add(new firstFragment());
        fragmentList.add(new SeconedFragment());
        fragmentList.add(new ThirdFragment());
        List<String> names=new ArrayList<>();
        this.img= new int[]{R.drawable.ic_baseline_search_24, R.drawable.ic_baseline_textsms_24, R.drawable.ic_baseline_title_24};
        names.add(" RED ");
        names.add(" BLUE ");
        names.add(" GREEN ");
        this.binding.viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragmentList,names));
        this.binding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "onTabSelected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "onTabUnselected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Toast.makeText(MainActivity.this, "onTabReselected", Toast.LENGTH_SHORT).show();
            }
        });
        setupTabIcons();
     }

    private void setupTabIcons() {
//        Objects.requireNonNull(binding.tabLayout.getTabAt(0)).setIcon(img[0]);
//        Objects.requireNonNull(binding.tabLayout.getTabAt(1)).setIcon(img[1]);
//        Objects.requireNonNull(binding.tabLayout.getTabAt(2)).setIcon(img[2]);
        for(int i=0;i<img.length;i++){
            Objects.requireNonNull(binding.tabLayout.getTabAt(i)).setIcon(img[i]);

        }
    }}