public class Stand {
	private int numero;
	private String ubicacion;
	private String tamano;
	private boolean ocupado;

	public Stand(int numero, String ubicacion, String tamano) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.tamano = tamano;
		this.ocupado = false;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Stand #" + numero + " (" + ubicacion + " - " + tamano + ")";
	}
}