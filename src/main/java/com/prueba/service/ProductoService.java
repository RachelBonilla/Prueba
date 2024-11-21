/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba.service;

import com.prueba.domain.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> getProductos(boolean activos);

    public Producto getProducto(Producto producto);

    public void save(Producto producto);

    public void delete(Producto producto);

    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    public List<Producto> metodoNativo(double precioInf, double precioSup);
    
    public List<Producto> findByExistenciasBetweenOrderByDescripcion(int existenciaInf, int existenciaSup);

}
