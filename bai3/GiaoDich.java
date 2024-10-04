package bai3;

import java.time.LocalDate;

public abstract class GiaoDich {
	protected String maGiaoDich;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	protected int soLuong;
	
	public GiaoDich() {
		this("",LocalDate.now(),0.0,0);
	}

	public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong) {
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	
	public abstract double thanhTien();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-5s%-15s%-10.2f%-5d%10.2f", maGiaoDich,ngayGiaoDich,donGia,soLuong, thanhTien());
	}
}
