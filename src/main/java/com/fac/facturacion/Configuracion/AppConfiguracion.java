package com.fac.facturacion.Configuracion;

import com.fac.facturacion.Model.Item;
import com.fac.facturacion.Model.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;




@Configuration
@PropertySource("classpath:data.properties")
public class AppConfiguracion {

    @Bean
    List<Item>itemFactura()
    {
        Producto p1 = new Producto("Camara sony",800);
        Producto p2 = new Producto("Bicicleta bianchi",1200);
        List<Item>items = Arrays.asList(new Item(p1,2D),new Item(p2,3D));
        return items;
    }

    @Bean
    @Primary
    List<Item>itemFacturaOficina()
    {
        Producto p1 = new Producto("Monitor Asus 24",800);
        Producto p2 = new Producto("Notebook apple",1200);
        Producto p3 = new Producto("Impresora hp",500);
        Producto p4 = new Producto("Escritorio de oficina",120);
        return Arrays.asList(new Item(p1,2D),new Item(p2,3D),
                new Item(p3,2D),new Item(p4,4D));

    }



}
