package bai6;

import java.time.LocalDate;

import javax.net.ssl.ExtendedSSLSession;

public class TestHang {
    public static void main(String[] args) {
        DanhSachHangHoa dshh = new DanhSachHangHoa(6);

        HangHoa h1 = new HangThucPham("11", "Bánh Quy", 12000.0, 5, "Oshi", LocalDate.of(2024, 8, 22), LocalDate.of(2024, 9, 28));
        HangHoa h2 = new HangThucPham("12", "Bánh Quy Bo", 18000.0, 4, "Orion", LocalDate.of(2024, 5, 12), LocalDate.of(2025, 7, 28));
        HangHoa h4 = new HangDienMay("1110", "Máy Bơm", 50000.0, 15, 2, 280);
        HangHoa h5 = new HangDienMay("1111", "Máy Quạt", 25000.0, 5, 12, 50);
        HangHoa h6 = new HangSanhSu("20", "Chen sứ", 2000.0, 50, "RangDong", LocalDate.of(2024, 5, 5));
        HangHoa h7 = new HangSanhSu("21", "Cốc nước", 12000.0, 120, "ThanTai", LocalDate.of(2024, 6, 1));

        
        dshh.addHang(h1);
        dshh.addHang(h2);
        dshh.addHang(h4);
        dshh.addHang(h5);
        dshh.addHang(h6);
        dshh.addHang(h7);

        
        System.out.println("Danh sách tất cả hàng hóa:");
		for (HangHoa hh : dshh.sortBySoLuongTon()) {
			System.out.println(hh);
		}
//        for (HangHoa hh : dshh.getDshh()) {
//            System.out.println(hh);
//        }
        

        
        System.out.println("\nDanh sách hàng thực phẩm:");
        for(HangHoa hh: dshh.getDSHHbyLoaiHang("hangdienmay")) {
        	System.out.println(hh);
        }
        
//        for (HangHoa hh : dshh.getHangThucPham()) {
//            System.out.println(hh);
//        }
//
//        System.out.println("\nDanh sách hàng điện máy:");
//        for (HangHoa hh : dshh.getHangDienMay()) {
//            System.out.println(hh);
//        }
        
//        dshh.sortByName();
//		for (HangHoa h : dshh.getDshh()) {
//			System.out.println(h);
//		}
        

//       for(HangHoa hh: dshh.sortbyName2()) {
//    	   System.out.println(hh);
//       }
        
        System.out.println("Danh sach hang sau khi cap nhat don gia: ");
//        for(HangHoa h: dshh.getInfoHangThucPhamKhoBan()) {
//        	System.out.println(h);
//        }
        
//		for (HangHoa hh : dshh.deleteByMaHang("11")) {
//			System.out.println(hh);
//		}
        
        for(HangHoa hh: dshh.updateDonGia("20", 5000.00)) {
        	System.out.println(hh);
        }
       
        
    }
}