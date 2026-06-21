package Visitor;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class VisitorPoder implements Visitor{
    private double Poder;

    public double getPoder(){ return Poder;}
    @Override
    public double visit(Pokemon p) {
        Poder = (p.getDamage()/p.getCantEnergy())*100;
        return Poder;
    }

    @Override
    public double visit(Energy e) {
        Poder = 1;
        return Poder;
    }

    @Override
    public double visit(Item i) {
        Poder = i.getBonifi()*20;
        return Poder;
    }

    @Override
    public double visit(Supporter s) {
        Poder = s.getEfects()*50;
        return Poder;
    }
    
}
