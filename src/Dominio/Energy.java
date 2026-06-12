package Dominio;

public class Energy extends Carta {
	protected String Element;

	protected Energy(String nombreCarta, int rareza, String tipo, String element) {
		super(nombreCarta, rareza, tipo);
		Element = element;
	}
	
	
}
