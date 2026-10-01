package tema3;

public class Estante {
    private int lugarActual;
    
    private Libro[] libros;
    
    public Estante(){
        this.lugarActual = 0;
        this.libros = new Libro[20];
        for(int i = 0; i < 20; i++){
            this.libros[i] = null;
        }
    }
    
    public int cantidadLibros(){
        return this.lugarActual;
    }
    
    public boolean estaLleno(){
        return (this.lugarActual == 20);
    }
    
    public void agregarLibro(Libro libro){
        this.libros[this.lugarActual] = libro;
        this.lugarActual ++;
    }
    
    public Libro buscarLibro(String titulo){
        int indice = 0;
        boolean existe = false;

        while(indice < (this.lugarActual) && !existe){
            if(this.libros[indice].getTitulo().equals(titulo)){
                existe = true;
            }else{
                indice++;
            }
        }
        
        if(existe){
            return this.libros[indice];
        }else{
            return null;
        }
    }
}
