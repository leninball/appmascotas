package com.leninball.appmascotas;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lenin on 14/05/2017.
 */

public class ListadoMascotas extends AppCompatActivity{
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado_mascotas);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

