package com.institucion.educativa.app.estudios.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Curso")
@Table(name = "cursos")
@NaturalIdCache
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
public class Curso implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "salon")
	private String salon;
	
	@ManyToMany(mappedBy = "curso")
	private List<Grados> aula = new ArrayList<>();
	
	
	@ManyToOne()
    @JoinColumn(name = "colegio_id")
	private Colegio colegio;
	
 
	@ManyToMany(mappedBy = "curso")
	private List<Asignatura> asignaturas = new ArrayList<>();

}
