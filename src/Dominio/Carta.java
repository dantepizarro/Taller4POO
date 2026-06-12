package Dominio;

public class Carta {
	protected String NombreCarta;
	protected int Rareza;
    protected String Tipo;
    
	protected Carta(String nombreCarta, int rareza, String tipo) {
		super();
		NombreCarta = nombreCarta;
		Rareza = rareza;
		Tipo = tipo;
	}

	public String getNombreCarta() {
		return NombreCarta;
	}

	public void setNombreCarta(String nombreCarta) {
		NombreCarta = nombreCarta;
	}

	public int getRareza() {
		return Rareza;
	}

	public void setRareza(int rareza) {
		Rareza = rareza;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
}
