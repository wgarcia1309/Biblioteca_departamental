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
public class Nusuario {
    private Usuario user;
    private Nusuario rl,ll;
    private Nlibro libros;

    public Nusuario(Usuario user) {
        this.user = user;
        rl=null;
        ll=null;
        libros=null;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Nlibro getLibros() {
        return libros;
    }
    public void addLibros(Libro libro){
        libro.setEstado(false);
        Nlibro temp=new Nlibro(libro);
        if(libros==null){
            libros=temp;
        }else{
            libros.setRl(temp);
            temp.setLl(libros);
        }
    }
    
    public Nusuario getLl() {
        return ll;
    }

    public void setLl(Nusuario ll) {
        this.ll = ll;
    }
    
    public void setLl() {
        this.ll=null;
    }
    
    public Nusuario getRl() {
        return rl;
    }

    public void setRl(Nusuario rl) {
        this.rl = rl;
        rl.ll=this.rl;
    }
    public void setRl() {
         this.rl=null;
    }
}
