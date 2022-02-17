package com.institucion.educativa.app.estudios.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name = "Asignatura")
@Table(name = "asignatura")
public class Asignatura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	
	
	@Column(name = "nombre_asignatura")
	private String nombreAsignatura;


	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
	@JoinTable(name = "asignatura_estudiantes",
		    joinColumns = @JoinColumn(name = "asignaturas_id"),
		    inverseJoinColumns = @JoinColumn(name = "estudiantes_id")
	)
	private List<Estudiante> estudiantes = new ArrayList<>();
	
	@ManyToMany(mappedBy = "asignaturas")
	private List<Profesor> profesor = new ArrayList<>();
	
	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
	@JoinTable(name = "curso_asignatura",
		    joinColumns = @JoinColumn(name = "asignatura_id"),
		    inverseJoinColumns = @JoinColumn(name = "curso_id")
	)
	private List<Curso> curso = new ArrayList<>();
	
	

	
	private static final long serialVersionUID = 856154822937013524L;
}
