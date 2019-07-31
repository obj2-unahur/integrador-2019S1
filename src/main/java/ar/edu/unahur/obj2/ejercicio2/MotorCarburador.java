package ar.edu.unahur.obj2.ejercicio2;

public class MotorCarburador implements Motor {

    private long actualRpm;
    private boolean arrancado;

    public void encender() {
        arrancado = true;
    }

    public void apagar() {
        arrancado = false;
    }

    public void acelerar(long rpmIncrementados) {
        this.actualRpm +=rpmIncrementados;
    }

    public void frenar(long rpmDecrementados) {
        this.actualRpm -=rpmDecrementados;
    }

    public boolean encendido() {
        return arrancado;
    }

    public long rpm() {
        return actualRpm;
    }
}
