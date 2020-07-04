package com.niccode.pets.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.niccode.pets.R;
import com.niccode.pets.adaptador.Mascotas_Adaptador;
import com.niccode.pets.constructor.Mascotas;

import java.util.ArrayList;


public class Fg_principal extends Fragment {


    ArrayList<Mascotas> ArraylistMascotas = new ArrayList<Mascotas>();
    private RecyclerView listaMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_principal, container, false);

        listaMascotas = v.findViewById(R.id.recly);
        LinearLayoutManager vista = new LinearLayoutManager(getActivity());
        vista.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(vista);
        iniciarLista();
        iniciarAdaptador();

        return v;

    }

    public void iniciarLista() {

        ArraylistMascotas.add(new Mascotas(R.drawable.gatito1, "Shasha", 1));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito2, "Nugget", 2));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito3, "Michin", 3));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito4, "Pelusa", 4));
        ArraylistMascotas.add(new Mascotas(R.drawable.gatito5, "Misifu", 5));


    }

    public void iniciarAdaptador(){
        Mascotas_Adaptador adaptador = new Mascotas_Adaptador(ArraylistMascotas);
        listaMascotas.setAdapter(adaptador);



    }
    public ArrayList<Mascotas> getArraylistMascotas() {
        return ArraylistMascotas;
    }

    public void setArraylistMascotas(ArrayList<Mascotas> arraylistMascotas) {
        ArraylistMascotas = arraylistMascotas;
    }


}