package arrays;

import java.util.Scanner;

public class array_deletion {

     public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no. of elements in an array");
            int n= sc.nextInt();

            int a[]=new int[n];//first array with n size
            int b[]=new int [n-1];//new array with size-1

            System.out.println("Enter values");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();//a[0],a[1],.....
            }

            System.out.println("Enter index of a new value to be deleted");
            int m= sc.nextInt();//2
            for(int i=0;i< a.length;i++){ //a[]=10,20,30 40,50
                                          //b[]=10,20,40,50
                if(i<m){
                    b[i]=a[i];
                } else if (i==m)
                    continue;
                else {
                    b[i-1]=a[i];

                }
            }




            System.out.println("Elements are: ");//print array elements
            for(int i=0;i<n+1;i++){
                System.out.println(b[i]) ;
            }


        }
    }


