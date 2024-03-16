package ar.edu.unlp.objetos.uno.ejercicio3.ejercico3;

public class Item {
	private String detalle;
	private double costoUnitario;
	private int cantidad;
	
	public Item() {
		
	}
	public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.costoUnitario = costoUnitario;
		this.cantidad = cantidad;
	}
	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public double costo() {
		return cantidad * costoUnitario;
	}
}
