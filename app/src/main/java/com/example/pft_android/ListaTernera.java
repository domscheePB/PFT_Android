package com.example.pft_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import models.TerneraDTO;
import rest.RestApiInterface;
import rest.RetrofitConnection;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListaTernera extends AppCompatActivity {

    ArrayList<String> listaTernerasCaravana = new ArrayList<String>();

    ArrayAdapter<String> adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ternera);

        ListView listView = findViewById(R.id.list_terneras);

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,listaTernerasCaravana);
        listView.setAdapter(adapter);

        cargaTerneras();
    }

    public void cargaTerneras()
    {
        RestApiInterface api = RetrofitConnection.getConecction().create(RestApiInterface.class);

        Call<List<TerneraDTO>> call = api.getTerneras();
        call.enqueue(new Callback<List<TerneraDTO>>() {
            @Override
            public void onResponse(Call<List<TerneraDTO>> call, Response<List<TerneraDTO>> response) {
                List<TerneraDTO> lista = response.body();
                for(TerneraDTO t: lista)
                {
                    String datosAUX = "Identificador:  " + t.getCaravanatambo() + "\n"
                            + "Guachera:  " + t.getIdentificadorGuachera() + "\n"
                            + "Raza:  " + t.getRaza() + "\n"
                            + "Fecha de Nacimiento:  " + new SimpleDateFormat("dd/MM/yyyy").format(t.getFechaNacimiento());
                    listaTernerasCaravana.add(datosAUX);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<TerneraDTO>> call, Throwable t) {

            }
        });
    }
}