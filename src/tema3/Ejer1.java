package tema3;

public class Ejer1 {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(40.0,50.0,30.0,"rojo","negro");
        Circulo circulo = new Circulo(50.0,"verde","blanco");
        
        System.out.println("Perimetro de triangulo " + triangulo.calcularPerimetro());
        System.out.println("Area de triangulo " + triangulo.calcularArea());
        System.out.println("Perimetro de circulo " + circulo.calcularPerimetro());
        System.out.println("Area de circulo " + circulo.calcularArea());
    }    
}
