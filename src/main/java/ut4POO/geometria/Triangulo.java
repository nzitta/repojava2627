package ut4POO.geometria;

public class Triangulo extends Figura {
	private double dBase;
	private double dAltura;
	
	public Triangulo(double paramBase, double paramAltura) {
		this.dBase = paramBase;
		this.dAltura = paramAltura;
	}
	
	public void calcularArea() {
		this.total = (dBase*dAltura)/2;
	}
}
