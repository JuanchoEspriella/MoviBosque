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
	// TODO Auto-generated method stub
	return 0;
}

	
}
