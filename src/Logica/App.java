package Logica;
import java.io.IOException;
import java.util.Scanner;

public class App {
	private static Scanner scan;
    private static SystemImpl sys = SystemImpl.getInstance();
    public static void main(String[] args) throws IOException{
    	sys.LeerArchivo("Sobres.txt");
    	
    }
    
}
