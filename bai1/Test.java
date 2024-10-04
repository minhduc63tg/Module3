package bai1;

public class Test {
	public static void main(String[] args) {
		DanhSachChuyenXe dscx= new DanhSachChuyenXe(6);
		ChuyenXe c1= new XeNoiThanh("11","John","a1",148,2.5,1200.00);
		ChuyenXe c2= new XeNoiThanh("12","John Due","a5",1146,8.9,3600.00);
		
		ChuyenXe c3= new XeNgoaiThanh("13","Machine","a3","Go Vap", 6, 18000.00);
		ChuyenXe c5= new XeNgoaiThanh("16","Machine Maken","a9","Thu Duc", 4, 15000.00);
		
		dscx.addChuyenXe(c1);
		dscx.addChuyenXe(c2);
		dscx.addChuyenXe(c3);
		dscx.addChuyenXe(c5);
		System.out.println(dscx.getTongDoanhThuXeNoiThanh());
		System.out.println(dscx.getTongDoanhThuXeNgoaiThanh());
		System.out.println(dscx.getTongDoanhThu());
		dscx.display();
	}
}
