package DoKhacTu.BTVN_10_04_2018;

public class Sach implements Media1 {
	private String tenSach;
	private String MaTaiLieu;
	private int SoBanPhatHanh;

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public int getGiaSach() {
		return giaSach;
	}

	public void setGiaSach(int giaSach) {
		this.giaSach = giaSach;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	private int giaSach;
	private int soTrang;

	public Sach(String tenSach, int giaSach, int soTrang) {
		super();
		this.tenSach = tenSach;
		this.giaSach = giaSach;
		this.soTrang = soTrang;
	}

	public String getMaTaiLieu() {
		// TODO Auto-generated method stub
		return MaTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.MaTaiLieu = maTaiLieu;

	}

	public int getSoBanPhatHanh() {
		// TODO Auto-generated method stub
		return SoBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.SoBanPhatHanh = soBanPhatHanh;

	}

	public void inthongtin() {
		System.out.println("Tên sách: " + getTenSach());
		System.out.println("Gía sách: " + getGiaSach());
		System.out.println("Số trang: " + getSoTrang());
		System.out.println("Mã tài liệu của sách: " + getMaTaiLieu());
		System.out.println("Số bản phát hành của sách: " + getSoBanPhatHanh());

	}

}
