package ru.startandroid.develop.guide;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private PagerAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] nameTab =  {"Monuments","Parks","Restaurants"};

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpage);


        adapter = new PagerAdapter(getSupportFragmentManager(),3);
        adapter.addFragment(new MonumentsFragment(), "Tab 1");
        adapter.addFragment(new ParksFragment(), "Tab 2");
        adapter.addFragment(new RestaurantsFragment(), "Tab 3");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




    }

}