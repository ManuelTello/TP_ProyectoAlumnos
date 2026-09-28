package tema2;

import PaqueteLectura.Lector;

public class Ejer5 {
    public static void main(String[] args) {
        int DMAX = 5;
        int TMAX = 8;
        int dia,turno,cupos,contador,tpos;
        boolean[][] disponibles = new boolean[DMAX][TMAX];
        Persona[][] personas = new Persona[DMAX][TMAX];
        String nombre;
                
        cupos = DMAX * TMAX;
        
        for(int i = 0; i < DMAX; i ++ ){
            for(int j = 0; j < TMAX; j++){
                disponibles[i][j] = true;
            }
        }
        
        nombre = Lector.leerString();
        while(!nombre.equals("zzz") && cupos > 0){
            dia = Lector.leerInt();
            turno = 0;
            while(turno < TMAX && !disponibles[dia][turno])
                turno++;
            
            if(disponibles[dia][turno]){
                personas[dia][turno] = new Persona(nombre,dia,turno);
                disponibles[dia][turno] = false;
            }else{
                System.out.println("No hay mas turnos disponibles para este dia");
            }
            
            nombre = Lector.leerString();
        }
        
        for(int i = 0; i < DMAX; i ++){
            contador = 0;
            tpos = 0;
            while(!disponibles[i][tpos] && tpos < TMAX){
                System.out.println(personas[i][tpos].getNombre());
                contador++;
                tpos++;
            }
            
            System.out.println("Dia" + (i + 1) +" cantidad de personas " + contador);
        }
    }
}