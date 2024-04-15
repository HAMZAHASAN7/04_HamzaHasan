package javaaaa;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        final int MAX_SIZE = 5;

        int[][] array = new int[3][];

        array[0] = new int[4];
        array[1] = new int[2];
        array[2] = new int[MAX_SIZE];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter data for row " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                if (scanner.hasNextInt()) {
                    array[i][j] = scanner.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next(); 
                    j--; 
                }
            }
        }

        scanner.close();
        System.out.println("Data stored in the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
