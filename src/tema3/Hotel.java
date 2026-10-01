package tema3;

public class Hotel {
    private int cantHabitaciones;
    
    private Habitacion[] habitaciones;
    
    public Hotel(int cantHabitaciones, double costoFrente, double costoContraFrente){
        this.cantHabitaciones = cantHabitaciones;
        this.habitaciones = new Habitacion[this.cantHabitaciones];
        for(int i = 0; i < this.cantHabitaciones; i++){
            if (i % 2 == 0){
                this.habitaciones[i] = new Habitacion(costoFrente);
            }else{
                this.habitaciones[i] = new Habitacion(costoContraFrente);
            }
        }
    }
    
    public void ingresarCliente(Cliente cliente, int numHabitacion){
        this.habitaciones[numHabitacion - 1].setCliente(cliente);
        this.habitaciones[numHabitacion - 1].setEstaOcupada(true);
    }
    
    public void aumentarCostoGlobal(double costo){
        for(int i = 0; i < this.cantHabitaciones; i++){
            Habitacion ha = this.habitaciones[i];
            ha.setCosto(ha.getCosto() + costo);
        }
    }
    
    @Override
    public String toString(){
        String completo = "";
        for(int i = 0; i < this.cantHabitaciones; i++){
            completo = completo + "Habitacion " + (i + 1) + ", " + this.habitaciones[i].toString() + "\n";
        }
        
        return completo;
    }
}
