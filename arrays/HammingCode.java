package Algorithms;

import java.util.*;

public class HammingCode {

    static boolean power2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of data bits: ");
        int m = sc.nextInt();

        int[] data = new int[m];

        System.out.println("Enter the data bits:");
        for (int i = 0; i < m; i++)
            data[i] = sc.nextInt();

        // Find number of parity bits
        int r = 0;
        while (Math.pow(2, r) < m + r + 1)
            r++;

        System.out.println("Number of parity bits required: " + r);

        int n = m + r;
        int[] h = new int[n + 1];

        // Put data bits
        int j = 0;

        for (int i = 1; i <= n; i++) {
            if (!power2(i)) {
                h[i] = data[j];
                j++;
            }
        }

        // Calculate parity bits
        for (int p = 1; p <= n; p = p * 2) {

            int parity = 0;

            for (int i = 1; i <= n; i++) {
                if ((i & p) != 0)
                    parity = parity ^ h[i];
            }

            h[p] = parity;
        }

        System.out.println("\nGenerated Hamming Code:");

        for (int i = n; i >= 1; i--)
            System.out.print(h[i]);

        // Receive Hamming code
        int[] received = new int[n + 1];

        System.out.println("\n\nEnter the received Hamming Code:");
        System.out.println("Enter " + n + " bits:");

        for (int i = n; i >= 1; i--)
            received[i] = sc.nextInt();

        // Find error position
        int error = 0;

        for (int p = 1; p <= n; p = p * 2) {

            int parity = 0;

            for (int i = 1; i <= n; i++) {
                if ((i & p) != 0)
                    parity = parity ^ received[i];
            }

            if (parity != 0)
                error = error + p;
        }

        if (error == 0) {
            System.out.println("\nNo error detected.");
        }
        else {
            System.out.println("\nError detected at position: " + error);

            received[error] = received[error] == 0 ? 1 : 0;

            System.out.println("Corrected Hamming Code:");

            for (int i = n; i >= 1; i--)
                System.out.print(received[i]);
        }

        sc.close();
    }
}