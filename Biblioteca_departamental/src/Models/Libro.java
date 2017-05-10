
package Models;

import java.util.Date;

/**
 *
 * @author PC
 */

public class Libro {
    private String codigo,nombre,genero;
    private long codigou;
    private boolean estado;
    private Autor autor;
    private Date  fecha;

    public Libro( String nombre,String codigo,String genero) {
        this.nombre=nombre;
        this.codigo = codigo;
        codigou = -10;//-10 no lo ha tomado nadie
        this.estado = true;
        this.fecha = null;
        autor=null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    
    public long getCodigou() {
        return codigou;
    }

    public void setCodigou(long codigou) {
        this.codigou = codigou;
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
    
}
