package co.edu.unbosque.model;

public class Estudiante extends Persona {

	private String programa;
	private int semestre;

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String nombre, String id, String correo, String contrasenia, String facultad, String destino,
			String rol, String programa, int semestre) {
		super(nombre, id, correo, contrasenia, facultad, destino, rol);
		this.programa = programa;
		this.semestre = semestre;
	}

	public Estudiante(String nombre, String id, String correo, String contrasenia, String facultad, String destino,
			String rol) {
		super(nombre, id, correo, contrasenia, facultad, destino, rol);
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String programa, int semestre) {
		super();
		this.programa = programa;
		this.semestre = semestre;

	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return super.toString() + "Estudiante [programa=" + programa + ", semestre=" + semestre + "]";
	}

	@Override
	public int calcularTarifa() {
		// TODO Auto-generated method stub
		return 0;
		// se hace con un switch, con un getfacultad y con gui y un action listener
		// puede ir en el DAO

///PUEDE AGENDAR Y CANCELAR TREN O BUS , SOLO PUEDE VER INFO PROPIA
	}
}
