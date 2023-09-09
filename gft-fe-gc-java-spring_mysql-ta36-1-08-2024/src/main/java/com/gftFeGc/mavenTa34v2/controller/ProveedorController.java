package com.gftFeGc.mavenTa34v2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gftFeGc.mavenTa34v2.dto.Proveedor;
import com.gftFeGc.mavenTa34v2.service.ProveedorServiceImpl;

@RestController
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedor")
	public List<Proveedor> listarProveedor(){
		return proveedorServiceImpl.listarTodasProveedores();
	}
	
	@GetMapping("/proveedor/{id}")
	public Proveedor listarProveedorPorId(@PathVariable(name = "id") String id){
		return proveedorServiceImpl.listarIDProveedor(id);
	}
	
	@PostMapping("/proveedor")
	public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.salvarProveedor(proveedor);
	}
	
	@PutMapping("/proveedor/{id}")
	public Proveedor modificarProveedor(@RequestBody Proveedor proveedor, @PathVariable(name = "id") String id) {
		Proveedor proveedorSelect = proveedorServiceImpl.listarIDProveedor(id);
		
		proveedorSelect.setNombre(proveedor.getNombre());
		
		return proveedorServiceImpl.modificarProveedor(proveedorSelect);

	}
	
	@DeleteMapping("/proveedor/{id}")
	public void borrarProveedor(@PathVariable(name = "id") String id) {
		proveedorServiceImpl.borrarProveedor(id);		
	}
	
}
