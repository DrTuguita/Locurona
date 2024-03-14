package ud05programapropuesto08;
import java.util.*;


public class Cola {
    Integer[] tabla;
    
    Cola() {
        tabla = new Integer[0];
    }
    
    
    void encolar(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length+1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length-1);
        tabla[0] = nuevo;
    }
    
   
    
    Integer desencolar() {
        Integer eliminado = null;
        
        if (tabla.length != 0) {
            eliminado = tabla[tabla.length-1];
            tabla = Arrays.copyOf(tabla, tabla.length-1);
        }
        
        return eliminado;
    }
    
    
    Integer get(int indice) {
        Integer resultado = null;
        
        if (indice >= 0 && indice < tabla.length) {
            resultado = tabla[indice];
        }
        
        return resultado;
    }
    
    
    int buscar(Integer claveBusqueda) {
        int indice = -1;
        
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        
        return indice;
    }
    
    
    public int numeroElementos() {
        return tabla.length;
    }
    
    
    public void mostrar() {
        System.out.println("Lista: " + Arrays.toString(tabla));
    }
    
}
