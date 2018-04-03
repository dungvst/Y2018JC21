package MaiAnh.HomeWork.Lession7.Bai2;

public class Viettel extends ChuanISO{

	@Override
	void registerBandwith() {
		System.out.println("Băng thông tần số: CDMA");
	}

	@Override
	void registerFrequency() {
		System.out.println("Tần số sử dụng: 903-905 MHz");
	}
}
