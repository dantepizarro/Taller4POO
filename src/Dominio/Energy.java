package Dominio;

import Visitor.Visitor;

public class Energy extends Carta{
	protected String Element;
	protected double Poder;

	protected Energy(String nombreCarta, int rareza, String tipo, String element) {
		super(nombreCarta, rareza, tipo);
		Element = element;
	}

	public String getElement() {
		return Element;
	}

	public void setElement(String element) {
		Element = element;
	}

	public double getPoder() {
		return Poder;
	}

	public void setPoder(double poder) {
		Poder = poder;
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

	
	
	
}
