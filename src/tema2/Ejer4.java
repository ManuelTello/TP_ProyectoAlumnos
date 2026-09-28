package tema2;

import PaqueteLectura.Lector;

public class Ejer4 {
    public static void main(String[] args) {
        Persona[][] puestos;
        int DMAX = 2;
        int TMAX = 2;
        int dia,turno;
        String nombre;
        
        puestos = new Persona[DMAX][TMAX];
        dia = 0;
        turno = 0;
        
        /*
        d 0 0 1 2  
        t 0 1 0 0 
        */
        nombre = Lector.leerString();
        while(!nombre.equals("zzz") && dia < DMAX){
            puestos[dia][turno] = new Persona(nombre,dia,turno);
            turno++;
            if(turno == TMAX){
                dia++;
                turno = 0;
            }
            nombre = Lector.leerString();
        }
        
        int i = 0;
        int j = 0;
    }
}
