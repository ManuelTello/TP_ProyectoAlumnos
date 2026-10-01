package tema3;

public class Ejer5 {
    public static void main(String[] args) {
        Estanteria estanteria = new Estanteria();
        Autor autor1 = new Autor("Herbert Schildt","","");
        
        
        for(int i = 0; i < 24; i++){
            Libro libro = new  Libro("Libro " + i,"Mcgraw-Hill",autor1,"978-0071809252");
            estanteria.agregarLibro(libro);
        }
        
        System.out.println("Cantidad de libros total " + estanteria.getCantidadTotalDeLibros());
        System.out.println("Libro esta en estanteria " + estanteria.libroEstaEnEstanteria("Libro 23"));
    }
}
