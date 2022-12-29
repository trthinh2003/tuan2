package tuan2;

import java.util.Scanner;

public class Sach extends TaiLieu {
	
	private String tenTacGia;
	private int soTrang;
	
	public Sach() {
		super();
		tenTacGia = new String();
		soTrang = 0;
	}
	
	public Sach(Sach s) {
		super(s);
		tenTacGia = new String(s.tenTacGia);
		soTrang = s.soTrang;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("- Nhap vao ten tac gia: ");
		tenTacGia = sc.nextLine();
		System.out.print("- Nhap vao so trang sach: ");
		soTrang = sc.nextInt();
	}
	
	public void in() {
		super.in();
		System.out.println("- Ten tac gia: " + tenTacGia + "\n- So trang sach: " + soTrang);
	}
	
	public String toString() {
		return super.toString() + "- Ten tac gia: " + tenTacGia + "\n- So trang sach: " + soTrang + "\n";
	}
	
	public String layTenTacGia() {
		return this.tenTacGia;
	}
	
	public String layThangNam() {
		return "";
	}
}
