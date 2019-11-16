package ar.edu.unahur.obj2.ejercicio3;

public  class Vendedor{

    private TipoDeVendedor tipoVendedor;

    public Vendedor(TipoDeVendedor tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public void setTipoVendedor(TipoDeVendedor tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public double comision(double montoVenta) {
        return tipoVendedor.porcentajeComision()*montoVenta;
    }
}
