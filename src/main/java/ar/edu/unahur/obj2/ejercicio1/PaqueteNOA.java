package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;
import java.lang.String;

public class PaqueteNOA implements Paquete{
    List<Dia> dias;
    Dia dia1;
    Dia dia2;
    Dia dia3;

    public void addDias(Dia dia) {
        dias.add(dia);
    }

    @Override
    public void imprimir() {
        this.itinerario();
    }

    @Override
    public String ida() {
        return this.transporteIda();
    }

    @Override
    public String vuelta() {
        return this.transporteVuelta();
    }


    public void itinerario() {
        print("Nombre: " + nombre());

        print("Transporte Ida:" + ida());

        dia1= new Dia(1,dia1());
        dia2= new Dia(2,dia2());
        dia3= new Dia(3, dia3());

        dias.add(dia1);
        dias.add(dia2);
        dias.add(dia3);
        dias.stream().forEach(dia -> dia.toString());

        print("Transporte Vuelta: " + vuelta());
    }

    private String nombre() {
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

    private void print(String texto) {
        System.out.println(texto);
    }
}
