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
@Entity(name = "Colegio")
@Table(name = "colegio")
@NaturalIdCache
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
public class Colegio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@NaturalId
	private String nombreColegio;

	@OneToMany(mappedBy = "colegio", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Curso> cursos = new ArrayList<>();
	



	private static final long serialVersionUID = 2680088053808696615L;


}
