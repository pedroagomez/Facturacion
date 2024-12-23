package com.fac.facturacion.Controller;

import com.fac.facturacion.Model.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private Factura factura;

    @GetMapping("/mostrar")
    public Factura mostrar()
    {
        return factura;
    }
}
