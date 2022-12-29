package tuan2;

import java.util.Scanner;

public class TaiLieu {
	
	private String maTaiLieu;
	private String nxb;
	private int soBanPH;
	
	public TaiLieu() {
		maTaiLieu = new String();
		nxb = new String();
		soBanPH = 0;
	}
	
	public TaiLieu(TaiLieu t) {
		maTaiLieu = new String(t.maTaiLieu);
		nxb = new String(t.nxb);
		soBanPH = t.soBanPH;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("- Nhap vao ten nha xuat ban: ");
		nxb = sc.nextLine();
		System.out.print("- Nhap vao so ban phat hanh: ");
		soBanPH = sc.nextInt();
	}
	
	public void in() {
		System.out.println("- Nha xuat ban: " + nxb + "\n- So ban phat hanh: " + soBanPH);
	}
	
	public String toString() {
		return "- Nha xuat ban: " + nxb + "\n- So ban phat hanh: " + soBanPH + "\n";
	}
	
	public String layTenTacGia() {
		return "";
	}
	
	public int laySoBanPH() {
		return this.soBanPH;
	}
	
	public String layThangNam() {
		return "";
	}
}
