package ar.edu.unahur.obj2.ejercicio1.Paquetes;

public class PaqueteCuyo extends Paquete{


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
