package bai1;

public class XeNoiThanh extends ChuyenXe{
	private int soTuyen;
	private double soKm;
	private double doanhThu;
	public XeNoiThanh() {
		super();
		this.soTuyen= 11;
		this.soKm =11;
		this.doanhThu= 0;
	}

	public XeNoiThanh(String maSo, String tenTaiXe,String soXe, int soTuyen, double soKm, double doanhThu) {
		super(maSo,tenTaiXe,soXe);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
		this.doanhThu= doanhThu;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public double getSoKm() {
		return soKm;
	}

	public void setSoKm(double soKm) {
		this.soKm = soKm;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-5s%-25s%-5s%-4d%5.2f%10.2f", maSo,tenTaiXe,soXe,soTuyen,soKm,doanhThu);
	}
	
}
