package aplicacion;
import mates.*;

/**
 * @author Genesis Chicaiza
 * Esta clase es una prueba
 */

    public class Principal {
        public static void main(String[] args) {
            // probando
            String s1 = "terror";
            String s2 = "error";
            System.out.println("Distancia de edición entre '" + s1 + "' y '" + s2 + "': " + Matematicas.distance(s1, s2));
        }
    }