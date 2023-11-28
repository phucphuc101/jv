import java.util.Scanner;
class SanPham
{
	public String tenSP;
	int SoLuong;
	float giaBan;
	public void nhapTin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("\nTen San Pham: ");
		tenSP=scan.nextLine();
		System.out.print("\t So luong: ");
		SoLuong = scan.nextInt();
		System.out.print("\t Gia Ban: ");
		giaBan=scan.nextFloat();
	}
	public void hienThi()
	{
		System.out.printf("\t%-15s | %10d | %12.2f | %12.2f", tenSP, SoLuong,giaBan,tinhTien());
		System.out.println();
	}
	public float tinhTien()
	{
		return SoLuong*giaBan;
	}
}
public class BanHang 
{
	SanPham ds[];
	public void nhapTin()
	{
		for(int k=0;k<ds.length;k++)
		{
			System.out.println("\t----San pham thu " + (k+1));
			ds[k]=new SanPham();
			ds[k].nhapTin(); 
		}
	}
	public void hienThi()
	{
		for(int k=0;k<ds.length;k++)
		{
			ds[k].hienThi();
		}
	}
	public static void main(String[] args) 
	{
		BanHang banHang = new BanHang();
		int n;
		Scanner scan = new Scanner (System.in);
		System.out.print("\tSo San Pham n = ");
		n=scan.nextInt();
		banHang.ds = new SanPham[n];
		banHang.nhapTin();
		System.out.println();
		System.out.printf("\t%12s   %10s  %14s  %14s","Ten san pham", "So luong", "gia Ban", "Thanh tien");
		System.out.println("\n");
		banHang.hienThi();
	}
}