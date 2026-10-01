package tema3;

public class Cliente {
    private String nombre;
    
    private int dni;
    
    private int edad;
    
    public Cliente(String nombre, int dni, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setDni(int dni){
        this.dni = dni;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "nombre " + this.nombre + ", edad " + this.edad + ", dni " + this.dni;
    }
}
