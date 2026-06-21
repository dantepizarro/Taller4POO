package Dominio;

import Visitor.Visitor;

public class Supporter extends Carta{
	protected int Efects;
	protected double Poder;

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
