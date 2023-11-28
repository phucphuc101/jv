package sochinhphuong;
import java.lang.Math;
import java.util.Scanner;
public class SoChinhPhuong {
    public static boolean checkscp(int n){
        double sqrt = Math.sqrt(n);
        if(n == sqrt*sqrt)
            return true;
        else
            return false;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        if(checkscp(n))
            System.out.println(+n+" la so chinh phuong !");
        else
            System.out.println(+n+" khong phai so chinh phuong !");
                
    }
    
}
