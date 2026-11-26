package ut4POO.profesor;

public class ProfesorTitular extends Profesor {

    private int aniosAntiguedad;

    public ProfesorTitular(String dniProfesor, String nombre, String apellidos, int edad, Asignaturas modulo, int aniosAntiguedad) {
        super(dniProfesor, nombre, apellidos, edad, modulo);
        this.aniosAntiguedad = aniosAntiguedad;
    }

    // 10 euros menos por cada año
    public void importeNomina(float sueldoBase, float complementos) {
        float total = sueldoBase + complementos - (aniosAntiguedad * 10);
        setNomina(total);
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public String toString() {
        return super.toString() + " Antiguedad: " + aniosAntiguedad;
    }
}