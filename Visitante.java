import java.util.ArrayList;
import java.util.List;

public class Visitante {
	private String nombre;
	private String id;
	private String correo;
	private List<Stand> standsVisitados = new ArrayList<>();

	public Visitante(String nombre, String id, String correo) {
		this.nombre = nombre;
		this.id = id;
		this.correo = correo;
	}

	public void registrarVisita(Stand s) {
		if (!standsVisitados.contains(s))
			standsVisitados.add(s);
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public String getId() {
		return id;
	}

	public List<Stand> getStandsVisitados() {
		return standsVisitados;
	}
}