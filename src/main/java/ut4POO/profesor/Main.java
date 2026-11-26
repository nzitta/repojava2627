package ut4POO.profesor;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Calendar fecha = Calendar.getInstance();
        fecha.set(2024, Calendar.SEPTEMBER, 1);

        ProfesorInterino p1 = new ProfesorInterino("11111111A", "Ana", "Lopez Ruiz", 30, Asignaturas.PROGRAMACION, fecha);
        ProfesorTitular p2 = new ProfesorTitular("22222222B", "Luis", "Garcia Perez", 45, Asignaturas.BBDD, 10);

        p1.importeNomina(1500, 200);
        p2.importeNomina(1500, 200);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Cobran lo mismo? " + p1.equals(p2));
    }
}