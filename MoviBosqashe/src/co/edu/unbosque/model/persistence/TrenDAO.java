package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Tren;

public class TrenDAO implements DAO<Tren> {
	private ArrayList<Tren> listaTrenes;

	public TrenDAO() {
		listaTrenes = new ArrayList<>();
	}

	public ArrayList<Tren> getListaTrenes() {
		return listaTrenes;
	}

	public void setListaTrenes(ArrayList<Tren> listaTrenes) {
		this.listaTrenes = listaTrenes;
	}

	@Override
	public void crear(Tren nuevoDato) {
		listaTrenes.add(nuevoDato);

	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaTrenes.size()) {
			return false;
		} else {
			listaTrenes.remove(index);
			return true;
		}

	}

	@Override
	public boolean actualizar(int index, Tren datoActualizado) {
		if (index < 0 || index >= listaTrenes.size()) {
			return false;
		} else {
			listaTrenes.set(index, datoActualizado);
			return true;
		}
	}

	@Override
	public String mostrar() {
		String datos = "";
		int posicion = 0;
		for (Tren Tren : listaTrenes) {
			datos += posicion + " ";
			datos += Tren.toString() + "\n";
		}
		return datos;
	}

	@Override
	public String mostrar(int index) {

		return listaTrenes.get(index).toString();
	}

	@Override
	public ArrayList<Tren> mostrarTodo() {

		return listaTrenes;
	}
}

