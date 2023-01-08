package com.example.pft_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView listView = findViewById(R.id.list_menu);

        List<String> funcionalidades = new ArrayList<String>();
        funcionalidades.add("Alta de Terneras");
        funcionalidades.add("Listado de Terneras");
        funcionalidades.add("Cargar datos históricos de Enfermedades");
        funcionalidades.add("Listar datos históricos de Enfermedades");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,funcionalidades);
        listView.setAdapter(adapter);

        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                //Object o = listView.getItemAtPosition(position);
                cambiarVentana(position);
            }
        });
    }

    public void cambiarVentana(int i){
        if(i==0)
        {
            Intent intent = new Intent(this, AltaTernera.class);
            startActivity(intent);
        }
        if(i==1)
        {
            Intent intent = new Intent(this, ListaTernera.class);
            startActivity(intent);
        }
        else
        {
            System.out.println("Ventana sin agregar");
        }
    }

    public void metodoCerrarSesion (View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}