package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.interfaces.IProducto;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> Listado() {
		// TODO Auto-generated method stub
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> Buscar(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public void Insertar(Producto p) {
		// TODO Auto-generated method stub
		data.save(p);
		
	}

	@Override
	public void Modificar(Producto p) {
		// TODO Auto-generated method stub
		data.save(p);
	}

	@Override
	public void Suprimir(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
		
	}

}
