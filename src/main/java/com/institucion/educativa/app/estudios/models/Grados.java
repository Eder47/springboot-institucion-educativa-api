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
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NaturalIdCache;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Grado")
@Table(name = "grados")
@NaturalIdCache
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
public class Grados implements Serializable{
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NaturalId
	private Integer grado;
	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
	@JoinTable(name = "grados_cursos",
		    joinColumns = @JoinColumn(name = "grado_id"),
		    inverseJoinColumns = @JoinColumn(name = "curso_id")
	)
	private List<Curso> curso = new ArrayList<>();
	  

	private static final long serialVersionUID = 8169661377342615631L;

}
