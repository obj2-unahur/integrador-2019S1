package ar.edu.unahur.obj2.ejercicio1;

public class Dia {
    private int dia;
    private String itinerario;

    public Dia(int dia , String itinerario) {
        this.dia = dia;
        this.itinerario = itinerario;
    }

    @Override
    public String toString() {
        return "Dia{" +
                "dia=" + dia +
                ", itinerario='" + itinerario + '\'' +
                '}';
    }
}
