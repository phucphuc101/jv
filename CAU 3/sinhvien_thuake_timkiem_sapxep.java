package sinhvien1;
import java.util.Scanner;
class sinhvien2{
    String ten;
    int tuoi;
    double d1,d2,d3;
    
    sinhvien2(){                                 //HÀM TẠO MẶC ĐỊNH 
        ten = "";
        tuoi = 0;
        d1 = 0;d2=0;d3=0;
    }
    void nhap(){                                //HÀM NHẬP THÔNG TIN SV
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten : ");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi = sc.nextInt();
        System.out.println("Nhap diem 1,2,3: ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        d3 = sc.nextDouble();
    }
     double diemtb(){
        return (d1+d2+d3)/3;
    }
    void xuat(){                                    //HÀM XUẤT THÔNG TIN SV
        System.out.println("Ten: "+ten);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("Diem 1: "+d1);
        System.out.println("Diem 2: "+d2);
        System.out.println("Diem 3: "+d3);
        System.out.println("Diem trung binh: "+diemtb());
    }
}
class sinhvienuutu extends sinhvien2{
    String loaiuutu;
    sinhvienuutu(){
        super();
        loaiuutu = "";
    }
    void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap loai uu tu :");
        loaiuutu = sc.nextLine();
    }
    void xuat(){
        super.xuat();
        System.out.println("Loai uu tu: "+loaiuutu);
    }
}

public class sinhvien_thuake {
    public static void timkiem(sinhvien2 sv[],int n){
        int t=0;
        Scanner sc1 = new Scanner(System.in);
        String st;
        System.out.println("Nhap ten sinh vien can tim : ");
        st = sc1.nextLine();
        System.out.println("Sinh vien can tim la : ");
        for (int i = 0; i < n; i++) {
            if(sv[i].ten.contentEquals(st) == true){
                sv[i].xuat();
                t=1;
            }
        }
        if(t==0)System.out.println("Khong co sinh vien can tim !");
}
    public static void sapxep_ten(sinhvien2 sv[], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(sv[i].ten.compareTo(sv[j].ten)>0){
                    sinhvien2 temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }  
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien ");
        int n = sc.nextInt();
        int choice = 0,t=0;
        sinhvien2 sv[] = new sinhvien2[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhap loai sinh vien: (1 - Sinh vien thuong; 2 - Sinh vien uu tu)");
            choice = sc.nextInt();
            if 
                    (choice == 1) sv[i] = new sinhvien2();
            else   
                     sv[i] = new sinhvienuutu();
            sv[i].nhap();
        }
        sapxep_ten(sv, n);
        System.out.println("Thong tin sinh vien da nhap la: ");
        for(int i=0;i<n;i++){
            System.out.println("Sinh vien thu "+i+":");
            sv[i].xuat();
        }
        timkiem(sv, n);
    }
}