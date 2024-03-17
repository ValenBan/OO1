package ar.edu.unlp.objetos.uno.ejercicio9.ejercicio9;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	@Override
	protected boolean puedeExtraer(double monto) {
		boolean result = false;
		
		if(this.getSaldo() >= (monto + (monto * 0.02))) {
			result = true;
		}
		
		return result;
	}
	
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	@Override
	public boolean extraer(double monto) {
		return super.extraer(monto + (monto * 0.02));
	}
	
	@Override
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return super.transferirACuenta(monto * 1.02,cuentaDestino);
	}
}
