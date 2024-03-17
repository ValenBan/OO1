package ar.edu.unlp.objetos.uno.ejercicio9.ejercicio9;

public abstract class Cuenta  {
	
	private double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer(double monto) {
		boolean result = false;
		if(this.puedeExtraer(monto)){
			this.extraerSinControlar(monto);
			result = true;
		}
		return result;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		boolean result = false;
		if(this.puedeExtraer(monto)) {
			extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			result = true;
		}
		return result;
	}
	
	protected abstract boolean puedeExtraer (double monto);
	
}
