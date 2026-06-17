package Dominio;

public class Supporter extends Carta {
	protected int Efects;

	public Supporter(String nombreCarta, int rareza, String tipo, int efects) {
		super(nombreCarta, rareza, tipo);
		Efects = efects;
	}
	
}
