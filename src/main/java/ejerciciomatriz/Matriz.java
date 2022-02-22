/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomatriz;

import java.util.ArrayList;

/**
 *
 * @author cristina
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetodosMatriz matriz = new MetodosMatriz();
        
        ArrayList<Integer> lista = new ArrayList<>();
        matriz.mostrarMatriz();

        //Columna
        lista = matriz.recorrerColumna(2);
        System.out.println("la lista de la columna es: ");
        for (Integer integer : lista) {
            System.out.print(integer + " , ");
        }
        System.out.println("");

        //Fila
        lista = matriz.recorrerFila(2);
        System.out.println("la lista de la fila es: ");
        for (Integer integer : lista) {
            System.out.print(integer + " , ");
        }
        System.out.println("");

        //Vecinas
        lista = matriz.recorrerVecinas(2, 2);
        
        System.out.println("la lista de la vecina es: ");
        for (Integer integer : lista) {
            System.out.print(integer + " , ");
        }
        System.out.println("");
        System.out.println("Con doble bucle for------");
        matriz.recorrerVecinasConFor(2, 2);
    }

}
