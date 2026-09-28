package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ejer5 {
    public static void main(String[] args) {
        int[][] clientes = new int[5][4];
        int[]valoraciones = new int[4];
        String[] textos = new String[4];
        int valoracion;
        
        GeneradorAleatorio.iniciar();
        
        textos[0] = "Atencion al cliente ";
        textos[1] = "Calidad de la comida ";
        textos[2] = "Precios ";
        textos[3] = "Ambiente ";
        
        for(int i = 0; i < 5; i++){
            for( int j = 0; j < 4; j++){
                valoracion = GeneradorAleatorio.generarInt(10) + 1;
                clientes[i][j] = valoracion;
                valoraciones[j] = valoraciones[j] + valoracion;
            }
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println("---------------- Cliente " + ( i + 1) + " ----------------");
            for( int j = 0; j < 4; j++){
                System.out.println(textos[j] + clientes[i][j]);
            }
        }
        
        for(int i = 0; i < 4; i++){
            System.out.println(textos[i] + valoraciones[i] / 4);
        }
    }
}