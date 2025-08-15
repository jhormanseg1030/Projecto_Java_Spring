package com.camila.clase2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.camila.clase2.dto.ProductoDto;
import com.camila.clase2.models.Producto;
import com.camila.clase2.repositoryes.ProductoRepositories;
import com.camila.clase2.services.ProductoServices;






@RestController
public class ProductoController {

    @Autowired
    private ProductoRepositories productoRepo;

    @GetMapping("/conectproduc")
    public String Producto() {
        return new String("Conectando desde producto controller :D");
    }
    @GetMapping("/productos")
    public String ListaProduto() {
        return productoRepo.findAll().toString();
    }
    @GetMapping("/listaProductos")
    public List<Producto> ProductoLista() {
        return productoRepo.findAll();
    }
    @PostMapping("/productoNuevo")
    public Producto ProductoNuevo(@RequestBody Producto producto) {
        return productoRepo.save(producto);
    }
    @DeleteMapping("/productos/{id}")
    public String EliminaProducto(@PathVariable Integer id) {
        productoRepo.deleteById(id);
        return "";
    }
    @PutMapping("productos/{id}")
    public String updateProducto(@PathVariable String id, @RequestBody Producto producto) {
        Producto updateProducto = productoRepo.findById(Integer.parseInt(id)).orElse(null);
        if(updateProducto == null){
            return "Producto no encontrado";
        }
        updateProducto.setNombre(producto.getNombre());
        updateProducto.setCategoria(producto.getCategoria());
        updateProducto.setPrecio(producto.getPrecio());
        productoRepo.save(updateProducto);
        return "Producto actualizado";
    }
        @GetMapping("/productos/{id}")
    public Producto getUsuarioById(@PathVariable Integer id) {
        return productoRepo.findById(id).orElse(null);
    }
    @GetMapping("/Productos/categoria/{categoria}")
    public List<Producto> getProductoByCategoria(@PathVariable String categoria) {
        return productoRepo.findByCategoria(categoria);
    }
    @GetMapping("/Productos/nombre/{nombre}")
    public List<Producto> getProductoByNombre(@PathVariable String nombre) {
        return productoRepo.findByNombre(nombre);
    }



//dto
    @Autowired
    private ProductoServices productoServ;

    @GetMapping("/producto/{id_producto}")
    public ResponseEntity<ProductoDto>getProducto(@PathVariable Integer id_producto){
        return new ResponseEntity<>(productoServ.getProducto(id_producto), HttpStatus.OK);
    }
    @GetMapping("/produc")
    public ResponseEntity<List<ProductoDto>> getProductos() {
        return new ResponseEntity<>(productoServ.getProductos(), HttpStatus.OK);
    }
    @DeleteMapping("/producto/{id}")
    public ResponseEntity<ProductoDto> deleteProducto(@PathVariable Integer id) {
        return new ResponseEntity<>(productoServ.deleteProducto(id), HttpStatus.OK);
    }
    @PostMapping("/product")
    public ResponseEntity<ProductoDto> saveProducto(@RequestBody ProductoDto productoDto){
        return new ResponseEntity<>(productoServ.saveProducto(productoDto), HttpStatus.CREATED);
    }
    @PutMapping("/prod/{id_producto}")
    public ResponseEntity<ProductoDto> updateProducto(@PathVariable Integer id_producto, @RequestBody ProductoDto productoDto) {
        return new ResponseEntity<>(productoServ.updateProducto(id_producto, productoDto), HttpStatus.OK);
    }
    @GetMapping("/producto/categoria/{categoria}")
    public ResponseEntity<List<ProductoDto>> getProductosByCategoria(@PathVariable String categoria) {
        return new ResponseEntity<>(productoServ.getProductoByCategoria(categoria), HttpStatus.OK);
    }
}
