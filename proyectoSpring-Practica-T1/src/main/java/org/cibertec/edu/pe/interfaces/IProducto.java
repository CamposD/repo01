package org.cibertec.edu.pe.interfaces;



import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Implementacion de la interfaz IProducto que hereda la clase JpaRepository
public interface IProducto extends JpaRepository<Producto, Integer>{



}
