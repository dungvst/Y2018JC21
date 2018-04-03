package HOANGDV.OOP.BTVN.QL_XE;

public class ToyotaIQ1 extends ToyotaIQ {

	private String guong, amThanh, denSuong;

	public String getGuong() {
		return guong;
	}

	public void setGuong(String guong) {
		this.guong = guong;
	}

	public String getAmThanh() {
		return amThanh;
	}

	public void setAmThanh(String amThanh) {
		this.amThanh = amThanh;
	}

	public String getDenSuong() {
		return denSuong;
	}

	public void setDenSuong(String denSuong) {
		this.denSuong = denSuong;
	}

	public ToyotaIQ1(String vanh, String den, String canGatNuoc, String xyLanh, String tieuThu, String nongDoKhiThai,
			String dieuHoa, String guong, String amThanh, String denSuong) {
		super(vanh, den, canGatNuoc, xyLanh, tieuThu, nongDoKhiThai, dieuHoa);
		// TODO Auto-generated constructor stub
		this.guong = guong;
		this.amThanh = amThanh;
		this.denSuong = denSuong;

	}

	public void Print() {
		System.out.println("Thông số chung cho các dòng xe\n");
		System.out.println("" + super.getVanh());
		System.out.println("" + super.getDen());
		System.out.println("" + super.getCanGatNuoc());
		System.out.println("" + super.getXyLanh());
		System.out.println("" + super.getTieuThu());
		System.out.println("" + super.getNongDoKhiThai());
		System.out.println("" + super.getDieuHoa());
		System.out.println("Phụ kiện riêng cho dòng xe Q2\n");
		System.out.println("" + getGuong());
		System.out.println("" + getAmThanh());
		System.out.println("" + getDenSuong());
	}

}
