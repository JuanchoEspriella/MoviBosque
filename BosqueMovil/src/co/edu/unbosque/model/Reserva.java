package co.edu.unbosque.model;

public class Reserva {
	private int horaSalida;
	private int horaLlegada;
	private String id;
	private String idUsuario;
	private String idVehiculo;
	private int costo;
	private String puntoSubida;
	private String puntoBajada;
	private String estadoReserva;
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}

	public Reserva(int horaSalida, int horaLlegada, String id, String idUsuario, String idVehiculo, int costo,
			String puntoSubida, String puntoBajada, String estadoReserva) {
		super();
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.id = id;
		this.idUsuario = idUsuario;
		this.idVehiculo = idVehiculo;
		this.costo = costo;
		this.puntoSubida = puntoSubida;
		this.puntoBajada = puntoBajada;
		this.estadoReserva = estadoReserva;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public int getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(int horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(String idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getPuntoSubida() {
		return puntoSubida;
	}

	public void setPuntoSubida(String puntoSubida) {
		this.puntoSubida = puntoSubida;
	}

	public String getPuntoBajada() {
		return puntoBajada;
	}

	public void setPuntoBajada(String puntoBajada) {
		this.puntoBajada = puntoBajada;
	}

	public String getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(String estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	@Override
	public String toString() {
		return "Reserva [horaSalida=" + horaSalida + ", horaLlegada=" + horaLlegada + ", id=" + id + ", idUsuario="
				+ idUsuario + ", idVehiculo=" + idVehiculo + ", costo=" + costo + ", puntoSubida=" + puntoSubida
				+ ", puntoBajada=" + puntoBajada + ", estadoReserva=" + estadoReserva + "]";
	}

	
	}
	
	

