package ut4POO.profesor;

public abstract class Profesor {
	private String dniProfesor;
    private String nombre;
    private String apellidos;
    private int edad;
    private float nomina;
    private Asignaturas modulo;

    public Profesor(String dniProfesor, String nombre, String apellidos, int edad, Asignaturas modulo) {
        this.dniProfesor = dniProfesor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.modulo = modulo;
    }

    public abstract void importeNomina(float sueldoBase, float complementos);

    public float getNomina() {
        return nomina;
    }

    public void setNomina(float nomina) {
        this.nomina = nomina;
    }

    public boolean equals(Object obj) {
        Profesor otro = (Profesor) obj;
        if (nomina == otro.getNomina()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "DNI: " + dniProfesor + " Nombre: " + nombre + " " + apellidos + " Edad: " + edad
                + " Modulo: " + modulo + " Nomina: " + nomina;
    }
}
