package arrays;

import java.util.Scanner;

public class array_creation {

    public static void main(String[] args){
        //take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of elements in array");
        int n=sc.nextInt();

        int a[]=new int[n];//create new array initialise with n elements

        System.out.println("Enter values");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();//a[0],a[1],.....
        }
        System.out.println("Elements are:"); //print array elements
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
