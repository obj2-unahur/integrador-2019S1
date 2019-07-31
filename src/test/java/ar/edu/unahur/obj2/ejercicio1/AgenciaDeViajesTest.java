package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.*;

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
        agenciaDeViajes = new AgenciaDeViajes(paqueteCuyo, paqueteNOA, paquetePatagonia);
    }

    @org.testng.annotations.Test
    public void testCatalogoDePaquetes() {
        agenciaDeViajes.catalogoDePaquetes();
    }
}