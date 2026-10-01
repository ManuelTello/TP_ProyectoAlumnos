package tema3;

public class Estanteria {
    private Estante[] estantes;
    
    public Estanteria(){
        estantes = new Estante[2];
        
        for(int i = 0; i < 2; i++){
            estantes[i] = new Estante();
        }
    }
    
    public void agregarLibro(Libro libro){
        if(!this.estantes[0].estaLleno()){
            estantes[0].agregarLibro(libro);
        }else{
            estantes[1].agregarLibro(libro);
        }
    }
    
    public int getCantidadTotalDeLibros(){
        return estantes[0].cantidadLibros() + estantes[1].cantidadLibros();
    }
    
    public boolean libroEstaEnEstanteria(String titulo){
        return (estantes[0].buscarLibro(titulo) != null || estantes[1].buscarLibro(titulo) != null);
    }
}
