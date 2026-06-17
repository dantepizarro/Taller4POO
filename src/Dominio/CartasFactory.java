package Dominio;


public class CartasFactory {
    public static Carta LeerLinea(String linea){
        String[] partes = linea.split(";");
        String NombreCarta = partes[0];
        int Rareza = Integer.parseInt(partes[1]);
        String tipo = partes[2];
        switch (tipo) {
            case "Pokemon":
                int Damage = Integer.parseInt(partes[3]);
                int cantEnergias = Integer.parseInt(partes[4]);
                return new Pokemon(NombreCarta,Rareza,tipo,Damage,cantEnergias);
            case "Energy":
                String elemento = partes[3];
                return new Energy(NombreCarta,Rareza,tipo,elemento);
            case "Item":
                int Bonificacion = Integer.parseInt(partes[3]);
                return new Item(NombreCarta,Rareza,tipo,Bonificacion);
            case "Supporter":
                int EfectorPorTurno = Integer.parseInt(partes[3]);
                return new Supporter(NombreCarta,Rareza,tipo,EfectorPorTurno);
            default:
            return null;
            
        }
    }
}
