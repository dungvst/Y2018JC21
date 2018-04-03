package HOANGDV.OOP.KETHUA;

public class Nguoi {
	private int tay, chan;
	private String mauDa, thucAn;

	public void diChuyen() {
		System.out.println("Người di chuyển");
	}



	public int getTay() {
		return tay;
	}

	public Nguoi(int tay, int chan, String mauDa, String thucAn) {
		this.tay = tay;
		this.chan = chan;
		this.mauDa = mauDa;
		this.thucAn = thucAn;
	}



	public void setTay(int tay) {
		this.tay = tay;
	}

	public int getChan() {
		return chan;
	}

	public void setChan(int chan) {
		this.chan = chan;
	}

	public String getMauDa() {
		return mauDa;
	}

	public void setMauDa(String mauDa) {
		this.mauDa = mauDa;
	}

	public String getThucAn() {
		return thucAn;
	}

	public void setThucAn(String thucAn) {
		this.thucAn = thucAn;
	}
}
