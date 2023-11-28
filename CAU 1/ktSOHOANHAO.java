package ktsohoanhao;
import java.util.Scanner;
public class ktSOHOANHAO {
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
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        if(perfectnum(n))
            System.out.println(+n+" la so hoan hao !");
        else
            System.out.println(+n+" khong phai so hoan hao !");
                
    }
    
}