package ut4POO.electrodomesticos;

public class Electrodomestico {
	// CONSTANTES
	protected static final String MARCA_BASE="bosch";
	protected static final String MODELO_BASE ="7200";
	protected static final String COLOR_BASE="gris";
	protected static final int HORAS_BASE=1;
	protected static final int DIAS_BASE=3;
	protected static final double PRECIO_ELECTRO_BASE=400;
	protected static final double POTENCIA_BASE=2300;
	protected static final double PRECIO_ENERGIA_BASE=0.40397;

	//ATRIBUTOS
	private String sMarca;
	private String sModel; 
	private String sColor;
	protected int iHoras;
	protected int iDias;
	protected double dPrecioEnergia;
	protected double dPotencia;
	private double dPrecioElectrodom;
	
	//Constructor vacío
	public Electrodomestico() {
	    this(MARCA_BASE, MODELO_BASE, COLOR_BASE,
	         PRECIO_ELECTRO_BASE, HORAS_BASE, DIAS_BASE,
	         PRECIO_ENERGIA_BASE, POTENCIA_BASE);
	}
	
	//Constructor con todos los campos
	public Electrodomestico(String sMarca, String sModel, String sColor, double dPrecioElectrodom, int iHoras, int iDias, double dPrecioEnergia,
			double dPotencia) {
		super();
		this.sMarca = sMarca;
		this.sModel = sModel;
		this.dPrecioElectrodom = dPrecioElectrodom; 
		this.sColor = sColor;
		this.iHoras = iHoras;
		this.iDias = iDias;
		this.dPrecioEnergia = dPrecioEnergia;
		this.dPotencia = dPotencia;
	}
	
	public double consumoAnual() {
		return (this.dPotencia/1000)*iHoras+iDias;
	}	
}
