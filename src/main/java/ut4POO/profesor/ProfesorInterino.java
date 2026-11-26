package ut4POO.profesor;

import java.util.Calendar;

public class ProfesorInterino extends Profesor {

    private Calendar fechaInicioInterinidad;

    public ProfesorInterino(String dniProfesor, String nombre, String apellidos, int edad, Asignaturas modulo, Calendar fechaInicioInterinidad) {
        super(dniProfesor, nombre, apellidos, edad, modulo);
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    // se quitan 100 euros siempre
    public void importeNomina(float sueldoBase, float complementos) {
        float total = sueldoBase + complementos - 100;
        setNomina(total);
    }

    public Calendar getFechaInicioInterinidad() {
        return fechaInicioInterinidad;
    }

    public void setFechaInicioInterinidad(Calendar fecha) {
        fechaInicioInterinidad = fecha;
    }

    public String toString() {
        int dia = fechaInicioInterinidad.get(Calendar.DAY_OF_MONTH);
        int mes = fechaInicioInterinidad.get(Calendar.MONTH) + 1;
        int anio = fechaInicioInterinidad.get(Calendar.YEAR);
        return super.toString() + " Inicio interinidad: " + dia + "/" + mes + "/" + anio;
    }
}