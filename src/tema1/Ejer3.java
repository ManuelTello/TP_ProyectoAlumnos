package tema1;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;

public class Ejer3 {
    public static void main(String[] args) {
        int[][] funciones = new int[7][4];
        int diaFuncion,funcionDia,maxDia,maxFun,maxCant;
        
        GeneradorAleatorio.iniciar();
        
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 4; j ++){
                funciones[i][j] = GeneradorAleatorio.generarInt(100);
            }
        }
        
        for(int i = 0; i < 7; i++){
            System.out.println("Dia " + (i + 1));
            for(int j = 0; j < 4; j++){
                System.out.print(funciones[i][j] + ", ");
            }
            System.out.println();
        }
        
        
        diaFuncion = Lector.leerInt();
        for(int i = 0; i < 4; i++){
            System.out.println("Dia " + diaFuncion  + " funcion " + i + ", cantidad " + funciones[diaFuncion][i]);
        }
        
        funcionDia = Lector.leerInt();
        for(int i = 0; i < 7; i ++){
            System.out.println("Dia " + (i + 1) + " funcion " + funcionDia + " cantidad " + funciones[i][funcionDia]);
        }
        
        maxFun = 0;
        maxDia = 0;
        maxCant = -1;
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 4; j++){
                if(funciones[i][j] > maxCant){
                    maxDia = i;
                    maxFun = j;
                    maxCant = funciones[i][j];
                }
            }
        }
        
        System.out.println("Dia maximo " + (maxDia + 1) + ", funcion " + maxFun + " con " + maxCant + " espectadores");
    }
}