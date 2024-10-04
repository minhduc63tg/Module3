package bai1;

import java.util.Arrays;

public class DanhSachChuyenXe {
	private ChuyenXe[] dscx;
	private int count=0;
	
	public DanhSachChuyenXe(int n) {
		if(n<=0) {
			throw new IllegalArgumentException("danh sach phai >0");
		}
		dscx= new ChuyenXe[n];
	}
	
	public boolean addChuyenXe(ChuyenXe chuyenXe) {
		if (chuyenXe == null) {
			return false;
		}
		if (count == dscx.length) {
			
			dscx = Arrays.copyOf(dscx, dscx.length*2);
		}
		
			
		dscx[count++] = chuyenXe;
		return true;
	}
		
	public double getTongDoanhThuXeNgoaiThanh() {
		double total=0.0;
		for(ChuyenXe c: dscx) {
			if(c instanceof XeNgoaiThanh) {
				total += ((XeNgoaiThanh) c).getDoanhThu();
			}
		}
		return total;
		
	}
	public double getTongDoanhThuXeNoiThanh() {
		double total=0.0;
		for(ChuyenXe c: dscx) {
			if(c instanceof XeNoiThanh) {
				total += ((XeNoiThanh) c).getDoanhThu();
			}
		}
		return total;
		
	}
	
	public double getTongDoanhThu() {
		double total = getTongDoanhThuXeNgoaiThanh() + 
				getTongDoanhThuXeNoiThanh();
		
		return total;

	}
	
	public ChuyenXe[] getDscx() {
		return dscx;
	}

	public void setDscx(ChuyenXe[] dscx) {
		this.dscx = dscx;
	}

	public void display() {
		ChuyenXe[] temp= DanhSachChuyenXe.this.getDscx();
		
		for(ChuyenXe c: temp) {
			if(c instanceof XeNoiThanh)
				System.out.println(c);
			else if(c instanceof XeNgoaiThanh) {
				System.out.println(c);
			}
		}
	}
	
}
