package com.example.petagram_mascotas_basedatos;

import java.util.ArrayList;

public interface iFragmentPrincipalView {

    public void generarLinearLayoutVertical();

    public MascotaAdapter crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdapter adaptador);
}
