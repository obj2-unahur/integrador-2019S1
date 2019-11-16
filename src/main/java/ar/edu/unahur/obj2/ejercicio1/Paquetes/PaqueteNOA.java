package ar.edu.unahur.obj2.ejercicio1.Paquetes;

public class PaqueteNOA extends Paquete{

    public void imprimirItinerario() {
        print("Nombre: " + nombre());
        print("Transporte Ida:" + transporteIda());
        print("Dia 1: " + dia1());
        print("Dia 2: " + dia2());
        print("Dia 3: " + dia3());
        print("Transporte Vuelta: " + transporteVuelta());
    }

    protected String nombre() {
        return "Paquete NOA";
    }

    protected String transporteIda() {
        return "Traslado desde el aeropuerto de tucuman al hotel Casita de tucuman";
    }

    protected String dia1() {
        return "Visita ciudad de tucuman";
    }

    protected String dia2() {
        return "Traslado en bus a la ciudad de Salta, hotel San Carlos, visita de la ciudad";
    }

    protected String dia3() {
        return "Traslado en bus a la ciudad de Uspallata, hotel Hilton, visita de la ciudad";
    }

    protected String transporteVuelta() {
        return "Traslado desde el hotel Hilton al aeropuerto de san salvador de Jujuy.";
    }


}