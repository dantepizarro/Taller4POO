package Logica;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

import Strategy.EstrategiaOrdenar;
import Strategy.OrdenarNombre;
import Strategy.OrdenarPoder;
import Strategy.OrdenarRareza;

public class App {
	private static Scanner scan;
    private static SystemImpl sys = SystemImpl.getInstance();
    public static void main(String[] args) throws IOException{
    	sys.LeerArchivo("Sobres.txt");
        Ordenar();
    	iniciar();
    }
    public static void iniciar(){
        JFrame principal = new JFrame("Menu Principal");
        principal.setSize(300,400);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setVisible(true);

    }
    public static void Ordenar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Eliga su Ordenamiento: ");
        System.out.println("1) Por Rareza: ");
        System.out.println("2) Por Nombre: ");
        System.out.println("3) Por Poder: ");
        int opcion = Integer.parseInt(scan.nextLine());

        EstrategiaOrdenar estrategia = null;

        if(opcion == 1){
            estrategia = new OrdenarRareza();
        }else if(opcion == 2){
            estrategia = new OrdenarNombre();
        }else if(opcion == 3){
            estrategia = new OrdenarPoder();
        }else{
            System.out.println("opcion invalida");
            return;
        }
        System.out.println(sys.EstrategiaOrdenar(estrategia));;
    }
    
}
