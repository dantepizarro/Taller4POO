package Dominio;

import Visitor.Visitor;

public class Item extends Carta{
	protected int Bonifi;
	protected double Poder;

	public Item(String nombreCarta, int rareza, String tipo, int bonifi) {
		super(nombreCarta, rareza, tipo);
		Bonifi = bonifi;
	}


	public int getBonifi() {
		return Bonifi;
	}

	public void setBonifi(int bonifi) {
		Bonifi = bonifi;
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
