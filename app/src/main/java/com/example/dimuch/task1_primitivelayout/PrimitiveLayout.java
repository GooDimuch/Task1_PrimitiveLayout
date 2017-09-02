package com.example.dimuch.task1_primitivelayout;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveLayout extends AppCompatActivity{

    private RecyclerView rvNews;
    private RecyclerView rvPhotos;
    private RVAdapterForNews rvAdapterForAllNews;
    private RVAdapterForNews rvAdapterForPersonalNews;
    private RVAdapterForPhotos rvAdapterForPhotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primitive_layout);

        setTitleAppBar(R.string.profile);
        setIconAppBar(R.drawable.vk_logo);
        setIconArrowBackAppBar(R.drawable.arrow_left);

        int iIdPerson = getIntent().getIntExtra(MainActivity.EXTRA_MESSAGE, -1);

        PersonProfile profile = new PersonProfile();
        fillViews(profile);

        rvPhotos = (RecyclerView) findViewById(R.id.rvPhotos);
        LinearLayoutManager layoutManagerForPhotos = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvPhotos.setLayoutManager(layoutManagerForPhotos);
        rvAdapterForPhotos = new RVAdapterForPhotos(profile.getlIdPhotos());
        rvPhotos.setAdapter(rvAdapterForPhotos);

        rvNews = (RecyclerView) findViewById(R.id.rvNews);
        LinearLayoutManager layoutManagerForNews = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rvNews.setLayoutManager(layoutManagerForNews);
        rvAdapterForAllNews = new RVAdapterForNews(sendNewsPhoto(), sendNewsName(), sendNewsDate(), sendNewsNews());
        rvAdapterForPersonalNews = new RVAdapterForNews(sendNewsPhoto1(), sendNewsName1(), sendNewsDate1(), sendNewsNews1());
        rvNews.setAdapter(rvAdapterForAllNews);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tlNewsFeed);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                switch (tab.getPosition()) {
                    case 1:
                        Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
                        rvNews.setAdapter(rvAdapterForAllNews);
                        break;
                    case 0:
                        Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                        rvNews.setAdapter(rvAdapterForPersonalNews);
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }

    public void setTitleAppBar(@StringRes int resId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(resId);
        }
    }

    public void setIconArrowBackAppBar(@DrawableRes int resId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(resId);
        }
    }

    public void setIconAppBar(@DrawableRes int resId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setIcon(resId);
        }
    }

    public void setIconMenuAppBar(@DrawableRes int resId) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
        }
    }

    private void fillViews(PersonProfile profile) {

        TextView tvPersonName = (TextView) findViewById(R.id.tvPersonName);
        tvPersonName.setText(profile.getsPersonName());
        TextView tvPersonOnlineStatus = (TextView) findViewById(R.id.tvPersonOnlineStatus);
        tvPersonOnlineStatus.setText(profile.getsPersonStatus());
        TextView tvPersonOld = (TextView) findViewById(R.id.tvPersonOld);
        tvPersonOld.setText(profile.getsPersonOld());
        TextView tvNumberAllFriends = (TextView) findViewById(R.id.tvNumberAllFriends);
        tvNumberAllFriends.setText(profile.getsPersonNumberAllFriends());
        TextView tvAllFriends = (TextView) findViewById(R.id.tvAllFriends);
        tvAllFriends.setText(profile.getsPersonAllFriends());
        TextView tvNumberCommonFriends = (TextView) findViewById(R.id.tvNumberCommonFriends);
        tvNumberCommonFriends.setText(profile.getsPersonNumberCommonFriends());
        TextView tvCommonFriends = (TextView) findViewById(R.id.tvCommonFriends);
        tvCommonFriends.setText(profile.getsPersonCommonFriends());
        TextView tvNumberSubscribers = (TextView) findViewById(R.id.tvNumberSubscribers);
        tvNumberSubscribers.setText(profile.getsPersonNumberSubscribers());
        TextView tvSubscribers = (TextView) findViewById(R.id.tvSubscribers);
        tvSubscribers.setText(profile.getsPersonSubscribers());
        TextView tvNumberPhotos = (TextView) findViewById(R.id.tvNumberPhotos);
        tvNumberPhotos.setText(profile.getsPersonNumberPhotos());
        TextView tvPhotos = (TextView) findViewById(R.id.tvPhotos);
        tvPhotos.setText(profile.getsPersonPhotos());
        TextView tvNumberVideos = (TextView) findViewById(R.id.tvNumberVideos);
        tvNumberVideos.setText(profile.getsPersonNumberVideos());
        TextView tvVideos = (TextView) findViewById(R.id.tvVideos);
        tvVideos.setText(profile.getsPersonVideos());
        TextView tvNumberAudios = (TextView) findViewById(R.id.tvNumberAudios);
        tvNumberAudios.setText(profile.getsPersonNumberAudios());
        TextView tvAudios = (TextView) findViewById(R.id.tvAudios);
        tvAudios.setText(profile.getsPersonAudios());
    }

    public List<Integer> sendNewsPhoto() {
        List<Integer> lIdNewsPhotos = new ArrayList<>();
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        lIdNewsPhotos.add(R.drawable.photo);
        return lIdNewsPhotos;
    }

    public List<String> sendNewsName() {
        List<String> lNewsName = new ArrayList<>();
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        return lNewsName;
    }

    public List<String> sendNewsDate() {
        List<String> lNewsDate = new ArrayList<>();
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        return lNewsDate;
    }

    public List<String> sendNewsNews() {
        List<String> lIdNewsNews = new ArrayList<>();
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        return lIdNewsNews;
    }

    public List<Integer> sendNewsPhoto1() {
        List<Integer> lIdNewsPhotos = new ArrayList<>();
        lIdNewsPhotos.add(R.mipmap.ic_launcher);
        lIdNewsPhotos.add(R.mipmap.ic_launcher);
        lIdNewsPhotos.add(R.mipmap.ic_launcher);
        lIdNewsPhotos.add(R.mipmap.ic_launcher);
        lIdNewsPhotos.add(R.mipmap.ic_launcher);
        lIdNewsPhotos.add(R.mipmap.ic_launcher);
        return lIdNewsPhotos;
    }

    public List<String> sendNewsName1() {
        List<String> lNewsName = new ArrayList<>();
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        lNewsName.add("Элвис Пресли");
        return lNewsName;
    }

    public List<String> sendNewsDate1() {
        List<String> lNewsDate = new ArrayList<>();
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        lNewsDate.add("26 июня 1977");
        return lNewsDate;
    }

    public List<String> sendNewsNews1() {
        List<String> lIdNewsNews = new ArrayList<>();
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        lIdNewsNews.add("Hi! You are loh :D");
        return lIdNewsNews;
    }
}
