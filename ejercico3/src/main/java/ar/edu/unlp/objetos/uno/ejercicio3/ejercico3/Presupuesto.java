package ar.edu.unlp.objetos.uno.ejercicio3.ejercico3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Presupuesto {
	private List<Item> items;
	private LocalDate fecha;
	private String cliente;
	
	public Presupuesto() {
		items = new ArrayList<Item>();
		fecha = LocalDate.now();
		cliente = "";
	}
	
	public Presupuesto(String cliente) {
		this.cliente = cliente;
		items = new ArrayList<Item>();
		this.fecha = LocalDate.now();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item i) {
		items.add(i);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < items.size(); i++) {
			total = total + items.get(i).costo();
		}
		return total;
	}
	
}
