package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gftFeGc.mavenTa34v2.dao.IPiezaDAO;
import com.gftFeGc.mavenTa34v2.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{

	@Autowired
	IPiezaDAO iPiezaDAO;
	
	//Se implementa un CRUD basico para la tabla Pieza
	@Override
	public List<Pieza> listarTodasPiezas() {
		
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza listarIDPieza(int id) {
		
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza salvarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza modificarPieza(Pieza pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void borrarPieza(int id) {
		
		iPiezaDAO.deleteById(id);
	}

}
