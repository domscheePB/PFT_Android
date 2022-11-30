package com.example.pft_android;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import models.TerneraViewModel;

public class TerneraFactory extends ViewModelProvider.NewInstanceFactory{
    @NonNull
    private final Application application;

    public TerneraFactory(@NonNull Application application){
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass == TerneraViewModel.class){
            return (T) new TerneraViewModel(application);
        }
        return null;
    }
}
