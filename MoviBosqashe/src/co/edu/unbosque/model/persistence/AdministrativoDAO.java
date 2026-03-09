package co.edu.unbosque.model.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.Administrativo;

public class AdministrativoDAO implements DAO<Administrativo> {
	private ArrayList<Administrativo> listaAdministrativos;

	public AdministrativoDAO() {
		listaAdministrativos = new ArrayList<>();
	}

	public ArrayList<Administrativo> getListaAdministrativos() {
		return listaAdministrativos;
	}

	public void setListaAdministrativos(ArrayList<Administrativo> listaAdministrativos) {
		this.listaAdministrativos = listaAdministrativos;
	}

	@Override
	public void crear(Administrativo nuevoDato) {
		listaAdministrativos.add(nuevoDato);

	}

	@Override
	public boolean eliminar(int index) {
		if (index < 0 || index >= listaAdministrativos.size()) {
			return false;
		} else {
			listaAdministrativos.remove(index);
			return true;
		}

	}

	@Override
	public boolean actualizar(int index, Administrativo datoActualizado) {
		if (index < 0 || index >= listaAdministrativos.size()) {
			return false;
		} else {
			listaAdministrativos.set(index, datoActualizado);
			return true;
		}
	}

	@Override
	public String mostrar() {
		String datos = "";
		int posicion = 0;
		for (Administrativo Administrativo : listaAdministrativos) {
			datos += posicion + " ";
			datos += Administrativo.toString() + "\n";
		}
		return datos;
	}

	@Override
	public String mostrar(int index) {

		return listaAdministrativos.get(index).toString();
	}

	@Override
	public ArrayList<Administrativo> mostrarTodo() {

		return listaAdministrativos;
	}

}