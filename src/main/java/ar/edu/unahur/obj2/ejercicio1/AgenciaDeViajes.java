package ar.edu.unahur.obj2.ejercicio1;

public class AgenciaDeViajes {

    private PaqueteCuyo paqueteCuyo;
    private PaqueteNOA paqueteNOA;
    private PaquetePatagonia paquetePatagonia;

    public AgenciaDeViajes(PaqueteCuyo paqueteCuyo, PaqueteNOA paqueteNOA, PaquetePatagonia paquetePatagonia) {
        this.paqueteCuyo = paqueteCuyo;
        this.paqueteNOA = paqueteNOA;
        this.paquetePatagonia = paquetePatagonia;
    }

    public void catalogoDePaquetes() {
        paqueteCuyo.imprimirItinerario();
        paqueteNOA.itinerario();
        paquetePatagonia.getItinerario();
    }


}
