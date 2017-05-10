
package biblioteca_departamental;

import Models.Nautor;
import Models.Nlibro;
import Models.Nusuario;
import visualbiblioteca.FirstView;
public class Biblioteca_departamental {
    
    private Nusuario usersF,usersI;
    private Nlibro librosF,librosI;
    private Nautor autoresI,autoresF;
    public Biblioteca_departamental() {
         usersF=usersI=null;
         autoresI=null;
         librosF=null;
    }

    public Nlibro getLibrosF() {
        return librosF;
    }

    public void setLibrosF(Nlibro librosF) {
        this.librosF = librosF;
    }

    public Nlibro getLibrosI() {
        return librosI;
    }

    public void setLibrosI(Nlibro librosI) {
        this.librosI = librosI;
    }

    public Nautor getAutoresI() {
        return autoresI;
    }

    public void setAutoresI(Nautor autoresI) {
        this.autoresI = autoresI;
    }
    public void setAutoresF(Nautor autoresI) {
        this.autoresI = autoresI;
    }
    public void addAutor(Nautor autores) {
        Nautor temp=this.getAutoresI();
        while(temp.getRl()!=null){
            temp=temp.getRl();
        }
        temp.setRl(autores);
        this.setAutoresF(autores);
    }
    
    public Nusuario getUsersF() {
        return usersF;
    }

    public void setUsersF(Nusuario usersF) {
        this.usersF = usersF;
    }

    public Nusuario getUsersI() {
        return usersI;
    }

    public void setUsersI(Nusuario usersI) {
        this.usersI = usersI;
    }
    public static Biblioteca_departamental bib;
    public static void main(String[] args) {
        bib = new Biblioteca_departamental();
        FirstView First= new FirstView();
        First.setVisible(true);
        First.setLocationRelativeTo(null);
    }
}
/*
-Afiliar a usuario.
-Ingresar ejemplar a la biblioteca (nuevo).
-Prestar libro. (Solicitar el código del afiliado, agregar el ejemplar a sus ejemplares prestados, asignar el ejemplar como no disponible. Todos los libros se prestan para una devolución máxima a los 4 días.
-Entregar libro. Si el libro es entregado después de la fecha de entrega se le cobrara una multa de $1000 diarios.
-Verificar en todo el sistema cuales ejemplares se encuentran sobrepasando el día de entrega, esto con el fin de comunicarse con el usuario y solicitar su devolución.
-Tener en cuenta las validaciones respectivas.
 */
 