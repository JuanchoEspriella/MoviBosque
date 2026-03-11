package co.edu.unbosque.model;

public class Bus extends Vehiculo {

	private boolean sirveAireAcondicionado;
	
	

	/**
	 * 
	 */
	public Bus() {
		super();
	}


	/**
	 * @param sirveAireAcondicionado
	 */
	public Bus(boolean sirveAireAcondicionado) {
		super();
		this.sirveAireAcondicionado = sirveAireAcondicionado;
	}
	

	/**
	 * @param placa
	 * @param capacidad
	 * @param sitioSalida
	 * @param sitioLlegada
	 * @param nombreRuta
	 * @param sirveAireAcondicionado
	 */
	public Bus(String placa, int capacidad, String sitioSalida, String sitioLlegada, String nombreRuta,
			boolean sirveAireAcondicionado) {
		super(placa, capacidad, sitioSalida, sitioLlegada, nombreRuta);
		this.sirveAireAcondicionado = sirveAireAcondicionado;
	}

	
	/**
	 * @param placa
	 * @param capacidad
	 * @param sitioSalida
	 * @param sitioLlegada
	 * @param nombreRuta
	 */
	public Bus(String placa, int capacidad, String sitioSalida, String sitioLlegada, String nombreRuta) {
		super(placa, capacidad, sitioSalida, sitioLlegada, nombreRuta);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public String getTipo() {
		
		return "BUS";
	}

	
}
