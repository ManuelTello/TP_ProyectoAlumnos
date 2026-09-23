package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej01Jugadores {
    public static void main(String[] args) {
        //Paso 2: Declarar y crear el vector para 15 double
        double[] jugadores = new double[15];        
        double totalAltura = (double)0;
        double alturaPromedio = 0;
        int cantSupPromedio = 0;
        
        //Paso 3: Ingresar 15 numeros (altura), cargarlos en el vector, 
        //        ir calculando la suma de alturas sobre variable auxiliar
        for (int i = 0; i < 15; i++ ){
            jugadores[i] = Lector.leerDouble();
            totalAltura = totalAltura + jugadores[i];
        }
        
        //Paso 4: Calcular el promedio de alturas e informar
        alturaPromedio = totalAltura / 15;
        System.out.println("Altura promedio: " + alturaPromedio);
        
        //Paso 5: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for(int i = 0; i < 15; i++){
            if(jugadores[i] > alturaPromedio){
                cantSupPromedio++;
            }
        }
        
        //Paso 6: Informar la cantidad.
        System.out.println("Cantidad superior a promedio: " + cantSupPromedio);
    }
}