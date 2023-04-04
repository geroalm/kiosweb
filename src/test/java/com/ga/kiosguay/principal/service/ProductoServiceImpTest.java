package com.ga.kiosguay.principal.service;

import com.ga.kiosguay.principal.data.entity.Producto;
import com.ga.kiosguay.principal.repository.ProductoRepository;
import com.ga.kiosguay.principal.service.interfaces.ProductoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ProductoServiceImpTest {
    @Mock
    ProductoRepository productoRep;

    @InjectMocks
    ProductoServiceImp service;

    Producto prod;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        prod = new Producto();
        prod.setId(1L);
        prod.setNombreProducto("ProdMokit");
        prod.setCodigoProducto("cod01010101");
        prod.setDescripcion("Descrip cod110100101");
    }

    @Test
    void getAllProductos() {
        when(productoRep.findAll()).thenReturn(Arrays.asList(prod));
        assertNotNull(service.getAllProductos());
    }

//    @Test
//    void getProductoPorId() {
//        when(productoRep.findById()).thenReturn(prod);
//    }

    @Test
    void saveProducto() {
    }

    @Test
    void updateProducto() {
    }
}