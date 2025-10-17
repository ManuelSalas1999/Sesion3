package pkg;

public class Movimiento {
    private String detalle;
    private Signo signo;
    private double importe;
    

    public Movimiento(String detalle, Signo signo, double importe) {
        this.signo = signo;
        this.detalle = detalle;
        this.importe = importe;
    }
    public Signo getSigno() {
        return signo;
    }

    public void setSigno(Signo signo) {
        this.signo = signo;
    }
    public String getDetalle() {
        return detalle;
    }

    public double getImporte() {
        return importe;
    }
}
