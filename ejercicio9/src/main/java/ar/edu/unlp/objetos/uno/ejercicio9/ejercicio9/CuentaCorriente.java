package ar.edu.unlp.objetos.uno.ejercicio9.ejercicio9;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		super();
		this.descubierto = 0;	
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		boolean result = false;
		
		if(this.getSaldo() + descubierto >= monto) {
			result = true;
		}

		return result;
	}
	
	
	
}
