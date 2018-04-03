package MaiAnh.HomeWork.Lession7.Bai1;

public class ToyotaIQ {
	private String vanh;
	private String denPha;
	private String canGatNuoc;
	private String xyLanh;
	private String tieuThu;
	private String nongDoKhiThai;
	
	public ToyotaIQ() {
		vanh = "Vành đúc hợp kim 15 inch";
		denPha = "Đèn pha cảm biến ánh sáng";
		canGatNuoc = "Cần gạt nước cảm biến";
		xyLanh = "VVT-I dung tích 1lít/ 3chiếc";
		tieuThu = "3,6lít/ 100km";
		nongDoKhiThai = "99g/ km";
	}
	
	void display(){
		System.out.println("Thông số kỹ thuật:");
		System.out.println("  Thông số chung cho các dòng xe:");
		System.out.println("    - " + vanh + "\n    - " + denPha + "\n    - " + canGatNuoc + "\n    - Xy lanh " + xyLanh + "\n    - Tiêu thụ: " + tieuThu + "\n    - Nồng độ khí thải: " + nongDoKhiThai);
	}
}
