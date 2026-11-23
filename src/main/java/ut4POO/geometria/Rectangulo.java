package ut4POO.geometria;

public class Rectangulo extends Figura{
	private double base;
	private double altura;
	
	public Rectangulo(double paramBase, double paramAltura) {
		this.base = paramBase;
		this.altura = paramAltura;
	}
	
	public void calcularArea() {
		this.total = base*altura;
	}
}
