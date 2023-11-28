package array;

import java.util.Scanner;

public class Array_sotrongdoanab {
     public static void nhapMang(int X[],int n){
        for(int i=0;i<n;i++){
            System.out.print("X["+i+"]= ");
            Scanner sc = new Scanner(System.in);
            X[i] = sc.nextInt();
        }
    }
    public static void inMang(int X[],int n){
        System.out.println("Mang da nhap la: ");
        for(int i=0;i<n;i++){
            System.out.println(X[i]+" ");
        }
    }
    public static void doanab(int X[],int n,int a,int b){
        int t=0,sum=0,tbc=0;
        System.out.println("Cac so trong doan [a,b] la :");
        for(int i=0;i<n;i++){
            if(X[i]>=a && X[i]<=b){
                System.out.println(X[i]);
                t++;
                sum+=X[i];
            }
        }
        tbc = sum/t;
        System.out.println("Tong cac so trong doan [a,b] la: "+sum);
        System.out.println("Trung binh cong cac so trong doan [a,b] la: "+tbc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int X[];
        int a,b;
        X = new int [n];
        nhapMang(X,n);
        inMang(X,n);
        System.out.println("Nhap doan [a,b]: ");
        a = sc.nextInt();
        b = sc.nextInt();
        doanab(X,n,a,b);
    }
}
