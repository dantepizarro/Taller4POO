package Dominio;

import Visitor.Visitor;

public class Item extends Carta{
	protected int Bonifi;
	

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

	


	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}


	
	
}
