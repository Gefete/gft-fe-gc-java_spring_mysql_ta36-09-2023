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

import com.gftFeGc.mavenTa34v2.dto.Pieza;
import com.gftFeGc.mavenTa34v2.service.PiezaServiceImpl;

@RestController
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/pieza")
	public List<Pieza> listarPiezas() {
		return piezaServiceImpl.listarTodasPiezas();
	}
	
	@GetMapping("/pieza/{id}")
	public Pieza buscarPiezaPorCodigo(@PathVariable(name = "id") int id) {
		return piezaServiceImpl.listarIDPieza(id);
	}
	
	@PostMapping("/pieza/save")
	public Pieza guardarPieza(@RequestBody Pieza pieza) {
		return piezaServiceImpl.salvarPieza(pieza);
	}
	
	@PutMapping("/pieza/update/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") int id, @RequestBody Pieza pieza) {
		
		Pieza piezaSelect = piezaServiceImpl.listarIDPieza(id);

		//Solo tiene nombre para cambiar 
		piezaSelect.setNombre(pieza.getNombre());
		
		return piezaServiceImpl.modificarPieza(piezaSelect);
	}
	
	@DeleteMapping("/pieza/{id}")
	public void borrarPieza(@PathVariable(name="id") int id) {
		
		piezaServiceImpl.borrarPieza(id);
	}
}
