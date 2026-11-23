package ut4POO.geometria;

//extends (para Circulo) recibe toda la información del padre (Figura)
public class Circulo extends Figura {
	private final static double PI = 3.1415;
	private double radio;
	
	public Circulo(double paramRadio) {
		this.radio = paramRadio;
	}
	
	public void calcularArea() {
		this.total = PI*radio*radio;
	}
}
