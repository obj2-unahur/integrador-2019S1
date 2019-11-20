package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;

public class PaqueteCuyo implements Paquete{
    List<Dia> dias;
    Dia dia1;
    Dia dia2;
    Dia dia3;

    public void addDias(Dia dia) {
        dias.add(dia);
    }

    @Override
    public void imprimir() {
        this.imprimirItinerario();
    }

    @Override
    public String ida() {
        return this.getTransporteIda();
    }

    @Override
    public String vuelta() {
        return getTransporteVuelta();
    }

    public String getNombre() {
        return "Paquete Cuyo";
    }

    public void imprimirItinerario() {
        print("Nombre: " + getNombre());
        print("Transporte Ida: " + ida());
        dia1= new Dia(1,"Visita ciudad Calafate");
        dia2= new Dia(2," Visita Glaciar Perito Moreno" );
        dia3= new Dia(3, "Naveción Glaciares");

        dias.add(dia1);
        dias.add(dia2);
        dias.add(dia3);
        print("Dia 1: " + getDia1());
        print("Dia 2: " + getDia2());
        print("Dia 3: " + getDia3());
        print("Transporte Vuelta: " + vuelta());
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
