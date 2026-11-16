package ut3FundaPOO.simula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	@Test
    @DisplayName("Prueba 1 (2 puntos): Constructor de Videojuego")
    void testConstructorVideojuego() {

        Videojuego videojuego =
                new Videojuego(
                        "Minecraft",
                        "PC",
                        29.99);

        assertEquals("Minecraft",
                videojuego.getTitulo());

        assertEquals("PC",
                videojuego.getPlataforma());

        assertEquals(29.99,
                videojuego.getPrecio());
    }

    @Test
    @DisplayName("Prueba 2 (2 puntos): Cliente compra un videojuego")
    void testCompraVideojuego() {

        Videojuego videojuego =
                new Videojuego(
                        "FC26",
                        "PS5",
                        69.99);

        Cliente cliente =
                new Cliente(
                        "Juan",
                        "juan@gmail.com");

        cliente.comprarVideojuego(videojuego);

        assertNotNull(cliente.getVideojuego());

        assertEquals(
                "FC26",
                cliente.getVideojuego().getTitulo());
    }

    @Test
    @DisplayName("Prueba 3 (2 puntos): Registro de cliente en la tienda")
    void testRegistrarCliente() {

        Cliente cliente =
                new Cliente(
                        "Ana",
                        "ana@gmail.com");

        TiendaVideojuegos tienda =
                new TiendaVideojuegos(
                        "Game Store",
                        "Madrid");

        tienda.registrarCliente(cliente);

        assertNotNull(tienda.getCliente());

        assertEquals(
                "Ana",
                tienda.getCliente().getNombre());
    }

    @Test
    @DisplayName("Prueba 4 (2 puntos): Relación completa Tienda -> Cliente -> Videojuego")
    void testRelacionCompleta() {

        Videojuego videojuego =
                new Videojuego(
                        "Minecraft",
                        "PC",
                        29.99);

        Cliente cliente =
                new Cliente(
                        "Juan",
                        "juan@gmail.com");

        cliente.comprarVideojuego(videojuego);

        TiendaVideojuegos tienda =
                new TiendaVideojuegos(
                        "Game Store",
                        "Madrid");

        tienda.registrarCliente(cliente);

        assertEquals(
                "Minecraft",
                tienda.getCliente()
                      .getVideojuego()
                      .getTitulo());

        assertEquals(
                "Juan",
                tienda.getCliente().getNombre());
    }

    @Test
    @DisplayName("Prueba 5 (2 puntos): Variable static totalVideojuegos")
    void testVariableStatic() {

        int totalInicial =
                Videojuego.getTotalVideojuegos();

        new Videojuego(
                "Minecraft",
                "PC",
                29.99);

        new Videojuego(
                "FC26",
                "PS5",
                69.99);

        new Videojuego(
                "Fortnite",
                "PC",
                0);

        assertEquals(
                totalInicial + 3,
                Videojuego.getTotalVideojuegos());
    }

}
