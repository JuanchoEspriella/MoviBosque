package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Docente;

public class DocenteDAO implements DAO<Docente> {
	private ArrayList<Docente> listaDocentes;

	public DocenteDAO() {
		listaDocentes = new ArrayList<>();
	}

	public ArrayList<Docente> getListaDocentes() {
		return listaDocentes;
	}

	public void setListaDocentes(ArrayList<Docente> listaDocentes) {
		this.listaDocentes = listaDocentes;
	}

	@Override
	public void crear(Docente nuevoDato) {
		listaDocentes.add(nuevoDato);

	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaDocentes.size()) {
			return false;
		} else {
			listaDocentes.remove(index);
			return true;
		}

	}

	@Override
	public boolean actualizar(int index, Docente datoActualizado) {
		if (index < 0 || index >= listaDocentes.size()) {
			return false;
		} else {
			listaDocentes.set(index, datoActualizado);
			return true;
		}
	}

	@Override
	public String mostrar() {
		String datos = "";
		int posicion = 0;
		for (Docente Docente : listaDocentes) {
			datos += posicion + " ";
			datos += Docente.toString() + "\n";
		}
		return datos;
	}

	@Override
	public String mostrar(int index) {

		return listaDocentes.get(index).toString();
	}

	@Override
	public ArrayList<Docente> mostrarTodo() {

		return listaDocentes;
	}

}