package Strategy;

import java.util.ArrayList;
import java.util.List;

import Dominio.Carta;

public class OrdenarNombre implements EstrategiaOrdenar{

    @Override
    public List<Carta> Ordenar(List<Carta> catalogo) {
        List<Carta> copia = new ArrayList<>();
        for(Carta c: catalogo) copia.add(c);

        for(int i = 0;i<copia.size()-1;i++){
            for(int j = i+1;j<copia.size();j++){
                if(copia.get(i).getNombreCarta().compareTo(copia.get(j).getNombreCarta()) > 0){
                    Carta temp = copia.get(i);
                    copia.set(i, copia.get(j));
                    copia.set(j, temp);
                }
            }
        }
        return copia;
    }
    
}
