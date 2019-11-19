package ar.edu.unahur.obj2.ejercicio1;

import ar.edu.unahur.obj2.ejercicio1.Paquetes.Paquete;


import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {

    private List<Paquete> paquetes = new ArrayList<>();

    public AgenciaDeViajes() {
        this.paquetes = paquetes;
    }

    public void agregarPaquete(Paquete paquete){
        paquetes.add(paquete);
    }

    public void catalogoDePaquetes() {
        paquetes.forEach(p -> p.imprimirItinerario());
    }


}
