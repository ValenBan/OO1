package ar.edu.unlp.objetos.uno.ejercicio11.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
    private LocalDate cantDias;
    private double montoDepositado;
    private double porcentajeDeInteresDiario;
    
    //localDate fechaDeConstitucion, 
    public PlazoFijo(LocalDate cantDias, double montoDepositado, double porcentajeDeInteresDiario){
        this.cantDias = cantDias;
        this.montoDepositado = montoDepositado;
        this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
    }
    
    public double valorActual(){
		long dias = ChronoUnit.DAYS.between(this.cantDias, LocalDate.now()); // ESTE ME DA LOS DIAS EN CALENDARIO
		return this.montoDepositado + (montoDepositado * this.porcentajeDeInteresDiario * dias);
    }
    
}
