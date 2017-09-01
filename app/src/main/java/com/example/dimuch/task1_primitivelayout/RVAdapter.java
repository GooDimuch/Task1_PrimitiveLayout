package com.example.dimuch.task1_primitivelayout;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    List<Integer> lIdPhotos;

    public RVAdapter(List<Integer> lIdPhotos) {
        this.lIdPhotos = lIdPhotos;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_view_photos, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.personPhoto.setImageResource(lIdPhotos.get(position));
    }

    @Override
    public int getItemCount() {
        return lIdPhotos.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}