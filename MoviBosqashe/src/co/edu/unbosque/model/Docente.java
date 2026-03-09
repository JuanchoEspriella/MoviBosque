package co.edu.unbosque.model;

public class Docente extends Persona {
///RESERVA TREN O BUS Y OBSERVA QUIEN RESERVA EN LOS BUSES Y TRENES

	public Docente() {

		// TODO Auto-generated constructor stub
	}

	public Docente(String nombre, String id, String correo, String contrasenia, String facultad, String destino,
			String rol) {
		super(nombre, id, correo, contrasenia, facultad, destino, rol);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int calcularTarifa() {
		switch (getFacultad().toUpperCase()) {
		case "INGENIERIA": {
			return 1000 - 50;
		}
		case "MEDICINA": {
			return 20000 - 50;
		}

		case "MATEMATICAS": {
			return 3000 - 50;
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
