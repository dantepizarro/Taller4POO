package Dominio;

import Visitor.Visitor;

public class Energy extends Carta{
	protected String Element;
	

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

	

	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}

	
	
	
}
