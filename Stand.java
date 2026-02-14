public class Stand {
	private int numero;
	private String ubicacion;
	private String tamano;
	private boolean ocupado;
	private Empresa empresaAsignada;

	public Stand(int numero, String ubicacion, String tamano) {
		this.numero = numero;
		this.ubicacion = ubicacion;
		this.tamano = tamano;
		this.empresaAsignada = null;
		this.ocupado = false;
	}

	// Getters y Setters
	public int getNumero() {
		return numero;
	}

	public Empresa getEmpresaAsignada() {
		return empresaAsignada;
	}

	public void setEmpresaAsignada(Empresa empresaAsignada) {
		this.empresaAsignada = empresaAsignada;
		this.ocupado = (empresaAsignada != null);
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