package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import com.gftFeGc.mavenTa34v2.dto.Suministra;

public interface ISuministraService {
	//Listar todo
	public List<Suministra> listarTodosSuministros();
	
	//Listar un objeto por id
	public Suministra listarIDSuministro(int id);
	
	//guardar pieza
	public Suministra salvarSuministro(Suministra suministra);
	
	//modificar pieza
	public Suministra modificarSuministro(Suministra suministra);
	
	//borrar pìeza
	public void borrarSuministro(int id);
}
