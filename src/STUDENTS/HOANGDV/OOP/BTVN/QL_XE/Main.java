package HOANGDV.OOP.BTVN.QL_XE;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToyotaIQ1 toyotaIQ1 = new ToyotaIQ1("Vành đúc hợp kim 15 inch", "Đèn pha cảm biến ánh sáng", "Cần gạt nước cảm biến",
				"Xy lanh VVT-I dung tích 1lit/3 chiếc", "Tiêu thụ nhiên liệu : 3,6lit/100km", "Nồng độ khí thải : 99g/km\r\n",
				"Điều hòa nhiệt độ", "Gương điều khiển điện và có sưởi", "Âm thanh 6 loa", "Đèn sương mù");
		toyotaIQ1.Print();
		ToyotaIQ2 toyotaIQ2 = new ToyotaIQ2("Vành đúc hợp kim 15 inch", "Đèn pha cảm biến ánh sáng", "Cần gạt nước cảm biến",
				"Xy lanh VVT-I dung tích 1lit/3 chiếc", "Tiêu thụ nhiên liệu : 3,6lit/100km", "Nồng độ khí thải : 99g/km\r\n",
				"Điều hòa nhiệt độ", "Gương điều khiển điện và có sưởi", "Âm thanh 6 loa", "Đèn sương mù","+  Hệ thống chìa khóa thông minh");
		toyotaIQ2.Print();
	}

}
