package tema3;

public class Estante {
    private int lugarActual;
    
    private Libro[] libros;
    
    public Estante(){
        lugarActual = 0;
        libros = new Libro[20];
        for(int i = 0; i < 20; i++){
            libros[i] = null;
        }
    }
    
    public int cantidadLibros(){
        return lugarActual;
    }
    
    public boolean estaLleno(){
        return (lugarActual == 20);
    }
    
    public void agregarLibro(Libro libro){
        if(lugarActual == 20){
            System.out.println("No se puede agregar mas libros a esta estanteria.");
        }else{
            libros[lugarActual] = libro;
            lugarActual ++;  
        }
    }
    
    public Libro buscarLibro(String titulo){
        int indice = 0;
        boolean existe = false;

        while(indice < (lugarActual) && !existe){
            if(libros[indice].getTitulo().equals(titulo)){
                existe = true;
            }else{
                indice++;
            }
        }
        
        if(existe){
            return libros[indice];
        }else{
            return null;
        }
    }
}
