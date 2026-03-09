package co.edu.unbosque.model;

public abstract class Persona {
	private String nombre;
	private String id;
	private String correo;
	private String contrasenia;
	private String facultad;
	private String destino;
	private String rol;
	

	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Persona(String nombre, String id, String correo, String contrasenia, String facultad, String destino,
			String rol) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.facultad = facultad;
		this.destino = destino;
		this.rol = rol;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public String getFacultad() {
		return facultad;
	}


	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
	


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + ", correo=" + correo + ", contrasenia=" + contrasenia
				+ ", facultad=" + facultad + ", destino=" + destino + ", rol=" + rol + "]";
	}


	public abstract int calcularTarifa();
	
	
	/*SE TIENE UN COSTO POR FACULTADES, 1000 PESOS POR VIAJE INGENIERIA, DE MEDICINA 20000, SI ERES DE ARTES TE COBRAN EN APLAUSOS,DE MATEMATICAS SEGUN EL SEMESTRE SE PAGA 3000
	 * SI ES ESTUDIANTE SE RESTAN 100 PESOS PERO NO PUEDEN SER 0 PESOS, A LOS DOCENTES 50, A LOS ADMINISTRATIVOS SE SUMAN 500 POR AÑO DE SERVICIO,
	 *  DEBE MOSTRAR EL DINERO RECAUDADO AL FINAL DE LAS OPERACIONES 
	 */
}
