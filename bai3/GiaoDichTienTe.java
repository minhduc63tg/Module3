package bai3;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich{
	private double tiGia;
	private LoaiTien loaiTien;
	
	public GiaoDichTienTe() {
		super();
		this.tiGia = 0.0;
		this.loaiTien = LoaiTien.VND;
	}
	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong,double tiGia,LoaiTien loaiTien) {
		super(maGiaoDich,ngayGiaoDich,donGia,soLuong);
		this.tiGia = tiGia;
		this.loaiTien =loaiTien;
	}
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public LoaiTien getLoaiTien() {
		return loaiTien;
	}
	public void setLoaiTien(LoaiTien loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	public double thanhTien() {
		if (loaiTien == LoaiTien.VND)
			return soLuong * donGia;
		
		return soLuong * donGia * tiGia;
	}
	
	
}
