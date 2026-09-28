package tema2;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class Ejer3 {
    public static void main(String[] args) {
        Persona[][] puestos;
        boolean[][] dispuestos;
        String nombre;
        int dia,turno,cupos;
        int MDIAS = 5;
        int MTURNOS = 8;
        
        GeneradorAleatorio.iniciar();
        
        puestos = new Persona[MDIAS][MTURNOS];
        dispuestos = new boolean[MDIAS][MTURNOS];
        cupos = 40;
        
        for(int i = 0; i < MDIAS; i ++ ){
            for(int j = 0; j < MTURNOS; j++){
                dispuestos[i][j] = true;
            }
        }
        
        nombre = Lector.leerString();
        while(!nombre.equals("zzz") && cupos > 0){
            dia = Lector.leerInt() - 1;
            turno = Lector.leerInt() - 1;
            if(dispuestos[dia][turno]){
                puestos[dia][turno] = new Persona(nombre,GeneradorAleatorio.generarInt(20),GeneradorAleatorio.generarInt(20));
                dispuestos[dia][turno] = false;
                cupos--;
            }else{
                System.out.println("Este puesto esta ocupado.");
            }
            nombre = Lector.leerString();
        }
        
        for(int i = 0; i < MDIAS; i ++ ){
            System.out.println("-------------- Dia " + (i + 1) + " --------------");
            for(int j = 0; j < MTURNOS; j++){
                if(!dispuestos[i][j]){
                    System.out.println("Puesto " + j + " esta ocupado por " + puestos[i][j].getNombre());
                }else{
                    System.out.println("Puesto " + j +" esta libre.");
                }
            }
        }
    }
}
