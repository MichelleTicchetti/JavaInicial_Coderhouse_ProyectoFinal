package com.coderhouse.appFacturacion.service;

import java.util.List;


import com.coderhouse.appFacturacion.entity.Producto;

public interface ProductoService {
	
	Producto crearProducto(Producto producto);

	void modificarPrecioProducto(Long id, double precio) throws Exception;

	void borrarProducto(Long id) throws Exception;
	
	Producto obtenerProductoPorNombre(String nombre);
	
	Producto obtenerProductoPorId(Long id) throws Exception;

	List<Producto> obtenerTodosLosProductos();
	
	List<Producto> obtenerProductosPorPlataforma(String plataforma);
	
	List<Producto> obtenerProductosPorCategoria(String categoria);

	void restarStock(Long id, int cant) throws Exception;

	




}
