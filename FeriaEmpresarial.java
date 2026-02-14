import java.util.*;

public class FeriaEmpresarial {
	private List<Empresa> empresas = new ArrayList<>();
	private List<Stand> stands = new ArrayList<>();
	private List<Visitante> visitantes = new ArrayList<>();

	// --- Métodos de Registro ---
	public void registrarEmpresa(Empresa e) {
		empresas.add(e);
	}

	public void registrarStand(Stand s) {
		stands.add(s);
	}

	public void registrarVisitante(Visitante v) {
		visitantes.add(v);
	}

	// --- Asignación ---
	public boolean asignarStandAEmpresa(String nombreEmpresa, int numStand) {
		Empresa emp = buscarEmpresa(nombreEmpresa);
		Stand std = buscarStand(numStand);

		if (emp != null && std != null && !std.isOcupado()) {
			emp.setStandAsignado(std);
			std.setEmpresaAsignada(emp);
			return true;
		}
		return false;
	}

	// --- Interacción ---
	public void dejarComentario(String idVisitante, String nombreEmpresa, int calif, String texto) {
		Visitante v = buscarVisitante(idVisitante);
		Empresa e = buscarEmpresa(nombreEmpresa);

		if (v != null && e != null) {
			Comentario c = new Comentario(v.getNombre(), calif, texto);
			e.agregarComentario(c);
			v.registrarVisita(e.getStandAsignado());
			System.out.println("Comentario registrado!");
		}
	}

	// --- Reportes ---
	public void reporteEmpresasStands() {
		System.out.println("\n--- REPORTE EMPRESAS Y STANDS ---");
		for (Empresa e : empresas) {
			String infoStand = (e.getStandAsignado() != null) ? e.getStandAsignado().toString() : "Sin stand";
			System.out.println("Empresa: " + e.getNombre() + " | " + infoStand);
		}
	}

	public void reporteCalificaciones() {
		System.out.println("\n--- RANKING DE CALIFICACIONES ---");
		for (Empresa e : empresas) {
			System.out.printf("Empresa: %s | Promedio: %.2f estrellas\n", e.getNombre(), e.getPromedioCalificacion());
		}
	}

	public void reporteVisitantes() {
		System.out.println("\n--- VISITANTES Y STANDS VISITADOS ---");
		for (Visitante v : visitantes) {
			System.out.println("Visitante: " + v.getNombre() + " | Stands visitados: " + v.getStandsVisitados().size());
			System.out.println("Stands: " + v.getStandsVisitados());
			System.out.println("Empresas visitadas: " + v.getEmpresasVisitadas());
		}
	}

	// --- Búsquedas Auxiliares ---
	public Empresa buscarEmpresa(String n) {
		return empresas.stream().filter(e -> e.getNombre().equalsIgnoreCase(n)).findFirst().orElse(null);
	}

	public Stand buscarStand(int n) {
		return stands.stream().filter(s -> s.getNumero() == n).findFirst().orElse(null);
	}

	public Visitante buscarVisitante(String id) {
		return visitantes.stream().filter(v -> v.getId().equals(id)).findFirst().orElse(null);
	}
}