package aplicacion;
import mates.*;

    public class Principal {
        public static void main(String[] args) {
            // probando
            String s1 = "terror";
            String s2 = "error";
            System.out.println("Distancia de edición entre '" + s1 + "' y '" + s2 + "': " + Matematicas.calcularDistancia(s1, s2));
        }
    }