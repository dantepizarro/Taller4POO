package Visitor;
import Dominio.*;
public interface Visitor {
    void visit(Pokemon p );
    void visit(Energy e);
    void visit(Item i);
    void visit(Supporter s);
}
