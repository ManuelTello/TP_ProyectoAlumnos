package tema3;

public class Habitacion {
    private double costo;
    
    private boolean estaOcupada;
    
    public Cliente cliente;
   
    public Habitacion(double costo){
        this.costo = costo;
        estaOcupada = false;
        cliente = null;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public boolean getEstaOcupada(){
        return estaOcupada;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void aumentarCosto(double costo){
        this.costo += costo;
    }
    
    public void ocupar(Cliente cliente){
        this.cliente = cliente;
        estaOcupada = true;
    }
    
    public void desocupar(){
        estaOcupada = false;
        cliente = null;
    }
    
    @Override
    public String toString(){
        String estado = null;
        
        if(estaOcupada){
            estado = "ocupada";
        }else{
            estado = "libre";
        }
        
        String completo = "esta " + estado + ", $" + costo;
        if(cliente != null){
            completo = completo + ", " + cliente.toString();
        }
        
        return completo;
    }
}
