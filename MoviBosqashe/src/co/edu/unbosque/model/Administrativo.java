package co.edu.unbosque.model;

public class Administrativo extends Persona {

	private int anioServicio;

	public Administrativo() {
		// TODO Auto-generated constructor stub
	}

	public Administrativo(int anioServicio) {
		super();
		this.anioServicio = anioServicio;
	}

	public Administrativo(String nombre, String id, String correo, String contrasenia, String facultad, String destino,
			String rol, int anioServicio) {
		super(nombre, id, correo, contrasenia, facultad, destino, rol);
		this.anioServicio = anioServicio;
	}

	public Administrativo(String nombre, String id, String correo, String contrasenia, String facultad, String destino,
			String rol) {
		super(nombre, id, correo, contrasenia, facultad, destino, rol);
		// TODO Auto-generated constructor stub
	}

	public int getAnioServicio() {
		return anioServicio;
	}

	public void setAnioServicio(int anioServicio) {
		this.anioServicio = anioServicio;
	}

	@Override
	public String toString() {
		return super.toString() + "Administrativo [anioServicio=" + anioServicio + "]";
	}

	@Override
	public int calcularTarifa() {
		switch (getFacultad().toUpperCase()) {
		case "INGENIERIA": {
			return 1000 + (500 * anioServicio);
		}
		case "MEDICINA": {
			return 20000 +(500 * anioServicio);
		}

		case "MATEMATICAS": {
			return 3000 +(500 * anioServicio);
		}
		case "ARTES": {

			return 0;
		}
		default:
			return 0;
		}

///PUEDE AGENDAR Y CANCELAR TREN O BUS , SOLO PUEDE VER INFO PROPIA
	}
}

///TIENEN CONTROL TOTAL SOBRE EL PROGRAMA. UNICAMENTE PUEDEN RESERVAR TREN YA QUE SOLO LLEGAN A LA SEDE 
