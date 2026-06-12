package Logica;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
	private static Scanner scan;
    public static void main(String[] args) {
    	LeerArchivo();
    	
    }
    public static void LeerArchivo()  {
    	try {
    	Scanner scanArch = new Scanner(new File("Sobres.txt"));
    	while (scanArch.hasNextLine()) {
    		String linea = scanArch.nextLine();

    	}
    	}catch(Exception e) {
    		System.out.println("Problemas al leer el archivo");
    	}
    }
}
