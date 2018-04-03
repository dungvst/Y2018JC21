package STUDENTS.DoKhacTu;

public class SanPham {

	private String tenSanPham;
	private float donGia;
	private float giamGia;

	public SanPham() {

	}

	public SanPham(String tenSanPham, float donGia, float giamGia) {
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String tenSanPham, float donGia) {
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = 0;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(float giamGia) {
		this.giamGia = giamGia;
	}

	private float tinhThueNhapKhau() {
		return ((donGia * 10) / 100);
	}

	public void xuatThongTin() {
		System.out.println("Ten san pham: " + tenSanPham);
		System.out.println("Don Gia: " + donGia);
		System.out.println("Giam gia: " + giamGia);
		System.out.println("Thue nhap khau: " + tinhThueNhapKhau());

	}
}
