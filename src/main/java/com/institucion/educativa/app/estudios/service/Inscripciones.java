package com.institucion.educativa.app.estudios.service;

import java.util.List;

import com.institucion.educativa.app.estudios.dto.InscripcionesResponse;

public interface Inscripciones {
	
	public List<InscripcionesResponse> listaIncripciones(Long idProfesor);

}
