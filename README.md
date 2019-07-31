# Integrador 2019 S1

El exámen cuenta con 3 ejercicios, todos cuentan con código ya hecho que necesita mejoras, ajustes o alguna evolución.
En la entrega, no se va aceptar código que no compile y cuyos tests fallen.
El punto 1 es obligatorio para aprobar.

## Ejercicio 1

Una agencia de viajes esta desarrollando su propio sistema de gestión y está teniendo problemas en el diseño de su solución. Para resolverlo nos ha contratado y quiere que revisemos el diseño. Para eso nos pasaron el diseño actual que cuenta con las siguientes clases:

![](/ejercicio1.png)

El primer problema que se visualiza es que `AgenciaDeViajes` no está trabajando polimorficamente con los distintos paquetes de viajes. Esto nos trae varios problemas a la hora de querer agregar nuevos paquetes.

El segundo problema está relacionado con el primero, si bien todos los paquetes son de 3 días con traslados de ida y vuelta, en el diseño no hay nada que nos asegure que todos los paquetes van a tener un itinerario con esa estructura.

Se solicita realizar las modificaciones necesarias para resolver los problemas de diseño encontrados.

## Ejercicio 2

Hemos desarrollado un programa que permite el funcionamiento de una empreza automotriz. Este programa permite realizar pruebas de funcionamiento sobre el software de los distintos motores de la compania.

![](/ejercicio2.png)

Se cuenta con un test que verifica  el funcionamiento de los mismos en las distintas pruebas que se les realizan:

```java
    @Test
    public void testProbarEncender() {
        motores.forEach(m -> {
            automotriz.probarEncender(m);
            assertTrue(m.encendido());
        });
    }

    @Test
    public void testProbarApagar() {
        motores.forEach(m -> {
            automotriz.probarApagar(m);
            assertFalse(m.encendido());
        });
    }

    @Test
    public void testProbarAceleracion() {
        motores.forEach(m -> {
            automotriz.probarAceleracion(m, 100);
            assertEquals(m.rpm(), 100);
        });
    }

    @Test
    public void testProbarFrenado() {
        motores.forEach(m -> {
            automotriz.probarFrenado(m, 100, 50);
            assertEquals(m.rpm(), 50);
        });
    }
```

Sin embargo, se ha adquirido un nuevo motor, `MotorExperimental` y su software es distinto al que manejamos hasta entonces.
Sucede que no software es cerrado y no es posible realizarle ninguna moidificación, sólo hacer uso de el.

```java
    motores = new ArrayList<Motor>();
    motores.add(motorCarburador);
    motores.add(motorInyeccion);
    automotriz = new Automotriz();
    //motores.add(motorExperimental); NO compila,
```

Se solicita realizar las modificaciones o agregados necesarios, sin tocar la clase `MotorExperimental`, para que sea posible realizar las mismas pruebas sobre el nuevo motor.


## Ejercicio 3


