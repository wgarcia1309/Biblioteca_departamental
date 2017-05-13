
package Models;

public class Nlibro {
    private Libro libro;
    private Nlibro ll,rl;

    public Nlibro(Libro libro) {
        this.libro = libro;
        ll=rl=null;
    }
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Nlibro getLl() {
        return ll;
    }

    public void setLl(Nlibro ll) {
        this.ll = ll;
    }
    
    public void setLl() {
        this.ll=null;
    }
    
    public Nlibro getRl() {
        return rl;
    }

    public void setRl(Nlibro rl) {
        this.rl = rl;
    }
    public void setRl() {
         this.rl=null;
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Nlibro){
            Nlibro temp=(Nlibro)o;
            return temp.getLibro().getISBN().equalsIgnoreCase(this.getLibro().getISBN());
        }
        return false;
    }
}
