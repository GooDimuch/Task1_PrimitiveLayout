package com.example.dimuch.task1_primitivelayout;
 
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class AllNewsFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.news_fragment, container, false);

        RecyclerView rvAllNews = (RecyclerView) view.findViewById(R.id.rvNews);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rvAllNews.setLayoutManager(llm);
        RVAdapterForNews adapter = new RVAdapterForNews(sendNewsPhoto(), sendNewsName(), sendNewsDate(), sendNewsNews());
        rvAllNews.setAdapter(adapter);

        return view;
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
}