package minmax_number_notarray;
import java.util.Scanner;
public class Minmax_number_notarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,max = 0,min = 0;
        System.out.println("Nhap so phan tu: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap phan tu thu "+i+":");
            a = sc.nextInt();
            if(i == 1){
                max = a;
                min = a;
            }
            if(max<a) max = a;
            if(min>a) min = a;
        }
        System.out.println("So lon nhat trong "+n+" so da nhap la: "+max);
        System.out.println("So nho nhat trong "+n+" so da nhap la: "+min);
    }
    
}
