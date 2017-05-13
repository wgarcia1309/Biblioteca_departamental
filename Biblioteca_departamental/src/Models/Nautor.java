/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
public class Nautor {
    private Autor autor;
    private Nautor ll,rl;

    public Nautor(Autor autor) {
        this.autor = autor;
        ll=rl=null;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Nautor getLl() {
        return ll;
    }

    public void setLl(Nautor ll) {
        this.ll = ll;
    }
    
    public void setLl() {
        this.ll=null;
    }
    
    public Nautor getRl() {
        return rl;
    }

    public void setRl(Nautor rl) {
        this.rl = rl;
        rl.ll=this.rl;
    }
    public void setRl() {
         this.rl=null;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Nautor){
            return this.getAutor().getNombre().equalsIgnoreCase(((Nautor) o).getAutor().getNombre());
        }
    return false;
    }
}
