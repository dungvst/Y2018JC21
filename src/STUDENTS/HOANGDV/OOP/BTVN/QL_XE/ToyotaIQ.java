package HOANGDV.OOP.BTVN.QL_XE;

public class ToyotaIQ {
	private String vanh, den, canGatNuoc, xyLanh, tieuThu, nongDoKhiThai, dieuHoa;

	public String getVanh() {
		return vanh;
	}

	public void setVanh(String vanh) {
		this.vanh = vanh;
	}

	public String getDen() {
		return den;
	}

	public void setDen(String den) {
		this.den = den;
	}

	public String getCanGatNuoc() {
		return canGatNuoc;
	}

	public void setCanGatNuoc(String canGatNuoc) {
		this.canGatNuoc = canGatNuoc;
	}

	public String getXyLanh() {
		return xyLanh;
	}

	public void setXyLanh(String xyLanh) {
		this.xyLanh = xyLanh;
	}

	public String getTieuThu() {
		return tieuThu;
	}

	public void setTieuThu(String tieuThu) {
		this.tieuThu = tieuThu;
	}

	public String getNongDoKhiThai() {
		return nongDoKhiThai;
	}

	public void setNongDoKhiThai(String nongDoKhiThai) {
		this.nongDoKhiThai = nongDoKhiThai;
	}

	public String getDieuHoa() {
		return dieuHoa;
	}

	public void setDieuHoa(String dieuHoa) {
		this.dieuHoa = dieuHoa;
	}

	public ToyotaIQ(String vanh, String den, String canGatNuoc, String xyLanh, String tieuThu, String nongDoKhiThai,
			String dieuHoa) {
		this.vanh = vanh;
		this.den = den;
		this.canGatNuoc = canGatNuoc;
		this.xyLanh = xyLanh;
		this.tieuThu = tieuThu;
		this.nongDoKhiThai = nongDoKhiThai;
		this.dieuHoa = dieuHoa;
	}
}
