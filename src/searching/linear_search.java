package searching;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int n, item, i, c;
        int a[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of elements to be entered");
        n = sc.nextInt();
        a = new int[n]; // n size array

        System.out.println("Enter elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter item to find");
        item = sc.nextInt();

        c = 0; // Reset the counter for each new search

        for (i = 0; i < a.length; i++) {
            if (a[i] == item) {
                c++;
            }
        }

        if (c > 0) {
            System.out.println("Item exists, found " + c + " times. at " +i);
        } else {
            System.out.println("Item does not exist.");
        }
    }
}
