package ut3FundaPOO;

public class Contador {
	//Variable estática común a todos los objetos, sólo se guarda 1 vez para todos los objetos
	static int contadorLocalStatic = 0;

	public Contador() {
		//Quiero que cada vez que cree un objeto tipo Contador se incremente la variable
		contadorLocalStatic++;
		System.out.println("En el constructor de Contador y vale ="+contadorLocalStatic);
	}

	@Override
	public String toString() {
		return "contadorLocalStatic ="+contadorLocalStatic;
	}
	
	
	
	
}
