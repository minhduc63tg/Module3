package bai1;

public abstract class ChuyenXe {
	protected String maSo;
	protected String tenTaiXe;
	protected String soXe;
	public ChuyenXe() {
		this("","","");
	}
	public ChuyenXe(String maSo, String tenTaiXe, String soXe) {
		this.maSo = maSo;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
	}
	
	
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getTenTaiXe() {
		return tenTaiXe;
	}
	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}
	public String getSoXe() {
		return soXe;
	}
	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}
	
}
