package tema3;

public class Ejer3 {
    public static void main(String[] args) {
        Estante estante = new Estante();
        Autor autor1 = new Autor("Herbert Schildt","","");
        Autor autor2 = new Autor("John Horton","","");
        
        Libro libro1 = new  Libro("Java: A Beginner's Guide","Mcgraw-Hill", 2014, autor1, "978-0071809252", 21.72);
        Libro libro2 = new  Libro("Java: A Beginner's Guide","Mcgraw-Hill", 2014, autor1, "978-0071809252", 21.72);
        Libro libro3 = new  Libro("Java: A Beginner's Guide","Mcgraw-Hill", 2014, autor1, "978-0071809252", 21.72);
        Libro libro4 = new  Libro("Java: A Beginner's Guide","Mcgraw-Hill", 2014, autor1, "978-0071809252", 21.72);
        Libro libro5 = new  Libro("Java: A Beginner's Guide","Mcgraw-Hill", 2014, autor1, "978-0071809252", 21.72);
        Libro libro6 = new Libro("Mujercita","CreateSpace Independent Publishing",autor2, "978-1512108347");
        
        estante.agregarLibro(libro1);
        estante.agregarLibro(libro6);
        estante.agregarLibro(libro2);
        estante.agregarLibro(libro3);
        estante.agregarLibro(libro4);
        estante.agregarLibro(libro5);
        
        System.out.println("Autor del libro Mujercita es " + estante.buscarLibro("Mujercita").getPrimerAutor().getNombre());
        
        /*
            Deberia tener una variable de instacia que limite la cantidad maxima 
            o puede ser una constante que se pueda pasar por instancia
        */
    } 
}
