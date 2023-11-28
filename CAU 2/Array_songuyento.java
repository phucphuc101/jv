package array;

import java.util.Scanner;

public class Array_songuyento {
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
     public static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<=n/2;i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int a[],t = 0,tbc = 0,sum = 0;
        a = new int [n];
        nhapMang(a,n);
        inMang(a,n);
        System.out.println("Cac so nguyen to trong mang: ");
        for(int i=0;i<n;i++){
            if(prime(a[i])){
                System.out.println(a[i]+" ");
                sum +=a[i];
                t++;
            }
            if(t==0) System.out.println("Khong có so nguyen to trong mang !");
        }
        tbc = sum / t;
        System.out.println("So cac so nguyen to trong mang la: "+t);
        System.out.println("Trung binh cong cac so nguyen to trong mang la: "+tbc);
    }
    
}
