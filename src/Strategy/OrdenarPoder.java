package Strategy;

import java.util.ArrayList;
import java.util.List;

import Dominio.Carta;

public class OrdenarPoder implements EstrategiaOrdenar{

    @Override
    public List<Carta> Ordenar(List<Carta> catalogo) {
        List<Carta> copia = new ArrayList<>();
        for(Carta c: catalogo) copia.add(c);

        for(int i = 0;i<copia.size()-1;i++){
            for(int j = i+1;j<copia.size();j++){
                
            }
        }
    }

}