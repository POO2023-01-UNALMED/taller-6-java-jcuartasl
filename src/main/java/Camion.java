package vehiculos;

public class Camion extends Vehiculo {
	static int CantidadCamiones = 456;
	int ejes;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		Vehiculo.CantidadCamiones++;
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	public static int getCantidadCamiones() {
		return Camion.CantidadCamiones;
	}

}
