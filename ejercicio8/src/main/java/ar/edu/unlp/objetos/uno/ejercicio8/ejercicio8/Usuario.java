package ar.edu.unlp.objetos.uno.ejercicio8.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		facturas = new ArrayList<Factura>();
		consumos = new ArrayList<Consumo>();
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public List<Factura> facturas(){
		return this.facturas;
	}
	
	public void agregarMedicion(Consumo c) {
		consumos.add(c);
	}
	
	public double ultimoConsumoActiva() {
		if(this.ultimoConsumo() != null) {
			return this.ultimoConsumo().getConsumoEnergiaActiva();
		}
		return 0;
	}
	
	public Consumo ultimoConsumo() {
		return this.consumos
				.stream()
				.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	public Factura facturaEnBaseA(double precioKWh) {
		Factura factura;
		Consumo consumo = ultimoConsumo();
		if(consumo == null) {
			factura =  new Factura(0, 0, this);
		}else {
			double descuento = 0;
			if(consumo.factorDePotencia() > 0.8) {
				descuento = 10;
			}
			factura =  new Factura(consumo.costoEnBase(precioKWh), descuento, this);
		}
		facturas.add(factura);
		return factura;
	}
	
}
