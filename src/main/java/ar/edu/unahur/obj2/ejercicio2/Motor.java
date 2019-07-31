package ar.edu.unahur.obj2.ejercicio2;

public interface Motor {

    boolean encendido();
    long rpm();
    void encender();
    void apagar();
    void acelerar(long i);
    void frenar(long l);


}
