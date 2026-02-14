import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private String sector;
	private String correo;
	private Stand standAsignado;
	private List<Comentario> comentarios = new ArrayList<>();

	public Empresa(String nombre, String sector, String correo) {
		this.nombre = nombre;
		this.sector = sector;
		this.correo = correo;
	}

	public void agregarComentario(Comentario c) {
		comentarios.add(c);
	}

	public double getPromedioCalificacion() {
		if (comentarios.isEmpty())
			return 0;
		return comentarios.stream().mapToInt(Comentario::getCalificacion).average().orElse(0);
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setStandAsignado(Stand s) {
		this.standAsignado = s;
	}

	public Stand getStandAsignado() {
		return standAsignado;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
}