package ar.edu.unlp.objetos.uno.ejercicio12.ejercicio12;

public class Cilindro extends Pieza{
    
    private Integer radio;
    private Integer altura;
    
    public Cilindro(String material, String color, Integer radio, Integer altura){
        super(material, color);
        this.radio = radio;
        this.altura = altura;
    }
    
    public double getVolumenDeMateria(){
        return Math.PI * Math.pow(radio, 2) * altura;
    }
    
    public double getSuperficieDeColor(){
        return 2* Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

}
