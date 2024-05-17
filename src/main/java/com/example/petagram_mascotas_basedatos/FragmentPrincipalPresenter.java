package com.example.petagram_mascotas_basedatos;

import android.content.Context;

import java.util.ArrayList;

public class FragmentPrincipalPresenter implements iFragmentPrincipalPresenter{

    private iFragmentPrincipalView ifragmentprincipalview;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public FragmentPrincipalPresenter(iFragmentPrincipalView ifragmentprincipalview, Context context) {
        this.ifragmentprincipalview = ifragmentprincipalview;
        this.context = context;
        obtenerMascotasBD();
    }

    @Override
    public void obtenerMascotasBD() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        ifragmentprincipalview.inicializarAdaptadorRV(ifragmentprincipalview.crearAdaptador(mascotas));
        ifragmentprincipalview.generarLinearLayoutVertical();
    }
}
