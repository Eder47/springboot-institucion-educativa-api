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
import org.hibernate.annotations.NaturalIdCache;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * La Tag entidad va a mapear el @OneToManylado del tagatributo en la PostTagentidad de unión:
 * @author epalomo
 *
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Profesor")
@Table(name = "profesor")
@NaturalIdCache
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE
)
public class Profesor implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;


	/**
	 * La @NaturalId anotación nos permite obtener la Tagentidad por su clave comercial.
       La @Cacheanotación marca la estrategia de concurrencia de caché .
       El @NaturalIdCache le dice a Hibernate que almacene en caché el identificador de entidad asociado con una clave comercial determinada.
	 */
	
	private String nombreProfesor;

	
	@ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
	@JoinTable(name = "profesor_asignatura",
		    joinColumns = @JoinColumn(name = "profesor_id"),
		    inverseJoinColumns = @JoinColumn(name = "asignatura_id")
	)
	private List<Asignatura> asignaturas = new ArrayList<>();
	

	private static final long serialVersionUID = 2680088053808696615L;

}
