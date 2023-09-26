package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.interfaces.IEmpleado;
import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosService implements IEmpleadosService{

	@Autowired
	private IEmpleado data;

	@Override
	public List<Empleado> Listar() {
		return (List<Empleado>)data.findAll();
	}
	
	public void registrarEmpleado(Empleado empleado) {
	   
	    data.save(empleado);
	}




}
