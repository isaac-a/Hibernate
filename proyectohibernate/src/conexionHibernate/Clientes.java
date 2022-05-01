//mapeo entre la clase cliente y la base de datos 

package conexionHibernate;

import javax.persistence.*;
//Declaracion de las anotaciones para mapeo @Entity, @Table, @Column

@Entity
@Table(name="clientes") 

public class Clientes {
	//aqui añadimos un constructor por defecto
	public Clientes() {
		super();
	}
	
	
	// añadimos un constructor por parametro
	public Clientes(String nombre, String apellidos, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}


	// propiedades
	@Id 
	@Column(name="id")
	private int id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="direccion")
	private String direccion;
	public int getId() {
		return id;
	}


	//Añadimos los getters and setters para poder realizar el CRUD

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ "]";
	}

}
