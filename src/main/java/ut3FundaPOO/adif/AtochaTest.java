package ut3FundaPOO.adif;

public class AtochaTest {

	public static void main(String[] args) {
		Maquinista maq1 = new Maquinista("Pepe", "09090950A", 2.350, "Rango 1");
		Mecanico mec1 = new Mecanico("Juan", "678980978", "Especialidad");
		JefeEstacion jefe1 = new JefeEstacion("Daniel", "09090550A", "10/05/2001");
		Locomotora loc1 = new Locomotora("A1094S", 100, 2009, mec1);
		Tren tren1 = new Tren(loc1, maq1);
		Vagon vag1 = new Vagon(1092, 200, 50, "arroz");
	}
}
