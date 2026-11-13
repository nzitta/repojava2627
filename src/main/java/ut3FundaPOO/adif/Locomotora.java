package ut3FundaPOO.adif;

public class Locomotora {
	private String matricula;
	private int potencia;
	private int añoFabricacion;
	private Mecanico mec;
	
	public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.añoFabricacion = añoFabricacion;
		this.mec = mec;
	}
	
}
