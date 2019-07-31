package ar.edu.unahur.obj2.ejercicio2;

public class MotorInyeccion implements Motor {

    private long rpm;
    private boolean encendido;

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void acelerar(long rpmIncrementados) {
        this.rpm +=rpmIncrementados;
    }

    public void frenar(long rpmDecrementados) {
        this.rpm -=rpmDecrementados;
    }

    public boolean encendido() {
        return encendido;
    }

    public long rpm() {
        return rpm;
    }
}
