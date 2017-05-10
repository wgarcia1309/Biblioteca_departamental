/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author PC
 */
public class Usuario {
    private long cc;
    int telefono;
    private String nombre;
    private Nlibro libros;

    public Usuario(long cc, String nombre,int telefono) {
        this.cc = cc;
        this.nombre = nombre;
        libros=null;
    }

    public long getCc() {
        return cc;
    }

    public void setCc(long cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nlibro getLibros() {
        return libros;
    }

    public void setLibros(Nlibro libros) {
        this.libros = libros;
    }
    
}
//Una multlista con la información de todos los afiliados a la biblioteca (Esta lista se encuentra ordenada), y los ejemplares que tiene a su cargo.