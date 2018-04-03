package Lession6;

public class ChienBinh extends Nguoi {
	int noiLuc, khangDoc;
	String binhKhi, aoGiap;
	
	
	
	public ChienBinh(int tay, int chan, int noiLuc, int khangDoc, String binhKhi, String aoGiap, String mauDa, String thucAn) {
		super();
		super.tay = tay;
		super.chan = chan;
		super.mauDa = mauDa;
		super.thucAn = thucAn;
		this.noiLuc = noiLuc;
		this.khangDoc = khangDoc;
		this.binhKhi = binhKhi;
		this.aoGiap = aoGiap;
	}
	
	public void HienThi(){
		System.out.println("Tay: " + getTay());
		System.out.println("Chan: " + getChan());
		System.out.println("Noi Luc: " + getNoiLuc());
		System.out.println("Khang doc: " + getKhangDoc());
		System.out.println("Binh Khi: " + getBinhKhi());
		System.out.println("Ao Giap: " + getAoGiap());
		System.out.println("Mau da: " + getMauDa());
		System.out.println("Thuc an: " + getThucAn());
	}
	void tanCong(){
		System.out.println("Chien binh tan cong: dam, da, ban");
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
	
}
