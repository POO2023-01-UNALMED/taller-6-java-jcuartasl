package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		Vehiculo.CantidadCamionetas++;
		this.volco = volco;
	}
	
	public boolean isVolco() {
		return volco;
	}
}
