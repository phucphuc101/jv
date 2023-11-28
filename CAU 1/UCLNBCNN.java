import java.util.Scanner;
public class UCLNBCNN {
    //Uoc chung lon nhat
    public static int UCLN(int a,int b){
        if(a==0||b==0) return (a+b);
	while(a!=b){
            if(a>b)
                a-=b;
            else
                b-=a;
        }
        return a;
    }
    //Boi chung nho nhat
    public static int BCNN(int a,int b){
        return (a*b)/UCLN(a,b);
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x,y(UCLN,BCNN):");
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("UCLN cua "+x+","+y+" la: "+UCLN(x,y));
        System.out.println("BCNN cua "+x+","+y+" la: "+BCNN(x,y));

    }
}
