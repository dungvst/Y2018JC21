package Phamduydieu.SanPham;

public class SanPham {
	/*
	 * Bài Tập 1 Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng
	 * gồm 2 phương thức là tính thuế nhập khẩu ( 10% giá sản phẩm) và xuất thông
	 * tin ra màn hình. Thông tin xuất ra màn hình gồm: + Tên sản phẩm + Đơn giá +
	 * Giảm giá: + Thuế nhập khẩu:
	 */
	private String tenSanPham;
	private int donGia;
	private int giamGia;

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}

	public SanPham(String tenSanPham, int donGia, int giamGia) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	public int ThueNhapKhau() {
		int Thue = (donGia-giamGia)*10/100;
		return Thue;
	}
	public void HienThi() {
		System.out.println("Tên sản phẩm: "+ tenSanPham);
		System.out.println("Đơn giá: "+donGia);
		System.out.println("Giảm giá: "+giamGia);
		System.out.println("Thuế nhập khẩu: "+ThueNhapKhau());
		System.out.println("");
	}
}
