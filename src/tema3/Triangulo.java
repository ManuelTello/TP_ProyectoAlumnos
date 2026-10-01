package tema3;

public class Triangulo {
    private double lado1;
    
    private double lado2;
    
    private double lado3;
    
    private String relleno;
    
    private String colorLinea;
    
    public Triangulo(double lado1, double lado2, double lado3, String relleno, String colorLinea){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.relleno = relleno;
        this.colorLinea = colorLinea;
    }
    
    public String getRelleno(){
        return relleno;
    }
    
    public String getColorLinea(){
        return colorLinea;
    }
    
    public double getLado1(){
        return lado1;
    }
       
    public double getLado2(){
        return lado2;
    }
        
    public double getLado3(){
        return lado3;
    }       
    
    public void setRelleno(String relleno){
        this.relleno = relleno;
    }
    
    public void setColorLinea(String colorLinea){
        this.colorLinea = colorLinea;
    }
    
    public void setLado1(double lado){
        lado1 = lado;
    }
    
    public void setLado2(double lado){
        lado2 = lado;
    }
        
    public void setLado3(double lado){
        lado3 = lado;
    }
    
    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
    public double calcularArea(){
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}

