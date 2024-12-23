package com.fac.facturacion.Model;




public class Item {

    private Producto producto;
    private Double cantidad;

    public Item(Producto producto, Double cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Item() {
    }

    public int getImporte()
    {
        return (int) (this.cantidad*producto.getPrecioUnitario());
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
}
