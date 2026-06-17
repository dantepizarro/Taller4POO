package Dominio;

public class Item extends Carta {
	protected int Bonifi;

	public Item(String nombreCarta, int rareza, String tipo, int bonifi) {
		super(nombreCarta, rareza, tipo);
		Bonifi = bonifi;
	}
	
}
