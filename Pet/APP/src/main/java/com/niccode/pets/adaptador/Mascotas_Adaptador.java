package com.niccode.pets.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.niccode.pets.constructor.Mascotas;
import com.niccode.pets.R;

import java.util.ArrayList;

public class Mascotas_Adaptador extends RecyclerView.Adapter<Mascotas_Adaptador.MascotasViewHolder> {
    ArrayList<com.niccode.pets.constructor.Mascotas> Mascotas;

    public Mascotas_Adaptador(ArrayList<Mascotas> Mascotas){
        this.Mascotas = Mascotas;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        return new MascotasViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull final MascotasViewHolder Mascotasholder, int position) {
        final Mascotas mascotas = Mascotas.get(position);
        Mascotasholder.imgFoto.setImageResource(mascotas.getFoto());
        Mascotasholder.tvNombre.setText(mascotas.getNombre());
        Mascotasholder.tvLikes.setText(String.valueOf(mascotas.getLikes()));

        Mascotasholder.btnLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int likes = mascotas.getLikes();
                String newCount = String.valueOf(likes +1);
                Mascotasholder.tvLikes.setText(newCount);

            }
        });

    }

    @Override
    public int getItemCount() {
        return Mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView    imgFoto;
        private TextView     tvNombre;
        private TextView     tvLikes;
        private ImageButton  btnLikes;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto   = (ImageView)     itemView.findViewById(R.id.imgGatito);
            tvNombre  = (TextView)      itemView.findViewById(R.id.nombre);
            tvLikes   = (TextView)      itemView.findViewById(R.id.likes);
            btnLikes  = (ImageButton)   itemView.findViewById(R.id.btnLikes);



        }
    }
}
