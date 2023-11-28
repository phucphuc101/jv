package array;

import java.util.Scanner;

public class Array_sohoanhao {
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
     public static boolean perfectnum(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        if(sum == n) 
            return true;
        else
            return false;
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
        System.out.println("Cac so hoan hao trong mang: ");
        for(int i=0;i<n;i++){
            if(perfectnum(a[i])){
                System.out.println(a[i]+" ");
                sum +=a[i];
                t++;
            }
            if(t==0) System.out.println("Khong có so hoan hao trong mang !");
        }
        tbc = sum / t;
        System.out.println("So cac so hoan hao trong mang la: "+t);
        System.out.println("Trung binh cong cac so hoan hao trong mang la: "+tbc);
    }
    
}
