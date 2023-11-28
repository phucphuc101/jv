/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author NTK
 */
public class Array_Sapxep_2somin_2somax {
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
    public static void sapxep(int a[],int n){
        int tg;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    tg = a[i];
                    a[i] = a[j];
                    a[j] = tg;
            }
        }
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
        sapxep(a,n);
        System.out.println("Mang da sap xep theo thu tu giam dan:");
        inMang(a,n);
        System.out.println("Hai so lon nhat cua mang la: "+a[n-1]+","+a[n-2]);
        System.out.println("Hai so nho nhat cua mang la: "+a[0]+","+a[1]);
    }
}
