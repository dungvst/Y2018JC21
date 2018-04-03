package HOANGDV.OOP.BTVN.QL_TAILIEU;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(short ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.ngayPhatHanh = ngayPhatHanh;
	}

	public void in() {
		System.out.println("Mã: " + getMaTaiLieu());
		System.out.println("Tên nhà xuất bản: " + getTenNhaXuatBan());
		System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
		System.out.println("Ngày phát hành: " + getNgayPhatHanh());
	}
}
