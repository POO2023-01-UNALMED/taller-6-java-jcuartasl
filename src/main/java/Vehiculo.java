package vehiculos;

public class Vehiculo {
	static int CantidadCamiones;
	static int CantidadCamionetas;
	static int CantidadAutomovil;
	static int CantidadVehiculos;
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;

	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos++;
		Fabricante.fabricantes.add(fabricante);
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public int getPuertas() {
		return puertas;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public int getPeso() {
		return peso;
	}
	public String getTraccion(){
		return traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: " + CantidadAutomovil + "\nCamionetas: "+ CantidadCamionetas + "\nCamiones: " + CantidadCamiones;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int c) {
		CantidadVehiculos = c;
	}
}
