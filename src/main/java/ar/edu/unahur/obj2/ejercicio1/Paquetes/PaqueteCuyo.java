package ar.edu.unahur.obj2.ejercicio1.Paquetes;

public class PaqueteCuyo extends Paquete{

    public void imprimirItinerario() {
        print("Nombre: " + nombre());
        print("Transporte Ida: " + transporteIda());
        print("Dia 1: " + dia1());
        print("Dia 2: " + dia2());
        print("Dia 3: " + dia3());
        print("Transporte Vuelta: " + transporteVuelta());
    }

    @Override
    protected String nombre() {
        return "Paquete Cuyo";
    }

    @Override
    protected String transporteIda() {
        return "Traslado desde el aeropuerto de Mendoza al hotel San Martin";
    }

    @Override
    protected String dia1() {
        return "Visita ciudad de Mendoza";
    }

    @Override
    protected String dia2() {
        return "Circuito Vitivinicola";
    }

    @Override
    protected String dia3() {
        return "Visita chapelco";
    }

    @Override
    protected String transporteVuelta() {
        return "Traslado desde el hotel San Martin al aeropuerto de Mendoza";
    }
}
