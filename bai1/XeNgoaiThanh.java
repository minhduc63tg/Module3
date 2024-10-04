package bai1;

public class XeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgayDiDuoc;
	private double doanhThu;
	
	public XeNgoaiThanh() {
		super();
		this.noiDen="";
		this.soNgayDiDuoc=1;
		this.doanhThu= 0;
	}

	public XeNgoaiThanh(String maSo, String tenTaiXe,String soXe,String noiDen, int soNgayDiDuoc,double doanhThu) {
		super(maSo,tenTaiXe,soXe);
		this.noiDen = noiDen;
		this.soNgayDiDuoc = soNgayDiDuoc;
		this.doanhThu= doanhThu;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgayDiDuoc() {
		return soNgayDiDuoc;
	}

	public void setSoNgayDiDuoc(int soNgayDiDuoc) {
		this.soNgayDiDuoc = soNgayDiDuoc;
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
		return String.format("%-5s%-25s%-5s%-15s%-4d%10.2f", maSo,tenTaiXe,soXe,noiDen,soNgayDiDuoc,doanhThu);
	}
	
	
}
