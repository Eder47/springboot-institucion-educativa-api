package com.institucion.educativa.app.estudios.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institucion.educativa.app.estudios.dto.ProfesorResponse;
import com.institucion.educativa.app.estudios.repository.ProfesoresRepo;
import com.institucion.educativa.app.estudios.service.ListaProfesores;

@Service
public class ListaProfesoresImpl implements ListaProfesores{
	
	@Autowired
	ProfesoresRepo profesoresRepo;

	@Transactional
	public List<ProfesorResponse> listarProfesores() {
		return profesoresRepo.listarProfesores();
	}

}
