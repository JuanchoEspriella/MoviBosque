package co.edu.unbosque.model;

public abstract class Vehiculo {
      private String placa;
      private int capacidad;
      private String sitioSalida;
      private String sitioLlegada;
      private String nombreRuta;
      
      public Vehiculo() {
		
	}

	public Vehiculo(String placa, int capacidad, String sitioSalida, String sitioLlegada, String nombreRuta) {
		super();
		this.placa = placa;
		this.capacidad = capacidad;
		this.sitioSalida = sitioSalida;
		this.sitioLlegada = sitioLlegada;
		this.nombreRuta = nombreRuta;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getSitioSalida() {
		return sitioSalida;
	}

	public void setSitioSalida(String sitioSalida) {
		this.sitioSalida = sitioSalida;
	}

	public String getSitioLlegada() {
		return sitioLlegada;
	}

	public void setSitioLlegada(String sitioLlegada) {
		this.sitioLlegada = sitioLlegada;
	}

	public String getNombreRuta() {
		return nombreRuta;
	}

	public void setNombreRuta(String nombreRuta) {
		this.nombreRuta = nombreRuta;
	}

	@Override
	public String toString() {
		return "Vehiculo [placa=" + placa + ", capacidad=" + capacidad + ", sitioSalida=" + sitioSalida
				+ ", sitioLlegada=" + sitioLlegada + ", nombreRuta=" + nombreRuta + "]";
	}
      public abstract String getTipo();
}
