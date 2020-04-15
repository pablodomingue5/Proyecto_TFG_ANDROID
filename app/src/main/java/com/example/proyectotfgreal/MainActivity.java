package com.example.proyectotfgreal;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvItems;
    private Adaptador adaptador;
    public ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView1 = (ImageView)findViewById(R.id.imgFoto);

        lvItems=(ListView) findViewById(R.id.LvItems);

        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad> GetArrayItems() {
        ArrayList<Entidad> listItems = new ArrayList<>();

        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
       /* listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));
        listItems.add(new Entidad(R.drawable.ic_launcher_background,"BMW M4","SEDAN"));*/
        return listItems;
    }
}
