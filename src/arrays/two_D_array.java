package arrays;

import java.util.Scanner;

public class two_D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int r = sc.nextInt();
        System.out.println("Enter no of columns");
        int c = sc.nextInt();

        int a[][] = new int[r][c];//array declaration and initialization of rows and columns

        System.out.println("Enter values:");
        for (int i = 0; i < r; i++) { //r=2 c=3

            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt(); // a[0][0],a[0][1],a[0][2] || a[1][0],a[1][1],a[1][2] ||

            }
        }

        for (int i = 0; i < r; i++) { //r=2 c=3
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();

        }
    }
}
