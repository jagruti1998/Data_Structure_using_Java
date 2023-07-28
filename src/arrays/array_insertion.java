package arrays;

import java.util.Scanner;

public class array_insertion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter no. of elements in an array");
        int n= sc.nextInt();

        int a[]=new int[n];
        int b[]=new int [n+1];//new array with +1 size

        System.out.println("Enter values");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();//a[0],a[1],.....
        }

        System.out.println("Enter index of a new value to be inserted");
        int m= sc.nextInt();//2
        System.out.println("Enter new value to be inserted");
        int p= sc.nextInt();

        for(int i=0;i<n+1;i++){// 10,20,30,40,50
            if(i<m){ //10 20 80
                b[i]=a[i];
            }
            else if(i==m){
                b[i]=p;
            }
            else {
                b[i]=a[i-1];//
            }
        }

        System.out.println("Elements are: ");
        for(int i=0;i<n+1;i++){
            System.out.println(b[i]) ;
        }


    }
}
