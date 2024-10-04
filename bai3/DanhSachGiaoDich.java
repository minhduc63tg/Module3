package bai3;

import java.time.LocalDate;
import java.util.Arrays;

public class DanhSachGiaoDich {
	private GiaoDich [] dsgd;
	private int count=0;
	
	public DanhSachGiaoDich(int n) {
		if(n <=0) {
			throw new IllegalArgumentException("so giao dich >0");
		}
		dsgd = new GiaoDich[n];
	}
	
	public boolean addGiaoDich(GiaoDich gd) {
		if (gd == null) {
			return false;
		}
		if (count == dsgd.length) {
			return false;
		}
		dsgd[count++] = gd;
		return true;
	}
	
	public int tongSoLuongGDVang() {
		int sumVang=0;
		for (GiaoDich c : dsgd) {
			if (c instanceof GiaoDichVang) {
				sumVang += c.soLuong;
			}
			
		}
		return sumVang;
	}
	
	public int tongSoLuongGdTien() {
		int sumTien=0;
		for (GiaoDich c : dsgd) {
			if (c instanceof GiaoDichTienTe) {
				sumTien += c.soLuong;
			}
			
		}
		return sumTien;
	}
	
	
	public double thanhTienTB() {
		double money = 0;
		for(GiaoDich c: dsgd) {
			if(c instanceof GiaoDichTienTe) {
				money += c.thanhTien();
			}
		}
		return money/ (this.tongSoLuongGdTien());
		
	}
	
	public void donGiaHon1Ty() {
		
		for(int i=0;i<count;i++) {
			if(dsgd[i].donGia >4000) {
				System.out.println(dsgd[i]);
			}
		}
	}
	public GiaoDich[] getDsgd() {
		return dsgd;
	}

	public void setDsgd(GiaoDich[] dsgd) {
		this.dsgd = dsgd;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	
}
