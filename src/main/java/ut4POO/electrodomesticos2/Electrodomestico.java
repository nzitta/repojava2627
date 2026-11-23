package ut4POO.electrodomesticos2;

public class Electrodomestico {
	// CONSTANTES
	protected static final Marca MARCA_BASE=Marca.Bosh;
	protected static final String MODELO_BASE ="7200";
	protected static final String COLOR_BASE="gris";
	protected static final int HORAS_BASE=1;
	protected static final int DIAS_BASE=3;
	protected static final double PRECIO_ELECTRO_BASE=400;
	protected static final double POTENCIA_BASE=2300;
	protected static final double PRECIO_ENERGIA_BASE=0.40397;

	//ATRIBUTOS
	private Marca sMarca;
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
	public Electrodomestico(Marca sMarca, String sModel, String sColor, double dPrecioElectrodom, int iHoras, int iDias, double dPrecioEnergia,
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
	
	public Electrodomestico(Marca sMarca, String sModel, double dPrecioElectrodom) {
		this(sMarca, sModel, COLOR_BASE, dPrecioElectrodom, HORAS_BASE, DIAS_BASE, PRECIO_ENERGIA_BASE, POTENCIA_BASE);
	}

	public double consumoAnual() {
		return (this.dPotencia/1000)*iHoras*iDias*dPrecioEnergia;
	}
	
	public boolean testEquals(Electrodomestico miAspiradora) {
		if (this == miAspiradora)
			return true;
		if (!(miAspiradora instanceof Electrodomestico))
			return false;
		Electrodomestico miLavadora = (Electrodomestico) miAspiradora;
		return Double.compare(this.consumoAnual(), miAspiradora.consumoAnual()) == 0;
	}

	@Override
	public String toString() {
		return "Electrodomestico [sMarca=" + sMarca + ", sModel=" + sModel + ", sColor=" + sColor + ", iHoras=" + iHoras
				+ ", iDias=" + iDias + ", dPrecioEnergia=" + dPrecioEnergia + ", dPotencia=" + dPotencia
				+ ", dPrecioElectrodom=" + dPrecioElectrodom + "]";
	}	
}
