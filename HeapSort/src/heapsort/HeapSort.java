/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapsort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sinarik
 */
public class HeapSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        heap nesne = new heap();
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int n, i;

        System.out.println("Kaç elemanlı ağaç istiyorsunuz?");
        n = scan.nextInt();

        int arr[] = new int[n];

        System.out.println("\nAğacınız:");
        for (i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(101);
            System.out.print(arr[i] + " ");

        }
        System.out.println("");
        nesne.sort(arr);

        System.out.println("\nSıralı ağacınız:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        nesne.goster();
    }
}
