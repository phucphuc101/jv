package ktsonguyento;
import java.lang.Math;
import java.util.Scanner;
public class KtSONGUYENTO {
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
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        if(prime(n))
            System.out.println(+n+" la so nguyen to !");
        else
            System.out.println(+n+" khong phai so nguyen to !");
                
    }
    
}