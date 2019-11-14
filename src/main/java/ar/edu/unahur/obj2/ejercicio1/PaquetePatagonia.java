package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;

public class PaquetePatagonia implements Paquete{
    List<Dia> dias;
    Dia dia1;
    Dia dia2;
    Dia dia3;


    public void addDias(Dia dia) {
        dias.add(dia);
    }

    public void getItinerario() {
        print("Nombre: Paquete Patagonia");
        ida();
        dia1= new Dia(1,"Visita ciudad Calafate");
        dia2= new Dia(2," Visita Glaciar Perito Moreno" );
        dia3= new Dia(3, "Naveción Glaciares");

        dias.add(dia1);
        dias.add(dia2);
        dias.add(dia3);

        dias.stream().forEach(dia -> dia.toString());
        vuelta();
    }

    private void print(String texto) {
        System.out.println(texto);
    }

    @Override
    public void imprimir() {
        this.getItinerario();
    }

    @Override
    public String ida() {
        return ("Transporte Ida: Traslado desde el aeropuerto de El calafate al hotel Huemul");
    }

    @Override
    public String vuelta() {
        return ("Transporte Vuelta: Traslado del hotel Huemul al aeropuerto de El Calafate ");
    }

}
