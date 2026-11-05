package ut3FundaPOO;

public class ClaseCoche {
	/*atributos en min y privados*/
	private String sColor;
	private int iVelocidad;
	private double dTamanyo;

	/*constructor para poder construir los objetos: públicos*/
	public ClaseCoche(String paramColorCoche, int paramVelCoche, double paramTamanyo) {
	
		this.sColor = paramColorCoche;
		this.iVelocidad = paramVelCoche;
		this.dTamanyo = paramTamanyo;
	}
	
	/*Creo el nuevo color que quiero dar al atributo*/
	public void setColor(String elNuevoColorQueQuieroPoner) {
		this.sColor = elNuevoColorQueQuieroPoner;
	}
	
	/*Creo un método para comprobar el color, dado que al ser privado no puedo acceder directamente a ver el color*/
	public String getsColor() {
		return sColor;
	}
	
	/*Repito lo mismo para velocidad*/
	public void setVelocidad(int nVelocidad) {
		this.iVelocidad = nVelocidad;
	}
	
	/*Repito lo mismo para velocidad*/
	public int getsVelocidad() {
		return iVelocidad;
	}
	
	/*Repito lo mismo para velocidad*/
	public void setTamanyo(int nTamanyo) {
		this.dTamanyo = nTamanyo;
	}
	
	/*Repito lo mismo para velocidad*/
	public double getsTamanyo() {
		return dTamanyo;
	}

	@Override
	public String toString() {
		return "ClaseCoche [sColor=" + sColor + ", iVelocidad=" + iVelocidad + ", dTamanyo=" + dTamanyo + "]";
	}
	
	//Métodos propios
	public void acelerar() {
		iVelocidad += 20;
	}
	
	public void tunear(String paramNuevoColor, double dNuevoTamanyo) {
		sColor = paramNuevoColor;
		dTamanyo= dNuevoTamanyo;
	}
}
