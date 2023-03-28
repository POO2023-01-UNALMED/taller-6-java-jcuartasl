package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> fabricantes= new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public static Fabricante fabricaMayorVentas() {
		Fabricante fabricaMas = new Fabricante(null, null);
		int max = 0;
		for (Fabricante f : fabricantes) {
			int cant = 0;
			if (f.getNombre() != fabricaMas.getNombre()) {
				for (Fabricante g : fabricantes) {
					if (g.getNombre() == f.getNombre()) {
						cant++;
					}
				}
			}
			if (cant > max) {
				max = cant;
				fabricaMas = f;
			}
		}
		return fabricaMas;
	}
}
