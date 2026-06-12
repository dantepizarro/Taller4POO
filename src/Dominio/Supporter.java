package Dominio;

public class Supporter extends Carta {
	protected int Efects;

	protected Supporter(String nombreCarta, int rareza, String tipo, int efects) {
		super(nombreCarta, rareza, tipo);
		Efects = efects;
	}
	
}
