package DoKhacTu.BTVN_10_04_2018;

public class Bao implements Media1 {
	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public Bao(int soPhatHanh, String tenBaiBao, String ngayPhatHanh) {
		super();
		this.soPhatHanh = soPhatHanh;
		TenBaiBao = tenBaiBao;
		NgayPhatHanh = ngayPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public String getTenBaiBao() {
		return TenBaiBao;
	}

	public void setTenBaiBao(String tenBaiBao) {
		TenBaiBao = tenBaiBao;
	}

	public String getNgayPhatHanh() {
		return NgayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		NgayPhatHanh = ngayPhatHanh;
	}

	private int soPhatHanh;
	private String TenBaiBao;
	private String NgayPhatHanh;
	private String MaTaiLieu;
	private int SoBanPhatHanh;

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
		System.out.println("Tên bài báo: " + getTenBaiBao());
		System.out.println("Số phát hành: " + getSoPhatHanh());
		System.out.println("Ngày phát hành: " + getNgayPhatHanh());
		System.out.println("Mã tài liệu của báo: " + getMaTaiLieu());
		System.out.println("Số bản phát hành của báo: " + getSoBanPhatHanh());

	}
}
