package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import co.edu.unbosque.model.Bus;

public class BusDAO implements DAO<Bus> {
	private ArrayList<Bus> listaBus;

	public BusDAO() {
		listaBus = new ArrayList<>();
	}

	public ArrayList<Bus> getListaBus() {
		return listaBus;
	}

	public void setListaBus(ArrayList<Bus> listaBus) {
		this.listaBus = listaBus;
	}

	@Override
	public void crear(Bus nuevoDato) {
		listaBus.add(nuevoDato);

	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaBus.size()) {
			return false;
		} else {
			listaBus.remove(index);
			return true;
		}

	}

	@Override
	public boolean actualizar(int index, Bus datoActualizado) {
		if (index < 0 || index >= listaBus.size()) {
			return false;
		} else {
			listaBus.set(index, datoActualizado);
			return true;
		}
	}

	@Override
	public String mostrar() {
		String datos = "";
		int posicion = 0;
		for (Bus Bus : listaBus) {
			datos += posicion + " ";
			datos += Bus.toString() + "\n";
		}
		return datos;
	}

	@Override
	public String mostrar(int index) {

		return listaBus.get(index).toString();
	}

	@Override
	public ArrayList<Bus> mostrarTodo() {

		return listaBus;
	}

}
