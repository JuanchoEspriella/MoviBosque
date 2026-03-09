package co.edu.unbosque.model;

public class Tren extends Vehiculo {

	private int vagon;

	public Tren() {

	}

	public Tren(int vagon) {
		super();
		this.vagon = vagon;
	}

	public Tren(String placa, int capacidad, String sitioSalida, String sitioLlegada, String nombreRuta, int vagon) {
		super(placa, capacidad, sitioSalida, sitioLlegada, nombreRuta);
		this.vagon = vagon;
	}

	public Tren(String placa, int capacidad, String sitioSalida, String sitioLlegada, String nombreRuta) {
		super(placa, capacidad, sitioSalida, sitioLlegada, nombreRuta);
		// TODO Auto-generated constructor stub
	}

	public int getVagon() {
		return vagon;
	}

	public void setVagon(int vagon) {
		this.vagon = vagon;
	}

	@Override
	public String toString() {
		return super.toString() + "Tren [vagon=" + vagon + "]";
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}
	public int calcularCapacidad() {
		return vagon * 50;
	}
}
