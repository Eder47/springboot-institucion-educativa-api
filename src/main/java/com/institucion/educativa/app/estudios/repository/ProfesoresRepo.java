package com.institucion.educativa.app.estudios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.institucion.educativa.app.estudios.dto.InscripcionesResponse;
import com.institucion.educativa.app.estudios.dto.ProfesorResponse;
import com.institucion.educativa.app.estudios.models.Profesor;

public interface ProfesoresRepo extends JpaRepository<Profesor, Long>{
	
	@Query("SELECT new com.institucion.educativa.app.estudios.dto.ProfesorResponse(p.id, p.nombreProfesor) FROM Profesor p")
	public List<ProfesorResponse> listarProfesores();

}
