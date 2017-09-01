package com.example.dimuch.task1_primitivelayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class RVAdapterForPhotos extends RecyclerView.Adapter<RVAdapterForPhotos.PersonViewHolder> {

    private List<Integer> lIdPhotos;

    public RVAdapterForPhotos(List<Integer> lIdPhotos) {
        this.lIdPhotos = lIdPhotos;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            personPhoto = (ImageView) itemView.findViewById(R.id.personPhoto);
        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycle_list_view_photos, viewGroup, false);
        return new PersonViewHolder(v);
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