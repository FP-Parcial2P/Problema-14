/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg14;

/**
 *
 * @author Raziel 2
 */
public class Problema14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Crear tabla de tamaño 7X7 donde la diagonal principal sean 1 y los demas numeros 0
        int [][]matriz = new int[7][7];      //Matriz
        crearTabla(matriz);
        mostrarTabla(matriz);
    }
    public static int[][] crearTabla(int[][]m){  //Método para crear la tabla 
        int i,j;
        for (i=0; i<m.length;i++){
            for(j=0;j<m.length;j++){
            if ((i==j)){                         //Mientras que i sea igual a j (mismo num de columna y fila)
                m[i][j] = 1;}
            else {m[i][j] = 0;}
        }          
        }
        return m;
}
    public static void mostrarTabla (int[][]m){ //Mostrar la tabla ordenada
        for (int i=0; i<m.length;i++){
            for(int j=0;j<m.length;j++){
                System.out.print(m[i][j]+"\t"); //Oredenar la tabla (tabulación)
                }
            System.out.print("\n");             //Ordenar la tabla (Espacios)
    }
}
}