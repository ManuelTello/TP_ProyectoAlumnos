package tema3;

public class Estanteria {
    private Estante[] estantes;
    
    private int[] dimensionEstantes;
    
    public Estanteria(){
        this.estantes = new Estante[2];
        this.dimensionEstantes = new int[2];
        
        for(int i = 0; i < 2; i++){
            this.estantes[i] = new Estante();
        }
        for(int i = 0; i < 2; i++){
            this.dimensionEstantes[i] = 0;
        }
    }
    
    public void agregarLibro(Libro libro){
        if(!this.estantes[0].estaLleno()){
            this.estantes[0].agregarLibro(libro);
            this.dimensionEstantes[0] += 1;
        }else{
            this.estantes[1].agregarLibro(libro);
            this.dimensionEstantes[1] += 1;
        }
    }
    
    public int getCantidadTotalDeLibros(){
        return this.dimensionEstantes[0] + this.dimensionEstantes[1];
    }
    
    public boolean libroEstaEnEstanteria(String titulo){
        return (this.estantes[0].buscarLibro(titulo) != null || this.estantes[1].buscarLibro(titulo) != null);
    }
}
