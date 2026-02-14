import java.time.LocalDate;

public class Comentario {
	private String nombreVisitante;
	private LocalDate fecha;
	private int calificacion; // 1 a 5
	private String texto;

	public Comentario(String nombreVisitante, int calificacion, String texto) {
		this.nombreVisitante = nombreVisitante;
		this.fecha = LocalDate.now();
		this.calificacion = calificacion;
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "[" + fecha + "] " + nombreVisitante + " (" + calificacion + "⭐): " + texto;
	}

	public int getCalificacion() {
		return calificacion;
	}
}