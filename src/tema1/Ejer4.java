package tema1;

import PaqueteLectura.Lector;

public class Ejer4 {
    public static void main(String[] args) {
        int[][] oficinas = new int[8][4];
        int lectura,piso,oficina;
        
        // inicializa la matriz
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 4; j ++){
                oficinas[i][j] = 0;
            } 
        }
                
        lectura = Lector.leerInt();
        while(lectura != 9){
            piso = lectura - 1;
            oficina = Lector.leerInt();
            oficinas[piso][oficina - 1]++;
            lectura = Lector.leerInt();
        }
        
        for(int i = 0; i < 8; i ++){
            System.out.println("-------------- Piso " + (i + 1) + "--------------");
            for(int j = 0; j < 4; j ++){
                System.out.println("Oficina " + (j + 1) + ": " + oficinas[i][j]);
            } 
        }
    }    
}
