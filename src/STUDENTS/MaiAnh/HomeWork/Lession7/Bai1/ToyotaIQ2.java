package MaiAnh.HomeWork.Lession7.Bai1;

public class ToyotaIQ2 extends ToyotaIQ{
	private String phuKien;

	public ToyotaIQ2() {
		super();
		phuKien = "    - Gương điều khiển và có sưởi\n    - Đèn sương mù\n    - Hệ thống chìa khóa thông minh";
	}
	
	void displayToyotaIQ2(){
		display();
		System.out.println("  Phụ kiện riêng cho dòng xe này:");
		System.out.println(phuKien);
	}
}
