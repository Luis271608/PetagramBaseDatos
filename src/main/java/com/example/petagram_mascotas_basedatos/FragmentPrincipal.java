package com.example.petagram_mascotas_basedatos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragmentPrincipal extends Fragment implements iFragmentPrincipalView{

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private iFragmentPrincipalPresenter presenter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_principal, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        // Inflate the layout for this fragment
        presenter = new FragmentPrincipalPresenter(this, getContext());
        return v;
    }

    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdapter crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        return adapter;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdapter adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
