package tong_tbc_uoc;
import java.util.Scanner;
public class TONG_TBC_UOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen n: ");
        int n,sum=0,t=0;
        n = sc.nextInt();
        System.out.print("Cac uoc cua so "+n+"la: ");
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
                sum+=i;
                t++;
            }
        }
        System.out.println("");
        int tbc = sum/t;
        System.out.println("Tong cac uoc cua "+n+" la: "+sum);
        System.out.println("Trung binh cong cac uoc cua "+n+" la: "+tbc);
    }  
}
