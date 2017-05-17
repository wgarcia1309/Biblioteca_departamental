
package biblioteca_departamental;

import Models.Nautor;
import Models.Nlibro;
import Models.Libro;
import Models.Nusuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        this.librosF.setRl();
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
    public void setAutoresF(Nautor autoresF) {
        this.autoresF = autoresF;
    }
    public void addAutor(Nautor autores) {
        Nautor temp=this.getAutoresI();
        while(temp.getRl()!=null){
            temp=temp.getRl();
        }
        temp.setRl(autores);
        this.setAutoresF(autores);
        autores.setRl();
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
        /*try {
            Libro l=new Libro("Yolo");
            SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String strdate2 = "09-05-2017 11:35:42";
            Date newdate = dateformat2.parse(strdate2);
            l.setFecha(newdate);
            System.out.println(l.Multa());
            } catch (ParseException ex) {
            Logger.getLogger(Biblioteca_departamental.class.getName()).log(Level.SEVERE, null, ex);
        }*/ 
        bib = new Biblioteca_departamental();
            FirstView First= new FirstView();
            First.setVisible(true);
            First.setLocationRelativeTo(null);
        
    }
}