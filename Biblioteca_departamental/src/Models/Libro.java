
package Models;

import java.util.Date;

/**
 *
 * @author PC
 */

public class Libro {
    private String ISBN,nombre,genero;
    private Usuario user;
    private boolean estado;
    private Autor autor;
    private Date  fecha;

    public Libro( String nombre,String ISBN,String genero) {
        this.nombre=nombre;
        this.ISBN = ISBN;
        user = null;//-10 no lo ha tomado nadie
        this.estado = true;
        this.fecha = null;
        autor=null;
    }
    public Libro(String nombre) {
        this.nombre=nombre;
        this.ISBN = null;
        user = null;//-10 no lo ha tomado nadie
        this.estado = true;
        this.fecha = null;
        autor=null;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setAutor() {
        this.autor = null;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Libro){
        return this.getNombre().equalsIgnoreCase(((Libro) o).getNombre());
        }
    return false;
    }
}
