package Phamduydieu.QuanLySach;

public class Cong extends PhepTinh {
	public float a;
	public float b;
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	@Override
	public float cong() {
		// TODO Auto-generated method stub
		return a+b;
	}
	@Override
	public float tru() {
		// TODO Auto-generated method stub
		return a-b;
	}
@Override
public float nhan() {
	// TODO Auto-generated method stub
	return a*b;
}
	@Override
	public float chia() {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	}
