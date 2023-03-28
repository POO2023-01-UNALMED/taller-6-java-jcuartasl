package vehiculos;

public class Pais {
	String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais paisMas = new Pais(null);
		int max = 0;
		for (Fabricante f : Fabricante.fabricantes) {
			int cant = 0;
			if (f.getPais().getNombre() != paisMas.getNombre()) {
				for (Fabricante g : Fabricante.fabricantes) {
					if (g.getPais().getNombre() == f.getPais().getNombre()) {
						cant++;
					}
				}
			}
			if (cant > max) {
				max = cant;
				paisMas = f.getPais();
			}
		}
		return paisMas;
	}
}
