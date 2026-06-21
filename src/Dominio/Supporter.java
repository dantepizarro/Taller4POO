package Dominio;

import Visitor.Visitor;

public class Supporter extends Carta{
	protected int Efects;
	

	public Supporter(String nombreCarta, int rareza, String tipo, int efects) {
		super(nombreCarta, rareza, tipo);
		Efects = efects;
	}

	

	public int getEfects() {
		return Efects;
	}

	public void setEfects(int efects) {
		Efects = efects;
	}

	



	@Override
	public double accept(Visitor v) {
		return v.visit(this);
		
	}
	
}
