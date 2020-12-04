package com.example.guiaturistica;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceHolder> {

    ArrayList<Sitios> places;

    public PlaceAdapter(ArrayList<Sitios> places) {
        this.places = places;
    }

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place, parent, false);
        return new PlaceHolder(view);
    }

    @Override
    public void onBindViewHolder(PlaceHolder holder, int position) {
        Sitios place = places.get(position);
        holder.sitio.setText(place.getNombresitio());
        holder.municipio.setText(place.getNombremunicipio());
        holder.direccion.setText(place.getDireccion());
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class PlaceHolder extends RecyclerView.ViewHolder {
        TextView municipio, sitio, direccion;


        public PlaceHolder(View itemView) {
            super(itemView);
            sitio = itemView.findViewById(R.id.sitioname);
            municipio = itemView.findViewById(R.id.municipio);
            direccion = itemView.findViewById(R.id.direccion);
        }
    }
}