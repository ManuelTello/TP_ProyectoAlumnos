package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;

public class Ej02Matrices {

    public static void main(String[] args) {
        //Paso 2. iniciar el generador aleatorio     
        GeneradorAleatorio.iniciar();
        int sumaFila1 = 0;
        
        //Paso 3. definir y crear la matriz de enteros de 5x5, iniciarla con nros. aleatorios 
        int[][] matriz = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = GeneradorAleatorio.generarInt(31);
            }
        }
        
        //Paso 4. mostrar el contenido de la matriz en consola
        for(int i = 0; i < 5; i++){
            System.out.println(i);
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + ", ");
            }
            System.out.println();
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        for(int i = 0; i < 5; i++ ){
            sumaFila1 = sumaFila1 + matriz[1][i];
        }
        System.out.println("Suma de la fila 1: " + sumaFila1);
        
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        int[] vector = new int[5];
        for(int i = 0; i < 5; i++){
            int total = 0;
            for(int j = 0; j < 5; j++){
                total = total + matriz[i][j];
            }
            vector[i] = total;
        }
          
        for(int i = 0; i < 5; i++){
            System.out.println("Posicion " + i + " valor " + vector[i]);
        }
        
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. 
        //        En caso de encontrarse indique su ubicación (fila y columna)
        //        y en caso contrario imprima "No se encontró el elemento".
        int valor = GeneradorAleatorio.generarInt(31);
        boolean seEncontro = false;
        int f = 0; 
        int c = 0;
        
        while(f < 5 && !seEncontro){
            c = 0;
            while(c < 5 && !seEncontro){
                if(matriz[f][c] == valor){
                    seEncontro = true;
                }else {
                    c++;
                }
            }
            if(!seEncontro){
                f++;
            }
        }
        
        if(seEncontro){
            System.out.println("Se encontro el valor " + valor + " en fila " + f + ", columna " + c);
        }else{
            System.out.println("No se encontro el valor " + valor);
        }
    }
}
