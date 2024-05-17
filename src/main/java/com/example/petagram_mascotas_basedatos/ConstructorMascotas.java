package com.example.petagram_mascotas_basedatos;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;

public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;
    private MainActivity2 test = new MainActivity2();

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos db = new BaseDatos(context);

        insertarMascotas(db);

        return db.obtenerTodasLasMascotas();
    }

    public void insertarMascotas(BaseDatos db){
        // Mascota 1
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.d1);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Frida");

        db.insertarMascota(contentValues);

        // Mascota 2
        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.d2);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "King");

        db.insertarMascota(contentValues);

        // Mascota 3
        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.d3);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Puppy");

        db.insertarMascota(contentValues);

        // Mascota 4
        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.d4);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Oso");

        db.insertarMascota(contentValues);

        // Mascota 5
        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.d5);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Pancho");

        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);

        db.insertarLikeMascota(contentValues);
    }

    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);
    }
}
