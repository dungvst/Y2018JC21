package Lession6;

public class NongDan  extends Nguoi{
	int gioLaoDong, kyNang;
	String nongCu, trangPhuc;
	void laoDong(){
		System.out.println("Nong dan lao dong: trong trot, chan nuoi");
	}
	
	
	public NongDan(int chan, int tay, int gioLaoDong, int kyNang, String nongCu, String trangPhuc, String mauDa, String thucAn) {
		super();
		super.mauDa = mauDa;
		super.thucAn = thucAn;
		super.chan = chan;
		super.tay = tay;
		this.gioLaoDong = gioLaoDong;
		this.kyNang = kyNang;
		this.nongCu = nongCu;
		this.trangPhuc = trangPhuc;
	}
	
	public void HienThi(){
		System.out.println("Tay: " + getTay());
		System.out.println("Chan: " + getChan());
		System.out.println("Gio lao dong: " + getGioLaoDong());
		System.out.println("Ky nang: " + getKyNang());
		System.out.println("Nong cu: " + getNongCu());
		System.out.println("Trang phuc: " + getTrangPhuc());
		System.out.println("Mau da: " + getMauDa());
		System.out.println("Thuc an: " + getThucAn());
	}




	public int getGioLaoDong() {
		return gioLaoDong;
	}
	public void setGioLaoDong(int gioLaoDong) {
		this.gioLaoDong = gioLaoDong;
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

}
