package com.example.dimuch.task1_primitivelayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class PrimitiveLayout extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primitive_layout);

        int iIdPerson = getIntent().getIntExtra(MainActivity.EXTRA_MESSAGE, -1);

        PersonProfile profile = new PersonProfile();
        fillViews(profile);

        RecyclerView rvPhotos = (RecyclerView) findViewById(R.id.rvPhotos);
        LinearLayoutManager llm = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        rvPhotos.setLayoutManager(llm);
        RVAdapterForPhotos adapter = new RVAdapterForPhotos(profile.getlIdPhotos());
        rvPhotos.setAdapter(adapter);



        ViewPager viewPager = (ViewPager) findViewById(R.id.vpNewsFeed);
        setupViewPager(viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tlNewsFeed);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new AllNewsFragment(), "Все записи");
        adapter.addFragment(new PersonNewsFragment(), "Записи Элвиса");
        viewPager.setAdapter(adapter);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profile, menu);
        return true;
    }
}
