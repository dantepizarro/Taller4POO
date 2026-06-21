package Visitor;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class VisitorPuntaje implements Visitor{
    private double Poder;

    public double getPoder(){ return Poder;}
    @Override
    public void visit(Pokemon p) {
        Poder = (p.getDamage()/p.getCantEnergy())*100;
    }

    @Override
    public void visit(Energy e) {
        Poder = 1;
    }

    @Override
    public void visit(Item i) {
        Poder = i.getBonifi()*20;
    }

    @Override
    public void visit(Supporter s) {
        Poder = s.getEfects()*50;
    }
    
}
