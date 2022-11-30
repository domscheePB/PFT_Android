package com.example.pft_android;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuFragment extends Fragment
{
    View view;
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_menu, container, false);
        listView = view.findViewById(R.id.list_menu);

        List<String> funcionalidades = new ArrayList<String>();
        funcionalidades.add("Alta de Terneras");
        funcionalidades.add("Listado de Terneras");
        funcionalidades.add("Cargar datos históricos de Enfermedades");
        funcionalidades.add("Listar datos históricos de Enfermedades");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1,funcionalidades);
        listView.setAdapter(adapter);

        return view;
    }
}