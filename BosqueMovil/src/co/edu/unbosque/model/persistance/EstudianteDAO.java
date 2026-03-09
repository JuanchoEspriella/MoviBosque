package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import co.edu.unbosque.model.Estudiante;

public class EstudianteDAO implements DAO<Estudiante> {
	private ArrayList<Estudiante> listaEstudiantes;

	public EstudianteDAO() {
		listaEstudiantes = new ArrayList<>();
	}

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}

	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}

	@Override
	public void crear(Estudiante nuevoDato) {
		listaEstudiantes.add(nuevoDato);

	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaEstudiantes.size()) {
			return false;
		} else {
			listaEstudiantes.remove(index);
			return true;
		}

	}

	@Override
	public boolean actualizar(int index, Estudiante datoActualizado) {
		if (index < 0 || index >= listaEstudiantes.size()) {
			return false;
		} else {
			listaEstudiantes.set(index, datoActualizado);
			return true;
		}
	}

	@Override
	public String mostrar() {
		String datos = "";
		int posicion = 0;
		for (Estudiante Estudiante : listaEstudiantes) {
			datos += posicion + " ";
			datos += Estudiante.toString() + "\n";
		}
		return datos;
	}

	@Override
	public String mostrar(int index) {

		return listaEstudiantes.get(index).toString();
	}

	@Override
	public ArrayList<Estudiante> mostrarTodo() {

		return listaEstudiantes;
	}

}