package org.cibertec.edu.pe.interfaceService;

import java.util.List;

import org.cibertec.edu.pe.modelo.Empleado;

public interface IEmpleadosService {
	public List<Empleado> Listar();

	public void registrarEmpleado(Empleado empleado);


}
