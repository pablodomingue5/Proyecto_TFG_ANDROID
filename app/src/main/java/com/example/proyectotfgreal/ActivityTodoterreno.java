package com.example.proyectotfgreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityTodoterreno extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    public ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Todoterrenos");
        setContentView(R.layout.activity_activty_todoterreno);
        setContentView(R.layout.activity_deportivo);
        imgView1 = (ImageView)findViewById(R.id.imgFoto);

        lvItems=(ListView) findViewById(R.id.LvItems);

        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);
        setContentView(R.layout.activity_lujo);
    }
    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"SUV",""));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"Vehiculo Deportivo Utilitrario",""));
        return listItems;
    }
}
