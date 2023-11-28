package array;
import java.util.Scanner;
public class Array_Soduongmin_Soammax {
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
    public static int soammax(int a[],int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                max = a[i];
                break;
            }
        }
        for(int j=0;j<n;j++){
            if(max<a[j] && a[j]<0)
                 max = a[j];
            }  
        return max;
        }
    public static int soduongmin(int a[],int n){
        int min = 0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                min = a[i];
                break;
            }
        }
                for(int j=0;j<n;j++){
                    if(min>a[j] && a[j]>0)
                        min = a[j];
                }
        return min;
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
        System.out.println("So am lon nhat cua mang la: "+soammax(a,n));
        System.out.println("So duong nho nhat cua mang la: "+soduongmin(a,n));
    }
    
}
