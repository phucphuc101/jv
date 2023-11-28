//3.1 - LINH KIỆN ĐIỆN TỬ - CODING BY KIEN MIC - CNT58DH

/*3.1 Một hệ thống quản lý các sản phẩm linh kiện điện tử gồm một số loại sản phẩm sau : điện trở, cuộn cảm, tụ điện, bjt.

Trong đó các linh kiện này đều có thông số chung là : mã sản phẩm, hãng sản xuất, số lượng hàng có sẵn
- Điện trở có thêm các thông số : Giá trị điện trở, mã kích thước, công suất
- Cuộn cảm có thêm thông số : Điện cảm, dòng điện làm việc trung bình cho phép
- Tụ điện có các thông số : Loại tụ (Tụ hóa, tụ gốm, tụ polyester ...), điện áp làm việc, điện dung của tụ 
- BJT có thêm các thông số : Điện áp cho phép (Vcbo và Vceo), dòng giới hạn (Ic), hệ số khuếch đại (hFE), loại (npn - pnp) 

Viết chương trình quản lý các loại linh kiện này cho phép 
a. Thêm linh kiện mới và cho phép nhập thông tin về linh kiện đó 
b. Xóa một linh kiện theo mã linh kiện 
c. In ra danh sách các loại linh kiện 
d. Sắp xếp các sản phẩm theo mã sản phẩm 
e. Tìm các sản phẩm theo mã sản phẩm */

package linhkiendientu;
import java.util.Scanner;
class linhkien{ //SUPER CLASS
    String masp;
    String hangsx;
    int soluong;
    void nhap(){ // NHẬP THÔNG TIN
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        masp = sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        hangsx = sc.nextLine();
        System.out.println("Mhap so luong hang co san : ");
        soluong = sc.nextInt();
    }
    void xuat(){ //XUẤT THÔNG TIN
        System.out.println("Hang da nhap la : ");
        System.out.println("Ma san pham: "+masp);
        System.out.println("Hang san xuat: "+hangsx);
        System.out.println("So luong hang co san: "+soluong);
    }
}
//------------------------------------------------------------------------
    class dientro extends linhkien{
        int giatri;
        String makichthuoc;
        int congsuat;
        void nhap(){
            Scanner sc = new Scanner(System.in);
            super.nhap();
            System.out.println("Nhap gia tri dien tro: ");
            giatri = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap ma kich thuoc : ");
            makichthuoc = sc.nextLine();
            System.out.println("Nhap cong suat: ");
            congsuat = sc.nextInt();
        }
        void xuat(){
            super.xuat();
            System.out.println("Gia tri dien tro : "+giatri+"Om");
            System.out.println("Ma kich thuoc: "+makichthuoc);
            System.out.println("Cong suat: "+congsuat+"W");
        }
    }
//------------------------------------------------------------------------------
    class cuoncam extends linhkien{
        int diencam;
        int dongdienlamviec;
        void nhap(){
            Scanner sc = new Scanner(System.in);
            super.nhap();
            System.out.println("Nhap dien cam: ");
            diencam = sc.nextInt();
            System.out.println("Nhap dong dien lam viec : ");
            dongdienlamviec = sc.nextInt();
        }
        void xuat(){
            super.xuat();
            System.out.println("Dien cam : "+diencam);
            System.out.println("Dong dien lam viec: "+dongdienlamviec);
        }
    }
//-----------------------------------------------------------------------------
    class tudien extends linhkien{
        String loaitu;
        int dienaplamviec;
        int diendung;
        void nhap(){
            Scanner sc = new Scanner(System.in);
            super.nhap();
            System.out.println("Nhap loai tu: ");
            loaitu = sc.nextLine();
            System.out.println("Nhap dien ap lam viec: ");
            dienaplamviec = sc.nextInt();
            System.out.println("Nhap dien dung cua tu: ");
            diendung = sc.nextInt();
        }
        void xuat(){
            super.xuat();
             System.out.println("Loai tu: "+loaitu);
             System.out.println("Dien ap lam viec: "+dienaplamviec);
             System.out.println("Dien dung cua tu: "+diendung);
        }   
    }
//-----------------------------------------------------------------------------
    class BJT extends linhkien{
        int dienapchophep;
        int donggioihan;
        int heso;
        String loai;
        void nhap(){
            Scanner sc = new Scanner(System.in);
            super.nhap();
            System.out.println("Nhap dien ap cho phep: ");
            dienapchophep = sc.nextInt();
            System.out.println("Nhap dong gioi han: ");
            donggioihan = sc.nextInt();
            System.out.println("Nhap he so khuech dai: ");
            heso = sc.nextInt();
            System.out.println("Nhap loai: ");
            loai = sc.nextLine();
    }
        void xuat(){
            super.xuat();
            System.out.println("Dien ap cho phep: "+dienapchophep);
            System.out.println("Dong gioi han: "+donggioihan);
            System.out.println("He so khuech dai: "+heso);
            System.out.println("Loai: "+loai);
        }
    }
//---------------------------------------------------------------------------
public class Linhkiendientu {
    public static void timkiem_ma(linhkien lkdt[],int n){ //TÌM KIẾM THEO MÃ
        int t = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma linh kien can tim: ");
        String st = sc.nextLine();
        System.out.println("Thong tin linh kien can tim la: ");
        for (int i = 0; i < n; i++) {
            if(lkdt[i].masp.contentEquals(st) == true)
                lkdt[i].xuat();
                t = 1;
        }
        if(t==0) System.out.println("Khong tim thay linh kien co ma san pham do !");
    }
    public static void sapxep_ma(linhkien lkdt[],int n){ //SẮP XẾP THEO MÃ
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(lkdt[i].masp.compareTo(lkdt[j].masp)>0){
                    linhkien temp = lkdt[i];
                    lkdt[i] = lkdt[j];
                    lkdt[j] = temp;
                }
            }
        }
    }
    public static void xoa_ma(linhkien lkdt[],int n){ //XÓA LINH KIỆN THEO MÃ
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham cua linh kien muon xoa : ");
        String ma = sc.nextLine();
        int c,i;
        for(c=i=0;i<n;i++){
            if(lkdt[i].masp.contentEquals(ma) == false){
                lkdt[c] = lkdt[i];
                c++;
            }
        }
        n = c;
        System.out.println("Danh sach linh kien sau khi da xoa : ");
        for (i = 0; i < n; i++) {
            lkdt[i].xuat();
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       linhkien lkdt[];
       int n;
        System.out.println("Nhap so linh kien: ");
        n = sc.nextInt();
        lkdt = new linhkien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai san pham: (1- Dien tro ; 2- Cuon cam ; 3- Tu dien ; 4- BJT)");
            int choice = sc.nextInt();
            if(choice == 1 ) lkdt[i] = new dientro();
            if(choice == 2 ) lkdt[i] = new cuoncam();
            if(choice == 3 ) lkdt[i] = new tudien();
            if(choice == 4 ) lkdt[i] = new BJT();
            lkdt[i].nhap();
        }
        sapxep_ma(lkdt, n);
        System.out.println("Thong tin linh kien da nhap (Sap xep theo ma tang dan): "); 
        for (int i = 0; i < n; i++) {
            lkdt[i].xuat();
        }
        timkiem_ma(lkdt, n);
        xoa_ma(lkdt, n);
    } 
}
