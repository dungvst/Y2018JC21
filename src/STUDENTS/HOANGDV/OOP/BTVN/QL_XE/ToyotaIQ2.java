package HOANGDV.OOP.BTVN.QL_XE;

public class ToyotaIQ2 extends ToyotaIQ1 {

	private String khoaThongMinh;

	public String getKhoaThongMinh() {
		return khoaThongMinh;
	}

	public void setKhoaThongMinh(String khoaThongMinh) {
		this.khoaThongMinh = khoaThongMinh;
	}
//	public ToyotaIQ2(String khoaThongMinh) {
//		this.khoaThongMinh = khoaThongMinh;
//	}
	public ToyotaIQ2(String vanh, String den, String canGatNuoc, String xyLanh, String tieuThu, String nongDoKhiThai,
			String dieuHoa,String guong,String amThanh,String denSuong, String khoaThongMinh) {
		super(vanh, den, canGatNuoc, xyLanh, tieuThu, nongDoKhiThai, dieuHoa, guong, amThanh, denSuong);
		// TODO Auto-generated constructor stub
		this.khoaThongMinh = khoaThongMinh;
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
		System.out.println("" + super.getGuong());
		System.out.println("" + super.getAmThanh());
		System.out.println("" + super.getDenSuong());
		System.out.println("" + getKhoaThongMinh());
	}
}
