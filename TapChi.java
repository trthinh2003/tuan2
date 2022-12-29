package tuan2;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	
	private String ngayPhatHanh;
	
	public TapChi() {
		super();
		ngayPhatHanh = new String();
	}
	
	public TapChi(TapChi t) {
		super(t);
		ngayPhatHanh = new String(t.ngayPhatHanh);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("- Nhap vao ngay phat hanh (Nhap dung dinh dang dd/mm/yyyy): ");
		ngayPhatHanh = sc.nextLine();
	}
	
	public void in() {
		super.in();
		System.out.println("- Ngay phat hanh: " + ngayPhatHanh);
	}
	
	public String toString() {
		return super.toString() + "- Ngay phat hanh: " + ngayPhatHanh + "\n";
	}
	
	public String layTenTacGia() {
		return "";
	}
	
	public String layThangNam() {
		String s[] = this.ngayPhatHanh.split("/");
		return s[1] + "/" + s[2];
	}
}
