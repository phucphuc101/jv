//3.2 - XE - CODING BY KIEN MUC - CNT58DH

/* 3.2. Có hai loại xe là xe chạy xăng và xe chạy điện. 

Cả hai loại xe đều có các thông số chung : màu xe, công suất, momen xoắn, hãng xe, mã xe, số khung
- Xe chạy điện có thêm các thông số riêng : Dung lượng pin, thời gian sạc đầy 
- Xe chạy xăng có thêm các thông số riêng : Dung tích bình xăng, loại xăng 

Xây dựng một chương trình quản lý danh sách các xe gồm các chức năng sau : 
a. Thêm một xe mới 
b. Xóa một xe ra khỏi danh sách 
c. In ra danh sách các xe 
d. Sắp xếp danh sách xe theo số khung 
e. Tìm kiếm các xe theo màu xe */

package xe;
import java.util.Scanner;
class xe1{
    String mauxe;
    int congsuat;
    int momenxoan;
    String hangxe;
    String maxe;
    int sokhung;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap màu xe : ");
        mauxe = sc.nextLine();
        System.out.println("Nhap cong suat: ");
        congsuat = sc.nextInt();
        System.out.println("Nhap momen xoan: ");
        momenxoan = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap hang xe: ");
        hangxe = sc1.nextLine();
        System.out.println("Nhap ma xe: ");
        maxe = sc1.nextLine();
        System.out.println("Nhap so khung: ");
        sokhung = sc.nextInt();
    }
    void xuat(){
        System.out.println("Mau xe: "+mauxe);
        System.out.println("Cong suat: "+congsuat);
        System.out.println("Momen xoan"+momenxoan);
        System.out.println("Hang xe: "+hangxe);
        System.out.println("Ma xe: "+maxe);
        System.out.println("So khung: "+sokhung);
    }
}
class xedien extends xe1{
    int dungluongpin;
    int tgiansacday;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap dung luong pin : ");
        dungluongpin = sc.nextInt();
        System.out.println("Nhap thoi gian sac day: ");
        tgiansacday = sc.nextInt();
    }
   void xuat(){
       super.xuat();
       System.out.println("Dung luong pin : "+dungluongpin+"mAh");
       System.out.println("Thoi gian sac day: "+tgiansacday+"H");
   }     
}
class xexang extends xe1{
    int dungtich;
    String loaixang;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap dung tich binh xang: ");
        dungtich = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap loai xang: ");
        loaixang = sc2.nextLine();
    }
    void xuat(){
        super.xuat();
        System.out.println("Dung tich binh xang: "+dungtich+"L");
        System.out.println("Loai xang: "+loaixang);
    }
}
public class XE {
public static void timkiem_mau(xe1 x[],int n){ //TÌM KIẾM THEO MÀU
        int t = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau xe can tim: ");
        String st = sc.nextLine();
        System.out.println("Thong tin xe can tim la: ");
        for (int i = 0; i < n; i++) {
            if(x[i].mauxe.contentEquals(st) == true)
                x[i].xuat();
                t = 1;
        }
        if(t==0) System.out.println("Khong tim thay xe có mau do !");
}
    public static void sapxep_ma(xe1 x[],int n){ //SẮP XẾP THEO MÃ
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(x[i].sokhung> x[j].sokhung){
                    xe1 temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
    public static void xoa_mau(xe1 x[],int n){ //XÓA XE THEO MÀU XE
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau xe muon xoa : ");
        String color = sc.nextLine();
        int c,i;
        for(c=i=0;i<n;i++){
            if(x[i].mauxe.contentEquals(color) == false){
                x[c] = x[i];
                c++;
            }
        }
        n = c;
        System.out.println("Danh sach xe sau khi da xoa : ");
        for (i = 0; i < n; i++) {
            x[i].xuat();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        xe1 x[];
        int n;
        System.out.println("Nhap so luong xe: ");
        n = sc.nextInt();
        x = new xe1 [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai xe (1- Xe dien ; 2 - Xe xang): ");
            int choice = sc.nextInt();
            if (choice == 1) x[i] = new xedien();
            if (choice == 2) x[i] = new xexang();
            x[i].nhap();
        }
        sapxep_ma(x, n);
        System.out.println("Danh sach xe sap xep theo ma : ");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin xe "+i+":");
            x[i].xuat();
        }
        timkiem_mau(x, n);
        xoa_mau(x, n);
    }
    
}
