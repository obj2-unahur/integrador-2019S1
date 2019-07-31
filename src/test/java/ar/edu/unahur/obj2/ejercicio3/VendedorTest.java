package ar.edu.unahur.obj2.ejercicio3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VendedorTest {

    private Vendedor principiante;
    private Vendedor senior;
    private Vendedor experto;


    @BeforeMethod
    public void setUp() {
        principiante = new Vendedor("PRINCIPIANTE");
        senior = new Vendedor("SENIOR");
        experto = new Vendedor("EXPERTO");
    }

    @Test
    public void testComisionPrincipiante() {
        assertEquals(principiante.comision(100), 10.0);
    }

    @Test
    public void testComisionSenior() {
        assertEquals(senior.comision(100), 20.0);
    }

    @Test
    public void testComisionExperto() {
        assertEquals(experto.comision(100), 40.0);
    }
}