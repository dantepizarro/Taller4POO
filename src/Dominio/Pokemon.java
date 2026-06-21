package Dominio;

import Visitor.Visitor;

public class Pokemon extends Carta{
	protected int Damage, CantEnergy;
	

	protected Pokemon(String nombreCarta, int rareza, String tipo, int damage, int cantEnergy) {
		super(nombreCarta, rareza, tipo);
		Damage = damage;
		CantEnergy = cantEnergy;
	}

	

	public int getDamage() {
		return Damage;
	}

	public void setDamage(int damage) {
		Damage = damage;
	}

	public int getCantEnergy() {
		return CantEnergy;
	}

	public void setCantEnergy(int cantEnergy) {
		CantEnergy = cantEnergy;
	}

	



	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}
}
