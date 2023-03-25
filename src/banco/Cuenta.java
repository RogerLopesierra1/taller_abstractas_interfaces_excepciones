package banco;

abstract class Cuenta {
	private String numeroCuenta;
	private double saldo;
	private String propietario;
	
	public Cuenta() {
		
	}

	public Cuenta(String numeroCuenta, double saldo, String propietario) {		
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.propietario = propietario;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public abstract void depositar();
	
	public abstract void retirar();
	
	
}
