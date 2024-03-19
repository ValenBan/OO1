package ar.edu.unlp.objetos.uno.ejercicio11.ejercicio11;

import java.util.ArrayList;
import java.util.List;

public class Inversor{
    private String nombre;
    private List<Inversion> inversiones;
    
    public Inversor(String nombre){
        this.nombre = nombre;
        
        inversiones = new ArrayList<Inversion>();
    }
    
    public void addInversion(Inversion inv){
        inversiones.add(inv);
    }
    
    public double valorActual(){
        return inversiones.stream().mapToDouble(inv -> inv.valorActual()).sum();
    }
}

