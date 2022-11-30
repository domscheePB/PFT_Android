package models;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import Entities.TerneraDTO;
import Repositorio.InicioSesionRepositorio;

public class TerneraViewModel extends AndroidViewModel {

    private final LiveData<List<TerneraDTO>> terneras;

    private InicioSesionRepositorio inicioSesionRepository;

    public TerneraViewModel(@NonNull Application application) {
        super(application);
        inicioSesionRepository = new InicioSesionRepositorio(application);
        terneras = inicioSesionRepository.getListaTerneras();
    }

    public LiveData<List<TerneraDTO>> getTerneras(){
        return terneras;
    }
}
