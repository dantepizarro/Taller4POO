package Visitor;
import Dominio.*;
public interface Visitor {
    double visit(Pokemon p );
    double visit(Energy e);
    double visit(Item i);
    double visit(Supporter s);
}
