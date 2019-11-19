package ar.edu.unahur.obj2.ejercicio1.Paquetes;

import ar.edu.unahur.obj2.ejercicio1.Itinerario;

public abstract class Paquete  implements Itinerario {

    public void imprimirItinerario() {
        print("Nombre: " + nombre());
        print("Transporte Ida: " + transporteIda());
        print("Dia 1: " + dia1());
        print("Dia 2: " + dia2());
        print("Dia 3: " + dia3());
        print("Transporte Vuelta: " + transporteVuelta());
    }

    protected abstract String nombre();
    protected abstract String transporteIda();
    protected abstract String dia1();
    protected abstract String dia2();
    protected abstract String dia3();
    protected abstract String transporteVuelta();
    public void print(String texto) {
        System.out.println(texto);
    }
}
