package tema2;

import PaqueteLectura.GeneradorAleatorio;

public class Ejer2 {
    public static void main(String[] args) {
        int diml,personasMayores,limite;
        Persona[] personas = new Persona[15];
        Persona actual;
        Persona personaMenorDni;
        
        GeneradorAleatorio.iniciar();
        
        diml = 0;
        personasMayores = 0;
        limite = 101;
        personaMenorDni = new Persona("",99999,0);
        
        actual = new Persona(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(20) + 1,GeneradorAleatorio.generarInt(limite));
        while( diml < 15 && actual.getEdad() != 0){
            personas[diml] = actual;
            if(personas[diml].getEdad() > 65){
                personasMayores++;
            }
            
            if(personas[diml].getDNI() < personaMenorDni.getDNI()){
                personaMenorDni = personas[diml];
            }
            
            diml++;
            actual = new Persona(GeneradorAleatorio.generarString(10),GeneradorAleatorio.generarInt(20) + 1,GeneradorAleatorio.generarInt(limite));
        }
        
        for(int i = 0; i < diml ; i++){
            Persona a = personas[i];
            System.out.println(i + "  Nombre:" + a.getNombre() + ", edad:"+ a.getEdad() + ", dni:" + a.getDNI());
        }
        
        System.out.println("Personas mayores a 65 " + personasMayores);
        System.out.println("Nombre:" + personaMenorDni.getNombre() + ", edad:"+ personaMenorDni.getEdad() + ", dni:" + personaMenorDni.getDNI());
    }
}
