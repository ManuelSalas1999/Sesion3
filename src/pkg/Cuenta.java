package pkg;
import java.util.ArrayList;
import java.util.List;
public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
    private List<Movimiento> movimientos;
    
    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
        this.movimientos = new ArrayList<>();
    }

    public void ingresar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        registrarMovimiento("Ingreso", Signo.H, cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        registrarMovimiento("Retiro", Signo.D, cantidad);
    }

    private void registrarMovimiento(String detalle, Signo signo, double cantidad) {
        double factor = (signo == Signo.H) ? 1 : -1;
        saldo += factor * cantidad;
        movimientos.add(new Movimiento(detalle, signo, cantidad));
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
