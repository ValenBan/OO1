package ar.edu.unlp.objetos.uno.ejercicio8.ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios;
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public void agregarUsuario (Usuario usuario){
		this.usuarios.add(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	public Double getPrecioKW() {
		return this.precioKWh;
	}
	
	public void setPrecioKWh (double precio) {
		this.precioKWh = precio;
		
	}
	
	public List<Factura> facturar(){
		return usuarios.stream()
					   .map(usuario -> usuario.facturaEnBaseA(this.getPrecioKW())).collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream().mapToDouble(usuario -> usuario.ultimoConsumoActiva()).sum();
	}
}
