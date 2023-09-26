package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleado extends JpaRepository<Empleado, Integer>{
	
}
