package com.yuanyiwang.cs673projectdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.yuanyiwang.cs673projectdemo.adapter.ViewPagerAdapter;
import com.yuanyiwang.cs673projectdemo.fragment.ChatFragment;
import com.yuanyiwang.cs673projectdemo.fragment.CoachFragment;
import com.yuanyiwang.cs673projectdemo.fragment.ShareFragment;
import com.yuanyiwang.cs673projectdemo.fragment.TutorialFragment;
import com.yuanyiwang.cs673projectdemo.items.CoachItems;
import com.yuanyiwang.cs673projectdemo.items.Items;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<CoachItems> coachItemsList = new ArrayList<>();
    public static ArrayList<Items> tutorialItemsList = new ArrayList<>();
    public static ArrayList<Items> shareItemsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();
        initViewPager();
        populateItems();
    }

    private void initViewPager() {
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabLayout tabLayout = findViewById(R.id.tabs);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new CoachFragment(), "Coaches");
        viewPagerAdapter.addFragments(new TutorialFragment(), "Tutorials");
        viewPagerAdapter.addFragments(new ShareFragment(), "Share");
        viewPagerAdapter.addFragments(new ChatFragment(), "Chat");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void populateItems() {
        for (int i = 1; i < 11; i++) {
            coachItemsList.add(new CoachItems("Coach" + Integer.toString(i),
                    "Coach type " + Integer.toString(i),
                    "Coach" + Integer.toString(i) + " self description."));

            shareItemsList.add(new Items("User Post " + Integer.toString(i),
                    "Post " + Integer.toString(i) + " title",
                    "Post " + Integer.toString(i) + " body text."));

            tutorialItemsList.add(new Items("Coach" + Integer.toString(i),
                    "Tutorial " + Integer.toString(i) + " title",
                    "Tutorial " + Integer.toString(i) + " body text."));
        }
    }
}