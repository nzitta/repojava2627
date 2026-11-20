    # EXAMEN UT3-POO: Academia de Formación

## Instrucciones

Crea un nuevo archivo de tipo **README.md** y copia este contenido en la pestaña **Markdown source**. Puedes comprobar el resultado en la pestaña **Preview**.

---

# Objetivo

Desarrollar una aplicación Java utilizando los principios de la **Programación Orientada a Objetos (POO)**.

La aplicación permitirá simular una academia donde un alumno puede matricularse en un curso y quedar registrado en una academia.

Todas las clases deberán pertenecer al siguiente paquete:

```java
package ut3FundaPOO.exaut3;
```

---

# Requisitos

Se deberán implementar las siguientes clases:

- `Curso`
- `Alumno`
- `Academia`

---

# Diagrama de clases

```text
┌─────────────────────────────────────┐
│              Academia               │
├─────────────────────────────────────┤
│ Atributos                           │
│ - nombre : String                   │
│ - ciudad : String                   │
│ - alumno : Alumno                   │
├─────────────────────────────────────┤
│ Métodos                             │
│ + Academia(                         │
│     nombre:String,                  │
│     ciudad:String)                  │
│ + registrarAlumno(                  │
│     alumno:Alumno) : void           │
│ + getNombre() : String              │
│ + getCiudad() : String              │
│ + getAlumno() : Alumno              │
│ + toString() : String               │
└─────────────────┬───────────────────┘
                  │ contiene
                  ▼
┌─────────────────────────────────────┐
│               Alumno                │
├─────────────────────────────────────┤
│ Atributos                           │
│ - nombre : String                   │
│ - email : String                    │
│ - curso : Curso                     │
├─────────────────────────────────────┤
│ Métodos                             │
│ + Alumno(                           │
│     nombre:String,                  │
│     email:String)                   │
│ + matricularCurso(                  │
│     curso:Curso) : void             │
│ + getNombre() : String              │
│ + getEmail() : String               │
│ + getCurso() : Curso                │
│ + toString() : String               │
└─────────────────┬───────────────────┘
                  │ realiza
                  ▼
┌─────────────────────────────────────┐
│               Curso                 │
├─────────────────────────────────────┤
│ Atributos                           │
│ - nombre : String                   │
│ - horas : int                       │
│ - precio : double                   │
│ - totalCursos : int {static}        │
├─────────────────────────────────────┤
│ Métodos                             │
│ + Curso(                            │
│     nombre:String,                  │
│     horas:int,                      │
│     precio:double)                  │
│ + getNombre() : String              │
│ + getHoras() : int                  │
│ + getPrecio() : double              │
│ + getTotalCursos() : int            │
│   {static}                          │
│ + toString() : String               │
└─────────────────────────────────────┘
```

---

# Clase Curso

Representa un curso ofertado por la academia.

## Atributos

```java
private String nombre;
private int horas;
private double precio;

private static int totalCursos;
```

## Constructor

```java
public Curso(String nombre,
             int horas,
             double precio)
```

Cada vez que se cree un objeto `Curso`, deberá incrementarse el atributo estático:

```java
totalCursos++;
```

## Métodos

```java
public String getNombre();

public int getHoras();

public double getPrecio();

public static int getTotalCursos();

public String toString();
```

---

# Clase Alumno

Representa un alumno matriculado en la academia.

## Atributos

```java
private String nombre;
private String email;

private Curso curso;
```

## Constructor

```java
public Alumno(String nombre,
              String email)
```

## Métodos

```java
public void matricularCurso(Curso curso);

public String getNombre();

public String getEmail();

public Curso getCurso();

public String toString();
```

El método `matricularCurso()` almacenará la referencia al curso recibido como parámetro.

---

# Clase Academia

Representa una academia de formación.

## Atributos

```java
private String nombre;
private String ciudad;

private Alumno alumno;
```

## Constructor

```java
public Academia(String nombre,
                String ciudad)
```

## Métodos

```java
public void registrarAlumno(Alumno alumno);

public String getNombre();

public String getCiudad();

public Alumno getAlumno();

public String toString();
```

El método `registrarAlumno()` almacenará la referencia al alumno recibido como parámetro.

---

# Evaluación mediante JUnit

La práctica será corregida automáticamente mediante un conjunto de pruebas **JUnit 5**.

No es necesario crear una clase `Main` ni un método `main()`.

Las pruebas comprobarán:

1. Constructor y getters de la clase `Curso`.
2. Asociación entre `Alumno` y `Curso`.
3. Asociación entre `Academia` y `Alumno`.
4. Relación completa `Academia → Alumno → Curso`.
5. Funcionamiento correcto de la variable estática `totalCursos`.

Cada prueba tendrá un valor de **2 puntos**, obteniendo un máximo de **10 puntos**.

---

# JUnit Test utilizado para la corrección

```java
 package ut3FundaPOO.exaut3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Evaluación:
 *
 * Prueba 1 -> 2 puntos
 * Prueba 2 -> 2 puntos
 * Prueba 3 -> 2 puntos
 * Prueba 4 -> 2 puntos
 * Prueba 5 -> 2 puntos
 *
 * TOTAL -> 10 puntos
 */
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
```

---

# Restricciones

- Todos los atributos deberán ser `private`.
- No se permite el uso de colecciones (`ArrayList`, `LinkedList`, etc.).
- No se permite modificar el nombre de las clases ni de los atributos.
- No se permite modificar los nombres de los métodos indicados.
- El contador estático deberá gestionarse mediante:

```java
private static int totalCursos;
```

- El método:

```java
public static int getTotalCursos()
```

deberá ser estático.

---

# Evaluación automática

Para superar correctamente la práctica es imprescindible:

- Respetar exactamente los nombres de las clases.
- Respetar exactamente los nombres de los atributos.
- Respetar exactamente las firmas de constructores y métodos.
- Mantener todas las clases dentro del paquete:

```java
package ut3FundaPOO.exaut3;
```

Las pruebas automáticas verificarán la creación de objetos, las asociaciones entre clases, el funcionamiento de la variable estática y el correcto acceso a los datos mediante los getters.
 
  