package ar.edu.unahur.obj2.ejercicio1;

import ar.edu.unahur.obj2.ejercicio1.Paquetes.PaqueteCuyo;
import ar.edu.unahur.obj2.ejercicio1.Paquetes.PaqueteNOA;
import ar.edu.unahur.obj2.ejercicio1.Paquetes.PaquetePatagonia;
import org.testng.annotations.BeforeTest;

public class AgenciaDeViajesTest {

    private PaquetePatagonia paquetePatagonia;
    private PaqueteCuyo paqueteCuyo;
    private PaqueteNOA paqueteNOA;
    private AgenciaDeViajes agenciaDeViajes;


    @BeforeTest
    public void setup() {
        paquetePatagonia = new PaquetePatagonia();
        paqueteCuyo = new PaqueteCuyo();
        paqueteNOA = new PaqueteNOA();
        agenciaDeViajes = new AgenciaDeViajes();
    }

    @org.testng.annotations.Test
    public void testCatalogoDePaquetes() {
        agenciaDeViajes.catalogoDePaquetes();
    }
}