package com.example.pft_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import models.UsuarioDTO;
import rest.RestApiInterface;
import rest.RetrofitConnection;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombreUsuario;
    EditText editTextClave;

    UsuarioDTO usuario = new UsuarioDTO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void metodoIniciarSesion (View view)
    {
        intentoSesion(view);
    }

    public void mostrarMenu(View view)
    {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void intentoSesion(View view)
    {
        editTextNombreUsuario = (EditText)findViewById(R.id.editTextNombreUsuario);
        editTextClave = (EditText)findViewById(R.id.editTextClave);

        String nombreUsuario = editTextNombreUsuario.getText().toString();
        String clave = editTextClave.getText().toString();

        usuario.setUsuario(nombreUsuario);
        usuario.setClave(clave);

        RestApiInterface api = RetrofitConnection.getConecction().create(RestApiInterface.class);
        Call<UsuarioDTO> call = api.iniciarSesion(usuario.getUsuario(), usuario.getClave());

        call.enqueue(new Callback<UsuarioDTO>() {
            @Override
            public void onResponse(Call<UsuarioDTO> call, Response<UsuarioDTO> response)
            {
                if(response.isSuccessful())
                {
                    usuario = response.body();
                    System.out.println("Rol: " + usuario.getRol());
                }
                else
                {
                    System.out.println("Login fallido");
                }
            }

            @Override
            public void onFailure(Call<UsuarioDTO> call, Throwable t)
            {
                System.out.println("Sin respuesta");
            }
        });
    }
}