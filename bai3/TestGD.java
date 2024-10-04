package bai3;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class TestGD {
	public static void main(String[] args) {
		DanhSachGiaoDich dsgd= new DanhSachGiaoDich(6);
		
		GiaoDich a= new GiaoDichVang("gd01", LocalDate.of(2024, 9, 26), 4200, 6, "mieng sjc");
		GiaoDich b= new GiaoDichVang("gd02", LocalDate.of(2024, 9, 4), 1700, 2, "nhan");
		GiaoDich c= new GiaoDichVang("gd03", LocalDate.of(2024, 9, 10), 3200, 7, "9999");
		GiaoDich d= new GiaoDichTienTe("gd04", LocalDate.of(2024, 9, 1), 2200, 8, 0.5, LoaiTien.EURO);
		GiaoDich e= new GiaoDichTienTe("gd05", LocalDate.of(2024, 8,8), 2600, 11, 0.8, LoaiTien.USA);
		
		dsgd.addGiaoDich(a);
		dsgd.addGiaoDich(b);
		dsgd.addGiaoDich(d);
		dsgd.addGiaoDich(e);
		
		
		
		
		GiaoDich []temp= dsgd.getDsgd();
		for(GiaoDich gd: temp) {
			System.out.println(gd);
		}
		
//		System.out.println(dsgd.tongSoLuongGdTien());
//		System.out.println(dsgd.tongSoLuongGDVang());
		
		
		DecimalFormat df= new DecimalFormat("#,##0.00VND");
		System.out.printf("%s", df.format(dsgd.thanhTienTB()));
		
		
		System.out.println();
		dsgd.donGiaHon1Ty();
		
		//System.out.println(dsgd.getCount());
	}
}
