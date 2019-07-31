package ar.edu.unahur.obj2.ejercicio1;

public class PaqueteCuyo {


    public String getNombre() {
        return "Paquete Cuyo";
    }

    public void imprimirItinerario() {
        print("Nombre: " + getNombre());
        print("Transporte Ida: " + getTransporteIda());
        print("Dia 1: " + getDia1());
        print("Dia 2: " + getDia2());
        print("Dia 3: " + getDia3());
        print("Transporte Vuelta: " + getTransporteVuelta());
    }

    private void print(String texto) {
        System.out.println(texto);
    }


    protected String getTransporteIda() {
        return "Traslado desde el aeropuerto de Mendoza al hotel San Martin";
    }

    protected String getDia1() {
        return "Visita ciudad de Mendoza";
    }

    protected String getDia2() {
        return "Circuito Vitivinicola";
    }

    protected String getDia3() {
        return "Visita chapelco";
    }

    protected String getTransporteVuelta() {
        return "Traslado desde el hotel San Martin al aeropuerto de Mendoza";
    }

}
