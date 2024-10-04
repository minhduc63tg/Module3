package bai6;

import java.util.Arrays;
import java.util.Comparator;

public class DanhSachHangHoa {
    private HangHoa[] dshh;
    private int count = 0;

    public DanhSachHangHoa(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Danh sách hàng hóa phải lớn hơn 0");
        }
        dshh = new HangHoa[n];
    }

    public HangHoa[] getDshh() {
        return dshh;
    }

    public void setDshh(HangHoa[] dshh) {
        if (dshh.length > this.dshh.length) {
            throw new IllegalArgumentException("Danh sách mới không được lớn hơn danh sách hiện tại");
        }
        this.dshh = dshh;
    }

    public boolean addHang(HangHoa hangHoa) {
        if (hangHoa == null) {
            return false; 
        }
        if (count >= dshh.length) {
            throw new IllegalStateException("Danh sách đã đầy, không thể thêm hàng");
        }
        dshh[count++] = hangHoa; 
        return true;
    }

    
    
//	public HangHoa[] getHangThucPham() {
//        HangHoa[] result = new HangHoa[count];
//        int index = 0;
//        for (int i = 0; i < count; i++) {
//            if (dshh[i] instanceof HangThucPham) {
//                result[index++] = dshh[i];
//            }
//        }
//        return Arrays.copyOf(result, index);
//    }

//    public HangHoa[] getHangDienMay() {
//        HangHoa[] result = new HangHoa[count];
//        int index = 0;
//        for (int i = 0; i < count; i++) {
//            if (dshh[i] instanceof HangDienMay) {
//                result[index++] = dshh[i];
//            }
//        }
//        return Arrays.copyOf(result, index);
//    }
	
	
	public HangHoa[] timHangTheoMa(String maHang) {
		HangHoa[] result = new HangHoa[count];
		int index = 0;
		for (int i = 0; i < count; i++) {
			if (dshh[i].getMaHang().equals(maHang)) {
				result[index++] = dshh[i];
			}
		}
		return Arrays.copyOf(result, index);
	}
    	
    
    public void sortByName() {
        Arrays.sort(dshh, 0, count, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa h1, HangHoa h2) {
                return h1.getTenHang().compareTo(h2.getTenHang());
            }
        });
        System.out.println("Đã sắp xếp hàng hóa theo tên hàng tăng dần.");
    }
    
    public HangHoa[] sortbyName2() {
    	HangHoa [] newds= dshh.clone();
    	for(int i=0;i< count-1;i++) {
			for (int j = i + 1; j < count; j++) {
				if (newds[i].getTenHang().compareTo(newds[j].getTenHang()) > 0) {
					HangHoa temp = newds[i];
					newds[i] = newds[j];
					newds[j] = temp;
				}
			}
    	}
    	return newds;
    }
    
    public HangHoa[] getDSHHbyLoaiHang(String loaiHang) {
    	HangHoa []hang= new HangHoa[count];
    	int k=0;
    	for(int i=0;i<count;i++) {
			if (dshh[i].getClass().getSimpleName().equalsIgnoreCase(loaiHang)) {
				hang[k++] = dshh[i];
			}
			
    	}
    	return Arrays.copyOf(hang, k);
    }
    
	public HangHoa[] sortBySoLuongTon() {
    	HangHoa [] newds= dshh.clone();
    	for(int i=0;i< count-1;i++) {
    		for(int j=i+1;j<count;j++) {
    			if(newds[i].soLuongTon < newds[j].soLuongTon) {
    				HangHoa temp= newds[i];
    				newds[i]= newds[j];
    				newds[j]= temp;
    			}
    		}
    	}
    	return newds;
	}
	
	public HangHoa[] getInfoHangThucPhamKhoBan() {
		HangHoa []hang= new HangHoa[count];
		int k=0;
		for(int i=0;i<count;i++) {
			if(dshh[i] instanceof HangThucPham && dshh[i].danhGiaMucDoBanBuon().equals("Kho ban")) {
				hang[k++]= dshh[i];
			}
		}
		return Arrays.copyOf(hang, k);
	}
	
	public HangHoa[] deleteByMaHang(String maHang) {
		HangHoa []newds= dshh.clone();
		int k=0;
		for (int i = 0; i < count; i++) {
			if (!dshh[i].getMaHang().equals(maHang)) {
				newds[k++] = dshh[i];
			}
		}
		count= k;
		return Arrays.copyOf(newds, k);
		
	}
	
	// Viết các phương thức sửa thông tin đơn giá của hàng hóa khi biết mã hàng.
	public HangHoa[] updateDonGia (String maHang, double donGia) {
		for (int i = 0; i < count; i++) {
			if (dshh[i].getMaHang().equals(maHang)) {
				dshh[i].setDonGia(donGia);
			}
		}
		return dshh;
	}
    	
}
