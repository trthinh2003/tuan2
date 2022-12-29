package tuan2;

import java.io.PrintWriter;
import java.util.Scanner;

public class SDTaiLieu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//a. Nhap thong tin tai lieu
		System.out.print("So luong tai lieu ban muon nhap la: "); int n = sc.nextInt();
		TaiLieu ds[] = new TaiLieu[n];
		for (int i = 0; i < n; i++) {
			System.out.println("\nNhap vao thong tin cho tai lieu thu " + (i + 1) + ":");
			System.out.println("Tai lieu ban muon nhap la Sach[1] hay Tap Chi[2]?");
			System.out.print("->Lua chon cua ban la: "); int choice = sc.nextInt();
			if (choice == 1) {
				ds[i] = new Sach();
				ds[i].nhap();
			}
			else {
				ds[i] = new TapChi();
				ds[i].nhap();
			}
		}
		
		//b. Xuat danh sach Sach, Tap Chi
		System.out.println("\nThong tin danh sach tai lieu ban vua nhap la:");
		for (int i = 0; i < n; i++) {
			System.out.println("============THONG TIN TAI LIEU THU " + (i + 1) + "============");
			System.out.println("- Ma tai lieu: TL00" + (i + 1));
			ds[i].in();
			System.out.println();
		}
		
		//c. Xuat danh sach Sach theo ten tac gia
		System.out.print("Nhap ten tac gia cua loai Sach ban muon tim kiem: "); sc.nextLine();
		String searchName = sc.nextLine();
		boolean timThay = false;
		for (int i = 0; i < n; i++) {
			if (ds[i].layTenTacGia().compareToIgnoreCase(searchName) == 0 && ds[i].layTenTacGia().compareTo("") != 0) {
				System.out.println("->Tim thay thong tin Sach co ten tac gia la " + searchName + ", thong tin tai lieu nhu sau:");
				ds[i].in();
				timThay = true;
			}
		}
		if (timThay == false) System.out.println("->Rat tiec, chung toi khong tim thay thong tin Sach nao co ten tac gia la " + searchName);
		
		//d. Sap xep tai lieu, [1]: Sap theo Ten nxb, [2]: Sap theo So ban phat hanh
		System.out.print("\nBan chon sap xep tai lieu theo Ten nxb[1] hay sap xep theo So ban phat hanh[2]?"); int luaChonSX = sc.nextInt();
		if (luaChonSX == 1) {
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (ds[i].layTenTacGia().compareToIgnoreCase(ds[j].layTenTacGia()) > 0) {
						TaiLieu temp = new TaiLieu(ds[i]);
						ds[i] = new TaiLieu(ds[j]);
						ds[j] = new TaiLieu(temp);
					}
				}
			}
		}
		else {
			for (int i = 0; i < n - 1; i++) {
				for (int j = i + 1; j < n; j++) {
					if (ds[i].laySoBanPH() > ds[j].laySoBanPH()) {
						TaiLieu temp = new TaiLieu(ds[i]);
						ds[i] = new TaiLieu(ds[j]);
						ds[j] = new TaiLieu(temp);
					}
				}
			}
		}
		
		
		//e. Ghi danh sach cau c ra man hinh. Ten file nhap tu ban phim
		System.out.println("Du lieu da duoc luu vao fie...");
		try {
			
			for (int i = 0; i < n; i++) {
				if (ds[i].layTenTacGia().compareToIgnoreCase(searchName) == 0 && ds[i].layTenTacGia().compareTo("") != 0) {
					String tenFile = "Sach cua TG " + searchName;
					PrintWriter pw = new PrintWriter(tenFile, "UTF-8");
					pw.println(ds[i].toString());
					pw.flush();
					pw.close();
				} 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//h. Tim sach phat hanh theo thang, nam nhap tu ban phim
		System.out.print("\nNhap vao thang nam phat hanh cua sach ban muon tim: "); sc.nextLine();
		String searchMonthYear = sc.nextLine();
		boolean timthay2 = false;
		for (int i = 0; i < n; i++) {
			if (ds[i].layThangNam().compareTo(searchMonthYear) == 0) {
				System.out.println("->Tim thay sach duoc phat hanh vao thang " + searchMonthYear + ", thong tin sach nhu sau:");
				ds[i].in();
				timthay2 = true;
			}
		}
		if (timthay2 == false) System.out.println("->Khong tim thay sach duoc phat hanh vao thang " + searchMonthYear);
	}
	
}
