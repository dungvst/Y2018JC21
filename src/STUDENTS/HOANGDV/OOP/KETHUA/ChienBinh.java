package HOANGDV.OOP.KETHUA;

public class ChienBinh extends Nguoi {

	public ChienBinh(int tay, int chan, String mauDa, String thucAn, int noiLuc, int khangDoc, String binhKhi,
			String aoGiap) {
		super(tay, chan, mauDa, thucAn);
		this.noiLuc = noiLuc;
		this.khangDoc = khangDoc;
		this.binhKhi = binhKhi;
		this.aoGiap = aoGiap;
	}

	private int noiLuc, khangDoc;
	private String binhKhi, aoGiap;

	public void tanCong() {
		System.out.println("Chiến binh tấn công");
	}

	public int getNoiLuc() {
		return noiLuc;
	}

	public void setNoiLuc(int noiLuc) {
		this.noiLuc = noiLuc;
	}

	public int getKhangDoc() {
		return khangDoc;
	}

	public void setKhangDoc(int khangDoc) {
		this.khangDoc = khangDoc;
	}

	public String getBinhKhi() {
		return binhKhi;
	}

	public void setBinhKhi(String binhKhi) {
		this.binhKhi = binhKhi;
	}

	public String getAoGiap() {
		return aoGiap;
	}

	public void setAoGiap(String aoGiap) {
		this.aoGiap = aoGiap;
	}

	public void in() {
		System.out.println("Chân: " + super.getChan());
		System.out.println("Tay: " + super.getTay());
		System.out.println("Màu da: " + super.getMauDa());
		System.out.println("Thức ăn: " + super.getThucAn());
		super.diChuyen();
		System.out.println("Nội lực: " + getNoiLuc());
		System.out.println("Kháng độc: " + getKhangDoc());
		System.out.println("Binh khí: " + getBinhKhi());
		System.out.println("Áo giáp: " + getAoGiap());
	}
}
