package com.example.dimuch.task1_primitivelayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapterForNews extends RecyclerView.Adapter<RVAdapterForNews.NewsViewHolder> {

    private List<Integer> lIdPhotosNews;
    private List<String> lNameNews;
    private List<String> lDateNews;
    private List<String> lNewsNews;

    public RVAdapterForNews(List<Integer> lIdPhotosNews, List<String> lNameNews, List<String> lDateNews, List<String> lNewsNews) {
        this.lIdPhotosNews = lIdPhotosNews;
        this.lNameNews = lNameNews;
        this.lDateNews = lDateNews;
        this.lNewsNews = lNewsNews;
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView newsPhoto;
        TextView newsName;
        TextView newsDate;
        TextView newsNews;

        NewsViewHolder(View itemView) {
            super(itemView);
            newsPhoto = (ImageView) itemView.findViewById(R.id.newsPhoto);
            newsName = (TextView) itemView.findViewById(R.id.newsName);
            newsDate = (TextView) itemView.findViewById(R.id.newsDate);
            newsNews = (TextView) itemView.findViewById(R.id.newsNews);
        }
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycle_list_view_news, viewGroup, false);
        return new NewsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.newsPhoto.setImageResource(lIdPhotosNews.get(position));
        holder.newsName.setText(lNameNews.get(position));
        holder.newsDate.setText(lDateNews.get(position));
        holder.newsNews.setText(lNewsNews.get(position));
    }

    @Override
    public int getItemCount() {
        return lIdPhotosNews.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}