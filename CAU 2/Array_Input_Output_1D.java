package array;

import java.util.Scanner;

public class Array_Input_Output_1D {
        public static void nhapMang(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            Scanner sc = new Scanner(System.in);
            a[i] = sc.nextInt();
        }
    }
    public static void inMang(int a[],int n){
        System.out.println("Mang da nhap la: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int a[];
        a = new int [n];
        nhapMang(a,n);
        inMang(a,n);
    }
    
}
