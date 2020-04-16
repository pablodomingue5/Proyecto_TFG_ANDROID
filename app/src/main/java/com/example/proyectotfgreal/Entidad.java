package com.example.proyectotfgreal;

public class Entidad {
    private int imgFoto;
    private String titulo;
    private String contenido;
    private String urlImagen;

    public Entidad(int imgFoto,String titulo,String contenido, String urlImg){
        this.imgFoto=imgFoto;
        this.titulo=titulo;
        this.contenido=contenido;
        urlImagen=urlImg;
    }
    public int getImgFoto(){
        return imgFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
    public String getUrlImagen(){return urlImagen;}
}
