package DEMO.oop.abstraction.ex1;

public class App1 extends TinhToan{

    @Override
    public float cong(float a, float b) {
        return a + b;
    }

    @Override
    public float tru(float a, float b) {
        return 0;
    }

    @Override
    public float nhan(float a, float b) {
        return 0;
    }

    @Override
    public float chia(float a, float b) {
        return 0;
    }
}
