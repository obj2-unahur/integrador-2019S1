package ar.edu.unahur.obj2.ejercicio2;

public class Automotriz {

    public void probarEncender(Motor motor) {
        if (motor.encendido()) {
            throw new RuntimeException("Motor encendido");
        }
        motor.encender();
    }

    public void probarApagar(Motor motor) {
        if (motor.encendido()) {
            throw new RuntimeException("Motor apagado");
        }
        motor.apagar();
    }

    public void probarAceleracion(Motor motor, long rpmIncrementado) {
        if (motor.encendido()) {
            throw new RuntimeException("Motor encendido");
        }
        motor.encender();
        motor.acelerar(rpmIncrementado);
    }

    public void probarFrenado(Motor motor, long rpmIncrementado, long rpmDecrementado) {
        if (motor.encendido()) {
            throw new RuntimeException("Motor encendido");
        }
        motor.encender();
        motor.acelerar(rpmIncrementado);
        motor.frenar(rpmDecrementado);
    }

}
