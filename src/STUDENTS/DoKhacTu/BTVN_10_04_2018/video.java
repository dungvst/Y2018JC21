package DoKhacTu.BTVN_10_04_2018;

public class video implements Media1 {
	private String tenVideo;
	private int thoiLuong;
	private String hangPhatHanh;
	private String MaTaiLieu;
	private int SoBanPhatHanh;

	public String getTenVideo() {
		return tenVideo;
	}

	public void setTenVideo(String tenVideo) {
		this.tenVideo = tenVideo;
	}

	public int getThoiLuong() {
		return thoiLuong;
	}

	public void setThoiLuong(int thoiLuong) {
		this.thoiLuong = thoiLuong;
	}

	public String getHangPhatHanh() {
		return hangPhatHanh;
	}

	public video(String tenVideo, int thoiLuong, String hangPhatHanh) {
		super();
		this.tenVideo = tenVideo;
		this.thoiLuong = thoiLuong;
		this.hangPhatHanh = hangPhatHanh;
	}

	public void setHangPhatHanh(String hangPhatHanh) {
		this.hangPhatHanh = hangPhatHanh;
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
		System.out.println("Tên video: " + getTenVideo());
		System.out.println("Thời lượng: " + getThoiLuong());
		System.out.println("Hãng phát hành: " + getHangPhatHanh());
		System.out.println("Mã tài liệu của video: " + getMaTaiLieu());
		System.out.println("Số bản phát hành của video: " + getSoBanPhatHanh());

	}

}
