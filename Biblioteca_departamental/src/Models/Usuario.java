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
     public void delLibros(Libro o){//implementar
         d
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