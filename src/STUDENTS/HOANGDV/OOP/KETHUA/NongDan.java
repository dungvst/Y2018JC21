package HOANGDV.OOP.KETHUA;

public class NongDan extends Nguoi {

	public NongDan(int tay, int chan, String mauDa, String thucAn, int gioiLaoDong, int kyNang, String nongCu,
			String trangPhuc) {
		super(tay, chan, mauDa, thucAn);
		this.gioiLaoDong = gioiLaoDong;
		this.kyNang = kyNang;
		this.nongCu = nongCu;
		this.trangPhuc = trangPhuc;
	}

	private int gioiLaoDong, kyNang;
	private String nongCu, trangPhuc;

	public void laoDong() {
		System.out.println("Nông dân lao động");
	}

	public int getGioiLaoDong() {
		return gioiLaoDong;
	}

	public void setGioiLaoDong(int gioiLaoDong) {
		this.gioiLaoDong = gioiLaoDong;
	}

	public int getKyNang() {
		return kyNang;
	}

	public void setKyNang(int kyNang) {
		this.kyNang = kyNang;
	}

	public String getNongCu() {
		return nongCu;
	}

	public void setNongCu(String nongCu) {
		this.nongCu = nongCu;
	}

	public String getTrangPhuc() {
		return trangPhuc;
	}

	public void setTrangPhuc(String trangPhuc) {
		this.trangPhuc = trangPhuc;
	}

	public void in() {
		System.out.println("Chân: " + super.getChan());
		System.out.println("Tay: " + super.getTay());
		System.out.println("Màu da: " + super.getMauDa());
		System.out.println("Thức ăn: " + super.getThucAn());
		super.diChuyen();
		System.out.println("Giỏi lao động: " + getGioiLaoDong());
		System.out.println("Kỹ năng: " + getKyNang());
		System.out.println("Nông cụ: " + getNongCu());
		System.out.println("Trang phục: " + getTrangPhuc());
	}
}
