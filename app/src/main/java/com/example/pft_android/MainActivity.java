package com.example.pft_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import Repositorio.InicioSesionRepositorio;
import models.TerneraViewModel;

public class MainActivity extends AppCompatActivity {

    private Application application;
    private TerneraViewModel terneraViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        terneraViewModel = new ViewModelProvider(this, (ViewModelProvider.Factory) new TerneraFactory(getApplication())).get(TerneraViewModel.class);

        terneraViewModel.getTerneras().observe(this, libros -> {
            adapter.submitList(libros);
        });
    }

    public void metodoIniciarSesion (View view)
    {
        InicioSesionRepositorio inicioSesion = new InicioSesionRepositorio(application);

        System.out.println("Entra: " + inicioSesion.getListaTerneras());

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}