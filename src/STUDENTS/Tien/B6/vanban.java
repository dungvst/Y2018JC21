package STUDENTS.Tien.B6;

import java.util.Scanner;

public abstract class vanban {
	protected String matailieu;
	protected String NXB;
	protected int sophahanh;
	

	public String getMatailieu() {
		return matailieu;
	}
	public void setMatailieu(String matailieu) {
		this.matailieu = matailieu;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		NXB = nXB;
	}
	public int getSophahanh() {
		return sophahanh;
	}
	public void setSophahanh(int sophahanh) {
		this.sophahanh = sophahanh;
	}
	
	public abstract void nhapthongtin();
	public abstract void xuatthongtin();
}
