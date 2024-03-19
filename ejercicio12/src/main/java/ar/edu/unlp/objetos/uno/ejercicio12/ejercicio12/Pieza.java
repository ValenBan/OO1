package ar.edu.unlp.objetos.uno.ejercicio12.ejercicio12;

public abstract class Pieza{
    private String material;
    private String color;
    
    public Pieza(String material, String color){
        this.material = material;
        this.color = color;
    }
    
    public String getMaterial() {
    	return material;
    }
    
    public String getColor() {
    	return color;
    
    }
    
    abstract public double getVolumenDeMateria();
    
    public abstract double getSuperficieDeColor();
}
