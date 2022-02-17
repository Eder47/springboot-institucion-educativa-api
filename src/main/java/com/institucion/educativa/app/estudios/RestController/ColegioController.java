package com.institucion.educativa.app.estudios.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.institucion.educativa.app.estudios.dto.InscripcionesResponse;
import com.institucion.educativa.app.estudios.dto.ProfesorResponse;
import com.institucion.educativa.app.estudios.service.Inscripciones;
import com.institucion.educativa.app.estudios.service.ListaProfesores;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ColegioController {

	@Autowired
	private Inscripciones inscripciones;
	
	@Autowired
	ListaProfesores listaProfesores;

	@GetMapping("/getInfo/{idProfesor}")
	public ResponseEntity<List<InscripcionesResponse>> getJoinInformation(@PathVariable Long idProfesor) {
		List<InscripcionesResponse> lista = inscripciones.listaIncripciones(idProfesor);
		return new ResponseEntity<>(lista, HttpStatus.OK);

	}

	@GetMapping("/getProfesores")
	public ResponseEntity<List<ProfesorResponse>> listarProfesores() {
		List<ProfesorResponse> lista = listaProfesores.listarProfesores();
		return new ResponseEntity<>(lista, HttpStatus.OK);

	}
}
