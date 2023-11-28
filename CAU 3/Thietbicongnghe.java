//3.3 - THIẾT BỊ CÔNG NGHỆ - CODING BY KIEN MUC - CNT58DH
/*3.3. Có một cửa hàng chuyên bán thiết bị công nghệ gồm có hai nhóm sản phẩm : Phần mềm và thiết bị phần cứng 

Cả hai nhóm sản phẩm này đều có điểm chung là : Giá sản phẩm, mã sản phẩm, tên sản phẩm, mô tả
- Sản phẩm phần cứng có thêm thông tin : kích thước, khối lượng 
- Sản phẩm phần mềm có thêm thông tin : Hỗ trợ các hệ điều hành, yêu cầu về phần cứng tối thiểu, thông số khuyến cáo, loại hình (thuê bao, vĩnh viễn)

Xây dựng chương trình quản lý danh sách các phần mềm cho cửa hàng này, bao gồm các chức năng sau:
a. Thêm một sản phẩm mới
b. Xóa một sản phẩm khỏi danh sách dựa theo mã sản phẩm
c. In ra danh sách các sản phẩm 
d. Sắp xếp các sản phẩm theo tên 
e. Tìm kiếm sản phẩm theo mã sản phẩm*/

package thietbicongnghe;
import java.util.Scanner;
class sanpham{
    int giasp;
    int masp;
    String ten;
    String mota;
    void nhap(){
        System.out.println("Nhap ten san pham :");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        System.out.println("Nhap ma san pham: ");
        masp = sc.nextInt();
        System.out.println("Nhap gia san pham: ");
        giasp = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mo ta san pham: ");
        mota = sc.nextLine();
    }
    void xuat(){
        System.out.println("Ten san pham: "+ten);
        System.out.println("Ma san pham: "+masp);
        System.out.println("Gia san pham: "+giasp);
        System.out.println("Mo ta san pham: "+mota);
    }
}
class phancung extends sanpham{
    String kichthuoc;
    int khoiluong;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap kich thuoc :");
        kichthuoc = sc.nextLine();
        System.out.println("Nhap khoi luong: ");
        khoiluong = sc.nextInt();
    }
    void xuat(){
        super.xuat();
        System.out.println("Kich thuoc: "+kichthuoc);
        System.out.println("Khoi luong: "+khoiluong);
    }
}
class phanmem extends sanpham{
    String hotrohdh;
    String yeucauhw;
    String thongso;
    String loaihinh;
    void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he dieu hanh ho tro: ");
        hotrohdh = sc.nextLine();
        System.out.println("Mhap yeu cau ve phan cung: ");
        yeucauhw = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap thong so khuyen cao: ");
        thongso = sc.nextLine();
        System.out.println("Nhap loai hinh (thue bao, vinh vien)");
        loaihinh = sc.nextLine();
    }
    void xuat(){
        System.out.println("He dieu hanh ho tro: "+hotrohdh);
        System.out.println("Yeu cau ve phan cung: "+yeucauhw);
        System.out.println("Thong so khuyen cao: "+thongso);
        System.out.println("Loai hinh: "+loaihinh);
    }
}
public class Thietbicongnghe {
public static void timkiem_ma(sanpham sp[],int n){ //TÌM KIẾM THEO MÃ
        int t = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham can tim: ");
        int ma = sc.nextInt();
        System.out.println("Thong tin san pham can tim la: ");
        for (int i = 0; i < n; i++) {
            if(sp[i].masp == ma){
                sp[i].xuat();
                t = 1;
        }
        if(t==0) System.out.println("Khong tim thay san pham do !");
    }
}
    public static void sapxep_ma(sanpham sp[],int n){ //SẮP XẾP THEO TÊN
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(sp[i].ten.compareTo(sp[j].ten)>0){
                    sanpham temp = sp[i];
                    sp[i] = sp[j];
                    sp[j] = temp;
                }
            }
        }
    }
    public static void xoa_ma(sanpham sp[],int n){ //XÓA XE THEO MÀU XE
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mau xe muon xoa : ");
        int ma = sc.nextInt();
        int c,i;
        for(c=i=0;i<n;i++){
            if(sp[i].masp != ma){
                sp[c] = sp[i];
                c++;
            }
        }
        n = c;
        System.out.println("Danh sach san pham sau khi da xoa : ");
        for (i = 0; i < n; i++) {
            sp[i].xuat();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sanpham sp[];
        int n;
        System.out.println("Nhap so san pham ");
        n = sc.nextInt();
        sp = new sanpham[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai san pham (1-Phan cung ; 2-Phan mem)");
            int choice = sc.nextInt();
            if(choice == 1) sp[i] = new phancung();
            else sp[i] = new phanmem();
            sp[i].nhap();
        }
        sapxep_ma(sp, n);
        System.out.println("Danh sach san pham da nhap (sap xep theo ma tang dan) :");
        for (int i = 0; i < n; i++) {
            sp[i].xuat();  
        }
        timkiem_ma(sp, n);
        xoa_ma(sp, n);
    }
    
}
