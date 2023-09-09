package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import com.gftFeGc.mavenTa34v2.dto.Proveedor;

public interface IProveedorService {
	//Listar todo
	public List<Proveedor> listarTodasProveedores();
	
	//Listar un objeto por id
	public Proveedor listarIDProveedor(String id);
	
	//guardar pieza
	public Proveedor salvarProveedor(Proveedor pieza);
	
	//modificar pieza
	public Proveedor modificarProveedor(Proveedor pieza);
	
	//borrar pìeza
	public void borrarProveedor(String id);
}
