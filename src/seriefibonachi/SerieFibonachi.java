/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seriefibonachi;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SerieFibonachi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie Fibonacci: ");
        int n = scanner.nextInt();

        int primero = 0, segundo = 1;

        System.out.print("Serie Fibonacci de " + n + " términos: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(primero + " ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}

