package DATN;

import java.util.Date;

public class DTO_NhanVienDuAn {
	private int MaNhanVien;
	private int MaDuAn;
	private Date ThoiGianBatDau;
	private Date ThoiGianKetThuc;
	private String HoTen;

	public int getMaNhanVien() {
		return MaNhanVien;
	}

	public void setMaNhanVien(int maNhanVien) {
		MaNhanVien = maNhanVien;
	}

	public int getMaDuAn() {
		return MaDuAn;
	}

	public void setMaDuAn(int maDuAn) {
		MaDuAn = maDuAn;
	}

	public Date getThoiGianBatDau() {
		return ThoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		ThoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoiGianKetThuc() {
		return ThoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		ThoiGianKetThuc = thoiGianKetThuc;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
}
