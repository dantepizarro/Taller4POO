package Logica;
import java.io.IOException;
import java.util.List;

import Dominio.*;
import Strategy.EstrategiaOrdenar;
public interface Sistema {
    void LeerArchivo(String ruta) throws IOException;
    void EstrategiaOrdenar(EstrategiaOrdenar estrategia);
    
}
