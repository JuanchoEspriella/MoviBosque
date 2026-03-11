package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.Estudiante;
import co.edu.unbosque.model.persistence.EstudianteDAO;
import co.edu.unbosque.view.Consola;

public class Controller {
	ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
	EstudianteDAO estDAO = new EstudianteDAO();

	Consola con = new Consola();

	public void iniciar() {

		System.out.println("ingrese el nombre: ");
		String nombre = con.leerLinea();

		System.out.println("ingrese id (numero de identidad) ");
		String id = con.leerLinea();

		System.out.println("Ingrese el correo");
		String correo = con.leerLinea();

		System.out.println("Ingrese contraseña");
		String password = con.leerLinea();

		System.out.println("Ingrese su facultad");
		String facultad = con.leerLinea();

		System.out.println("Ingrese su destino");
		String destino = con.leerLinea();

		System.out.println("Ingrese su rol en la universidad");
		String rol = con.leerLinea();

		System.out.println("Si es estudiante ingrese el programa: ");
		String programa = con.leerLinea();

		System.out.println("Ingrese su semestre");
		int semestre = con.leerNumeroEntero();

		estDAO.crear(new Estudiante(nombre, id, correo, password, facultad, destino, rol, programa, semestre));

		System.out.println("\n Su tarifa es de: " + estDAO.calcularTarifa(id));
	}
}
