package tema3;

public class Libro {
	private String titulo;
   
	private Autor primerAutor; 
   
	private String editorial;
   
	private int añoEdicion;
   
	private String ISBN; 
   
	private double precio; 
	  
	public Libro(String unTitulo, String unaEditorial, int unAñoEdicion, Autor unPrimerAutor, String unISBN, double unPrecio){
        this.titulo = unTitulo;
        this.editorial = unaEditorial; 
        this.añoEdicion= unAñoEdicion;
        this.primerAutor = unPrimerAutor;
        this.ISBN =  unISBN;
        this.precio = unPrecio;
    }
    
    public Libro(String unTitulo,  String unaEditorial, Autor unPrimerAutor, String unISBN){
        this.titulo = unTitulo;
        this.editorial = unaEditorial; 
        this.añoEdicion= 2015;
        this.primerAutor = unPrimerAutor;
        this.ISBN =  unISBN;
        this.precio = 100;
    }
    
    public Libro(){}
        
    public String getTitulo(){
        return this.titulo;
    }
  
    public String getEditorial(){
        return this.editorial;
    }
	
    public int getAñoEdicion(){
        return this.añoEdicion;
    }
  
    public Autor getPrimerAutor(){
        return this.primerAutor;
    } 
	
    public String getISBN(){
        return this.ISBN;
    } 
	
    public double getPrecio(){
        return this.precio;
    }
   
    public void setTitulo(String unTitulo){
        this.titulo = unTitulo;
    }
   
    public void setEditorial(String unaEditorial){
        this.editorial = unaEditorial;
    }
    public void setAñoEdicion(int unAño){
        this.añoEdicion = unAño;
    }
   
    public void setPrimerAutor(Autor unPrimerAutor){
        this.primerAutor = unPrimerAutor;
    } 
	
    public void setISBN(String unISBN){
        this.ISBN = unISBN;
    } 
	
    public void setPrecio(double unPrecio){
        this.precio = unPrecio;
    }
	
    private double calcularPrecionConIVA(){
	return this.precio + ((21 * this.precio) / 100);
    }
   
    @Override
    public String toString(){
        String aux = titulo + " por " + primerAutor + " - " + añoEdicion + " - " + " ISBN: " + ISBN + ".$" + this.calcularPrecionConIVA();
        return(aux);
    }   
}