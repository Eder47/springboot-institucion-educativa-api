package com.institucion.educativa.app.estudios.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institucion.educativa.app.estudios.dto.InscripcionesResponse;
import com.institucion.educativa.app.estudios.repository.RepositoryProfesor;
import com.institucion.educativa.app.estudios.service.Inscripciones;

@Service
public class ListaInscripciones implements Inscripciones {

	@Autowired
	RepositoryProfesor pepositoryProfesor;

	@Transactional
	public List<InscripcionesResponse> listaIncripciones(Long idProfesor) {
		return pepositoryProfesor.listaIncripciones(idProfesor);
	}

}
