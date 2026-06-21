package Dominio;

import Visitor.Visitor;

public abstract class Carta {
	protected String NombreCarta;
	protected int Rareza;
    protected String Tipo;
	protected double Poder;
	protected String rutaImagen;
    
	public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public double getPoder() {
        return Poder;
    }

    public void setPoder(double poder) {
        Poder = poder;
    }

    protected Carta(String nombreCarta, int rareza, String tipo) {
		super();
		NombreCarta = nombreCarta;
		Rareza = rareza;
		Tipo = tipo;
	}

	public abstract double accept(Visitor v);

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
