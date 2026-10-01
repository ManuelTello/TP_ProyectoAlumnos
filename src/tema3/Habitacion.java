package tema3;

public class Habitacion {
    private double costo;
    
    private boolean estaOcupada;
    
    public Cliente cliente;
    
    public Habitacion(double costo, boolean estaOcupada, Cliente cliente){
        this.costo = costo;
        this.estaOcupada = estaOcupada;
        this.cliente = cliente;
    }
    
    public Habitacion(double costo){
        this.costo = costo;
        this.estaOcupada = false;
        this.cliente = null;
    }
    
    public double getCosto(){
        return this.costo;
    }
    
    public boolean getEstaOcupada(){
        return this.estaOcupada;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setCosto(double costo){
        this.costo = costo;
    } 
    
    public void setEstaOcupada(boolean estaOcupada){
        this.estaOcupada = estaOcupada;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    @Override
    public String toString(){
        String estado = null;
        
        if(this.estaOcupada){
            estado = "ocupada";
        }else{
            estado = "libre";
        }
        
        String completo = "esta " + estado + ", $" + this.costo;
        if(this.cliente != null){
            completo = completo + ", " + this.cliente.toString();
        }
        
        return completo;
    }
}
