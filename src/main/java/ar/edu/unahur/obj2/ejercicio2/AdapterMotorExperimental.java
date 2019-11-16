package ar.edu.unahur.obj2.ejercicio2;

public class AdapterMotorExperimental implements Motor {
    private MotorExperimental motorExperimental;

    @Override
    public boolean encendido() {
        return false;
    }

    @Override
    public long rpm() {
        return 0;
    }

    @Override
    public void encender() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void acelerar(long i) {

    }

    @Override
    public void frenar(long l) {

    }
}

