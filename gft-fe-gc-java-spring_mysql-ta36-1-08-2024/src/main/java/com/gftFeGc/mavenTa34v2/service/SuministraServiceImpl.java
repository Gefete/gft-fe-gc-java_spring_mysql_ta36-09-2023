package com.gftFeGc.mavenTa34v2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gftFeGc.mavenTa34v2.dao.ISuministraDAO;
import com.gftFeGc.mavenTa34v2.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{

	@Autowired
	ISuministraDAO iSuministraDAO;
	
	//Se implementa un CRUD basico para la tabla Pieza
	@Override
	public List<Suministra> listarTodosSuministros() {
		
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra listarIDSuministro(int id) {
		
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra salvarSuministro(Suministra suministra) {
		
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra modificarSuministro(Suministra suministra) {
		
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void borrarSuministro(int id) {
		
		iSuministraDAO.deleteById(id);;
	}

}
