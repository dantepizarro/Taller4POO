package Dominio;

public class Pokemon extends Carta {
	protected int Damage, CantEnergy;

	protected Pokemon(String nombreCarta, int rareza, String tipo, int damage, int cantEnergy) {
		super(nombreCarta, rareza, tipo);
		Damage = damage;
		CantEnergy = cantEnergy;
	}
}
