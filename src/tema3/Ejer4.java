package tema3;

import PaqueteLectura.GeneradorAleatorio;

public class Ejer4 {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        
        Hotel hotel = new Hotel(5, (double)100, (double)500);
        Cliente cliente1 = new Cliente(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(100000),GeneradorAleatorio.generarInt(100));
        Cliente cliente2 = new Cliente(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(100000),GeneradorAleatorio.generarInt(100));
        Cliente cliente3 = new Cliente(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(100000),GeneradorAleatorio.generarInt(100));
        
        hotel.ingresarCliente(cliente1,1);
        hotel.ingresarCliente(cliente2,5);
        hotel.ingresarCliente(cliente3,3);
        
        System.out.println(hotel.toString());
        
        hotel.aumentarCostoGlobal((double)2000);
        
        System.out.println(hotel.toString());
    }
}
