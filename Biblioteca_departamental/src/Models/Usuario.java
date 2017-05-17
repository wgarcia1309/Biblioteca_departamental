/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Usuario {
    private long cc,telefono;
    private String nombre;
    private Nlibro libros;

    public Usuario(long cc, String nombre,long telefono) {
        this.cc = cc;
        this.nombre = nombre;
        libros=null;
        this.telefono=telefono;
    }
    public Usuario(long cc) {
        this.cc = cc;
        this.nombre = null;
        libros=null;
        this.telefono=0;
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

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    public void addLibros(Libro o){
        if(libros==null){
            libros=new Nlibro(o);
        }else{
            Nlibro t=libros;
            while(t.getRl()!=null){
                t=t.getRl();
           }
           t.setRl(new Nlibro(o));
        }
    }
   
     public void delLibros(String s){//implementar
        Nlibro nodo=libros;
        while(nodo!=null){
        Libro l=nodo.getLibro();
            if(l.getISBN().equalsIgnoreCase(s))break;
            nodo=nodo.getRl();
        }
        if(nodo==null)JOptionPane.showMessageDialog(null, "Error no se encontro el ISBN");
        else if(nodo==libros && nodo.getRl()==null) libros=null;
        else if(nodo==libros)libros=nodo.getRl();
        else{
            Nlibro anterior=nodo.getLl();
            if(nodo.getRl()!=null)anterior.setRl(nodo.getRl());
            else anterior.setRl();
        }
    }
    public void setLibros(Nlibro libros) {
        this.libros = libros;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Usuario){
            return this.getCc()==((Usuario) (o)).getCc();
        }
        return false;
    }
}
//Una multlista con la información de todos los afiliados a la biblioteca (Esta lista se encuentra ordenada), y los ejemplares que tiene a su cargo.