package ut4POO.electrodomesticos;

public class Television extends Electrodomestico {
	private static final int RESOLUCION_BASE = 30;
	//Atributos
	private int iResolucion;
	
	public Television() {
		this(RESOLUCION_BASE);
	}

	public Television(int iResolucion) {
		super();
		this.iResolucion = iResolucion;
	} 
	
	/*Si el televisor tiene una resolución mayor de 50 pulgadas
	 * aplicar tasa adicional de 30€ al consumo*/
	public double consumoAnual() {
		double dConsumo = super.consumoAnual();
		dConsumo = (iResolucion> 50) ? dConsumo+=30:dConsumo;
		return dConsumo;
	}
	
	
}
