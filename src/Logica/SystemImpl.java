package Logica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import Dominio.*;
import Strategy.EstrategiaOrdenar;
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
        while (scan.hasNextLine()) {
            String linea = scan.nextLine();
            Carta c = CartasFactory.LeerLinea(linea);
            catalogo.add(c);
        }
        
        
    }
    @Override
    public void EstrategiaOrdenar(EstrategiaOrdenar estrategia) {
        List<Carta> copia = estrategia.Ordenar(catalogo);
        if(copia.isEmpty()) {
            System.out.println("No se pudo Ordenar");
            return;
        }
    }

    
}
