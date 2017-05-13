package Models;

public class Autor {

    private String nombre;
    private Nlibro obras;
    private Autor lr, li;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.lr = null;
        this.li = null;
        this.obras = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nlibro getObras() {
        return obras;
    }

    public void addObras(Nlibro obras) {
        Nlibro temp = this.obras;
        Libro t=obras.getLibro();
        if (temp != null) {
            while (temp.getRl() != null) {
                temp = temp.getRl();
            }
            temp.setRl(new Nlibro(t));
        }else{
            this.obras=new Nlibro(t);
        }
    }

    public Autor getLr() {
        return lr;
    }

    public void setLr(Autor lr) {
        this.lr = lr;
    }

    public Autor getLi() {
        return li;
    }

    public void setLi(Autor li) {
        this.li = li;
    }

}

//Una multilista con la información de los autores, y cada uno de los libros.
