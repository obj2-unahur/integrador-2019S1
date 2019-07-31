package ar.edu.unahur.obj2.ejercicio3;

public class Vendedor {

    private String tipoVendedor;

    public Vendedor(String tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public double comision(double montoVenta) {
        double porcentajeComision;

        if (tipoVendedor.equals("PRINCIPIANTE")) {
            porcentajeComision=0.10;
        } else if (tipoVendedor.equals("SENIOR")) {
            porcentajeComision=0.20;
        } else if (tipoVendedor.equals("EXPERTO")) {
            porcentajeComision=0.40;
        } else {
            throw new RuntimeException("Tipo de vendedor inexistente");
        }

        return montoVenta*porcentajeComision;
    }
}
