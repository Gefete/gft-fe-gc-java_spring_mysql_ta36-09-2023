package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gftFeGc.mavenTa34v2.dao.IProveedorDAO;
import com.gftFeGc.mavenTa34v2.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{

	@Autowired
	IProveedorDAO iProveedorDAO;
	
	
	//Se implementa un CRUD basico para la tabla Pieza
	@Override
	public List<Proveedor> listarTodasProveedores() {
		
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor listarIDProveedor(String id) {
		
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor salvarProveedor(Proveedor pieza) {
		// TODO Auto-generated method stub
		return iProveedorDAO.save(pieza);
	}

	@Override
	public Proveedor modificarProveedor(Proveedor pieza) {
		
		return iProveedorDAO.save(pieza);
	}

	@Override
	public void borrarProveedor(String id) {
		
		iProveedorDAO.deleteById(id);
	}

}
