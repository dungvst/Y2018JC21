package HOANGDV.OOP.BTVN.QL_TAILIEU;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	
	public void in() {
		System.out.println("Mã: "+getMaTaiLieu());
		System.out.println("Tên nhà xuất bản: "+getTenNhaXuatBan());
		System.out.println("Số bản phát hành: "+getSoBanPhatHanh());
		System.out.println("Tên tác giả: "+getTenTacGia());
		System.out.println("Số trang: "+getSoTrang());
	}
}
