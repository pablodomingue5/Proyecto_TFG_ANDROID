package com.example.proyectotfgreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityLujo extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    public ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Coches de Lujo");
        setContentView(R.layout.activity_deportivo);
        imgView1 = (ImageView)findViewById(R.id.imgFoto);

        lvItems=(ListView) findViewById(R.id.LvItems);

        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);
        setContentView(R.layout.activity_lujo);
    }
    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"Compacto Premium",""));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"Ejecutivos",""));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"Berlina de Lujo","https://i.ibb.co/LnJ4qGT/5-BMW-Serie5-F10-MLCI.jpg"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"Ranchera",""));
        return listItems;
    }
}
