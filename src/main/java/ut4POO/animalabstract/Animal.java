package ut4POO.animalabstract;

abstract class Animal {
	//Método abstracto
	public abstract void hacerSonido();
	
	//Método concreto
	public void moverse() {
		System.out.println("El animal se está moviendo");
	}
} // ------> Fin de la clase Animal

//Clase Perro
class Perro extends Animal {
	@Override
	public void hacerSonido() {
		System.out.println("Guau");
	}
}

//Clase Vaca
class Vaca extends Animal {
	@Override
	public void hacerSonido() {
		System.out.println("Muuu");
	}
}



