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

import com.gftFeGc.mavenTa34v2.dto.Suministra;
import com.gftFeGc.mavenTa34v2.service.SuministraServiceImpl;

@RestController
public class SuministraController {
	
	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra/hw")
	public String listarSuminos(){
		return "hello world";
	}
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuminostro(){
		return suministraServiceImpl.listarTodosSuministros();
	}
	
	@GetMapping("/suministra/{id}")
	public Suministra listarSuministrorPorId(@PathVariable (name="id") int id) {
		return suministraServiceImpl.listarIDSuministro(id);
	}
	
	@PostMapping("/suministra")
	public Suministra guardarSuministro(@RequestBody Suministra suministra){
		return suministraServiceImpl.salvarSuministro(suministra);
	}
	
	@PutMapping("/suministra")
	public Suministra modificarSuministro(@RequestBody Suministra suministra) {
		return suministraServiceImpl.modificarSuministro(suministra);
	}
	
	@DeleteMapping("/suministra/{id}")
	public void borrarSuministro(@PathVariable (name="id") int id) {
		suministraServiceImpl.borrarSuministro(id);
	}
}
