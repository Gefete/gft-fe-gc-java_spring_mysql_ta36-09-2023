package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import com.gftFeGc.mavenTa34v2.dto.Pieza;

public interface IPiezaService {
	//Listar todo
	public List<Pieza> listarTodasPiezas();
	
	//Listar un objeto por id
	public Pieza listarIDPieza(int id);
	
	//guardar pieza
	public Pieza salvarPieza(Pieza pieza);
	
	//modificar pieza
	public Pieza modificarPieza(Pieza pieza);
	
	//borrar pìeza
	public void borrarPieza(int id);
}
