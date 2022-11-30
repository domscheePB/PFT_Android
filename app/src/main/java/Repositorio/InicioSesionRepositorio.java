package Repositorio;

import android.app.Application;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import Entities.TerneraDTO;
import rest.RestApiClient;
import rest.RestApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InicioSesionRepositorio {
    private RestApiInterface apiService = RestApiClient.getClient().create(RestApiInterface.class);

    //private MutableLiveData<List<LibroDto>> libros = new MutableLiveData<>();
    private MutableLiveData<List<TerneraDTO>> listaTerneras = new MutableLiveData<>();

    private Application application;

    public InicioSesionRepositorio(Application application){
        this.application = application;
        getTerneras();
    }

    public void getTerneras()
    {
        listaTerneras.setValue(new ArrayList<>());

        Call<List<TerneraDTO>> call = apiService.getTerneras();

        call.enqueue(new Callback<List<TerneraDTO>>(){

            @Override
            public void onResponse(Call<List<TerneraDTO>> call, Response<List<TerneraDTO>> response)
            {
                List<TerneraDTO> terneras = response.body();
                if(terneras != null){
                    listaTerneras.setValue(terneras);
                }
            }

            @Override
            public void onFailure(Call<List<TerneraDTO>> call, Throwable t)
            {
                System.out.println("Error AA");
                //Toast.makeText(application.getApplicationContext(), "No se ha podido obtener las terneras: "+t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

    public MutableLiveData<List<TerneraDTO>> getListaTerneras(){
        return listaTerneras;
    }
}
