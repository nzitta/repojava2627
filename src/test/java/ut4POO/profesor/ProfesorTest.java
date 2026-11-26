    
package ut4POO.profesor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class ProfesorTest {

    private static int pruebasSuperadas = 0;
    private static final int TOTAL_PRUEBAS = 5;

    @Test
    void testCrearProfesorInterino() {

        Calendar fecha = Calendar.getInstance();

        ProfesorInterino p = new ProfesorInterino(
                "111A",
                "Juan",
                "García",
                30,
                Profesor.Asignaturas.PROGRAMACION,
                fecha);

        assertNotNull(p);
        pruebasSuperadas++;
    }

    @Test
    void testNominaInterino() {

        Calendar fecha = Calendar.getInstance();

        ProfesorInterino p = new ProfesorInterino(
                "111A",
                "Juan",
                "García",
                30,
                Profesor.Asignaturas.PROGRAMACION,
                fecha);

        p.importeNomina(2000, 300);

        assertEquals(2200, p.getNomina(), 0.01);

        pruebasSuperadas++;
    }

    @Test
    void testCrearProfesorTitular() {

        ProfesorTitular p = new ProfesorTitular(
                "222B",
                "Ana",
                "López",
                45,
                Profesor.Asignaturas.BBDD,
                10);

        assertNotNull(p);

        pruebasSuperadas++;
    }

    @Test
    void testNominaTitular() {

        ProfesorTitular p = new ProfesorTitular(
                "222B",
                "Ana",
                "López",
                45,
                Profesor.Asignaturas.BBDD,
                10);

        p.importeNomina(2000, 300);

        // 2000 + 300 - (10*10)
        assertEquals(2200, p.getNomina(), 0.01);

        pruebasSuperadas++;
    }

    @Test
    void testEquals() {

        Calendar fecha = Calendar.getInstance();

        ProfesorInterino p1 = new ProfesorInterino(
                "111A",
                "Juan",
                "García",
                30,
                Profesor.Asignaturas.PROGRAMACION,
                fecha);

        ProfesorInterino p2 = new ProfesorInterino(
                "222B",
                "Pedro",
                "Martín",
                40,
                Profesor.Asignaturas.ENTORNOS,
                fecha);

        p1.importeNomina(2000, 300);
        p2.importeNomina(2000, 300);

        assertTrue(p1.equals(p2));

        pruebasSuperadas++;
    }

    @AfterAll
    static void mostrarNotaFinal() {

        double nota = (double) pruebasSuperadas / TOTAL_PRUEBAS * 10;

        System.out.println("\n=================================");
        System.out.println("PRÁCTICAS SUPERADAS: "
                + pruebasSuperadas + "/" + TOTAL_PRUEBAS);
        System.out.println("NOTA FINAL: "
                + String.format("%.2f", nota) + "/10");
        System.out.println("=================================\n");
    }
}