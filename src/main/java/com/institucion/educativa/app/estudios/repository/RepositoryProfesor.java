package com.institucion.educativa.app.estudios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.institucion.educativa.app.estudios.dto.InscripcionesResponse;
import com.institucion.educativa.app.estudios.models.Profesor;

public interface RepositoryProfesor extends CrudRepository<Profesor, Long> {

	@Query("SELECT new com.institucion.educativa.app.estudios.dto.InscripcionesResponse(p.nombreProfesor, a.nombreAsignatura, e.nombre) FROM Profesor p "
			+ "join p.asignaturas a join a.estudiantes e where p.id = ?1")
	public List<InscripcionesResponse> listaIncripciones(Long idProfesor);
	
	

}
