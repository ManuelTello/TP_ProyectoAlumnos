package tema3;

public class Circulo {
    private double radio;
    
    private String relleno;
    
    private String colorLinea;
    
    public Circulo(double radio, String relleno, String colorLinea){
        this.radio = radio;
        this.relleno = relleno;
        this.colorLinea = colorLinea;
    }
    
    public double getRadio(){
        return this.radio;
    }
    
    public String getRelleno(){
        return this.relleno;
    }
    
    public String getColorLinea(){
        return this.colorLinea;
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void setRelleno(String relleno){
        this.relleno = relleno;
    }
    
    public void setColorLinea(String colorLinea){
        this.colorLinea = colorLinea;
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }
    
    public double calcularArea(){
        return Math.PI * (this.radio * 2);
    }
}
