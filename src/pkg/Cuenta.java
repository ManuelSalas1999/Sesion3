package pkg;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(Double i) {
	this.saldo=i;
	}

	public void ingresar(int i) {
saldo += i;		
	}
	public void retirar(int i) {
saldo -=i;		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}



}
