package MaiAnh.HomeWork.Lession7.Bai2;

public class Mobi extends ChuanISO{
	@Override
	void registerBandwith() {
		System.out.println("Băng thông tần số: GSM");
	}

	@Override
	void registerFrequency() {
		System.out.println("Tần số sử dụng: 906-908 MHz");
	}
}
