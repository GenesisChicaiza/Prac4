package mates;

 /**
     *@author Genesis Chicaiza
     * clase que contiene los calculos realizados para calcular la distancia
     */


public class Matematicas{
      /**
     * @param: Calcula la distancia de edición entre dos cadenas s1 y s2
     * @return: distancia entre las cadenas
     */
    public static int distance(String s1, String s2) {
        // matriz 
        int[][] mat = new int[s1.length() + 1][s2.length() + 1];

        // fila / columna de matriz
        for (int i = 0; i <= s1.length(); i++) {
            mat[i][0] = i;
        }
        for (int j = 0; j <= s2.length(); j++) {
            mat[0][j] = j;
        }

        // algoritmo de programación dinámica
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    mat[i][j] = mat[i - 1][j - 1]; 
                } else {
                    mat[i][j] = 1 + Math.min(mat[i - 1][j - 1], Math.min(mat[i][j - 1], mat[i - 1][j]));
                    
                }
            }
        }

       //donde se encuentra la distancia en la matriz 
        return mat[s1.length()][s2.length()];
    }

}
