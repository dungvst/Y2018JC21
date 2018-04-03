package HOANGDV.OOP.BTVN.QL_TAILIEU;

public class TapChi extends TaiLieu {
	private int soPhatHanh;
	private int thangPhatHanh;

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(short thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public void in() {
		System.out.println("Mã: " + getMaTaiLieu());
		System.out.println("Tên nhà xuất bản: " + getTenNhaXuatBan());
		System.out.println("Số bản phát hành: " + getSoBanPhatHanh());
		System.out.println("Số phát hành: " + getSoPhatHanh());
		System.out.println("Tháng phát hành: " + getThangPhatHanh());
	}
}
