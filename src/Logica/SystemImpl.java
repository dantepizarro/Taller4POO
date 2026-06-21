package Logica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import Dominio.*;
import Strategy.EstrategiaOrdenar;
import Visitor.VisitorPoder;
public class SystemImpl implements Sistema {
    private static SystemImpl instance;
    private static List<Carta> catalogo = new ArrayList<>();
    private SystemImpl(){

    }
    public static SystemImpl getInstance(){
        if(instance == null) return new SystemImpl();
        return null;
    }
    @Override
    public void LeerArchivo(String ruta) throws IOException{
        Scanner scan = new Scanner(new File(ruta));
        VisitorPoder visitor = new VisitorPoder();
        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            Carta c = CartasFactory.LeerLinea(linea);
            catalogo.add(c);
            c.accept(visitor);
            c.setPoder(visitor.getPoder());
            c.setRutaImagen(c.getNombreCarta()+".png");
        }
        
        
    }
    @Override
    public String EstrategiaOrdenar(EstrategiaOrdenar estrategia) {
        List<Carta> copia = estrategia.Ordenar(catalogo);
        if(copia.isEmpty()) {
            return "No se pudo Ordenar";
        }
        String lista = "";
        for(Carta c : copia){
            lista = lista + c.getNombreCarta()+ "\n";
        }
        return lista;
    }


    
}
