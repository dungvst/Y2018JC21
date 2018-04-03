package HOANGDV.OOP.LOP;

public class SanPham {
	private String ten;
	private double gia;
	private double giamGia;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	private double thueNhapKhau() {
		return gia * 10 / 100;
	}

	public SanPham() {

	}

	public SanPham(String ten, double gia) {
		super();
		this.ten = ten;
		this.gia = gia;
	}

	public SanPham(String ten, double gia, double giamGia) {
		super();
		this.ten = ten;
		this.gia = gia;
		this.giamGia = giamGia;
	}

	public void in() {
		System.out.println("Tên sản phẩm: " + getTen());
		System.out.println("Giá sản phẩm: " + getGia());
		System.out.println("Giảm giá: " + getGiamGia());
		System.out.println("Thuế nhập khẩu: " + thueNhapKhau());
	}
}
