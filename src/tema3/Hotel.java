package tema3;

public class Hotel {
    private int cantHabitaciones;
    
    private Habitacion[] habitaciones;
    
    public Hotel(int cantHabitaciones, double costoFrente, double costoContraFrente){
        this.cantHabitaciones = cantHabitaciones;
       habitaciones = new Habitacion[cantHabitaciones];
        for(int i = 0; i < cantHabitaciones; i++){
            if ((i + 1) % 2 == 0){
                habitaciones[i] = new Habitacion(costoFrente);
            }else{
                habitaciones[i] = new Habitacion(costoContraFrente);
            }
        }
    }
    
    public void ingresarCliente(Cliente cliente, int numHabitacion){
        habitaciones[numHabitacion - 1].ocupar(cliente);
    }
    
    public void aumentarCostoGlobal(double costo){
        for(int i = 0; i < cantHabitaciones; i++){
            habitaciones[i].aumentarCosto(costo);
        }
    }
    
    @Override
    public String toString(){
        String completo = "";
        for(int i = 0; i < cantHabitaciones; i++){
            completo = completo + "Habitacion " + (i + 1) + ", " + habitaciones[i].toString() + "\n";
        }
        
        return completo;
    }
}
