package com.ga.kiosguay.principal.controller;

import com.ga.kiosguay.principal.data.entity.CategoriaProducto;
import com.ga.kiosguay.principal.data.entity.Marca;
import com.ga.kiosguay.principal.data.entity.Producto;
import com.ga.kiosguay.principal.data.entity.Stock;
import com.ga.kiosguay.principal.repository.ProductoRepository;
import com.ga.kiosguay.principal.service.ProductoServiceImp;
import com.ga.kiosguay.principal.service.interfaces.ProductoService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductoControllerTest {

    @Mock
    ProductoRepository repo;

    @InjectMocks
    ProductoService service = new ProductoServiceImp();

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getAllProductos()
    {
        Marca marca = new Marca();
        marca.setId(1L);
        marca.setNombre("marca01");

        Marca marca2 = new Marca();
        marca2.setId(2L);
        marca2.setNombre("marca02");

        CategoriaProducto cat = new CategoriaProducto();
        cat.setId(1L);
        cat.setNombre("cat01");

        List<Producto> mockListaProductos = new ArrayList<Producto>();
        Producto p = new Producto();
        p.setId(1L);
        p.setNombre("productoTestmockito01");
        p.setMarca(marca);
        p.setCategoria(cat);
        p.setCodigo("codigoProductoMockito01");
        p.setEstado(Producto.Estado.ACTIVO);
        p.setSerial("serial00001");
        p.setDescripcion("desc0001");

        Producto pr = new Producto();
        pr.setId(2L);
        pr.setNombre("productoTestmockito02");
        pr.setMarca(marca2);
        pr.setCategoria(cat);
        pr.setCodigo("codigoProductoMockito02");
        pr.setEstado(Producto.Estado.ACTIVO);
        pr.setSerial("serial00002");
        pr.setDescripcion("desc0002");

        Stock stock = new Stock();
        stock.setProducto(pr);
        stock.setId(1L);
        stock.setCantidad(94L);


        mockListaProductos.add(p);
        mockListaProductos.add(pr);

        Mockito.when(repo.findAll()).thenReturn(mockListaProductos);



        //test
        List<Producto> listaProd = service.getAllProductos();
        System.out.println(listaProd);
        assertEquals(2,listaProd.size());


    }
}