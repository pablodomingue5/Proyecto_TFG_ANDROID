package com.example.proyectotfgreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems=(ListView) findViewById(R.id.LvItems);
        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);
    }

    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        return listItems;
    }
}
