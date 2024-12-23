package com.fac.facturacion.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;


@Component
@RequestScope
@JsonIgnoreProperties({"targetSource", "advisors"})
public class Factura {

    @Autowired
    private Cliente cliente;

    @Value("${factura.descripcion}")
    private String descripcion;

    @Autowired
    private List<Item> items;

    @PostConstruct
    public void init()
    {
        System.out.println("Creando el componente de la factura");
        cliente.setNombre("Pedro Gomez");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Destruyendo el bean de factura");
    }
    public Factura(Cliente cliente, String descripcion, List<Item> items) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = items;
    }

    public Factura() {


    }
    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;

    }

    public int getTotal()
    {
        /*int total = 0;
        for (Item items : items) {
            total += item.getImporte();
        }*/
        return items.stream().map(item->item.getImporte()).
                reduce(0,(sum,importe)->sum +importe);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
