package ut3FundaPOO.exaut3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
    @DisplayName("Prueba 1 (2 puntos): Constructor de Curso")
    void testConstructorCurso() {

        Curso curso =
                new Curso(
                        "Programación Java",
                        120,
                        450.0);

        assertEquals(
                "Programación Java",
                curso.getNombre());

        assertEquals(
                120,
                curso.getHoras());

        assertEquals(
                450.0,
                curso.getPrecio());
    }

    @Test
    @DisplayName("Prueba 2 (2 puntos): Alumno matriculado en un curso")
    void testMatricularCurso() {

        Curso curso =
                new Curso(
                        "Bases de Datos",
                        100,
                        400.0);

        Alumno alumno =
                new Alumno(
                        "Ana",
                        "ana@gmail.com");

        alumno.matricularCurso(curso);

        assertNotNull(
                alumno.getCurso());

        assertEquals(
                "Bases de Datos",
                alumno.getCurso().getNombre());
    }

    @Test
    @DisplayName("Prueba 3 (2 puntos): Registro de alumno en academia")
    void testRegistrarAlumno() {

        Alumno alumno =
                new Alumno(
                        "Juan",
                        "juan@gmail.com");

        Academia academia =
                new Academia(
                        "Campus FP",
                        "Madrid");

        academia.registrarAlumno(alumno);

        assertNotNull(
                academia.getAlumno());

        assertEquals(
                "Juan",
                academia.getAlumno().getNombre());
    }

    @Test
    @DisplayName("Prueba 4 (2 puntos): Relación completa Academia -> Alumno -> Curso")
    void testRelacionCompleta() {

        Curso curso =
                new Curso(
                        "Programación",
                        150,
                        500.0);

        Alumno alumno =
                new Alumno(
                        "Laura",
                        "laura@gmail.com");

        alumno.matricularCurso(curso);

        Academia academia =
                new Academia(
                        "IES Virtual",
                        "Valencia");

        academia.registrarAlumno(alumno);

        assertEquals(
                "Laura",
                academia.getAlumno().getNombre());

        assertEquals(
                "Programación",
                academia.getAlumno()
                         .getCurso()
                         .getNombre());

        assertEquals(
                150,
                academia.getAlumno()
                         .getCurso()
                         .getHoras());
    }

    @Test
    @DisplayName("Prueba 5 (2 puntos): Variable static totalCursos")
    void testVariableStatic() {

        int totalInicial =
                Curso.getTotalCursos();

        new Curso(
                "Java",
                120,
                450.0);

        new Curso(
                "SQL",
                80,
                300.0);

        new Curso(
                "Python",
                100,
                350.0);

        assertEquals(
                totalInicial + 3,
                Curso.getTotalCursos());
    }

}
