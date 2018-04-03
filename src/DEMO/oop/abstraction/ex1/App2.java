package DEMO.oop.abstraction.ex1;

public class App2 extends TinhToan{

    @Override
    public float cong(float a, float b) {
        return a + b + 1;
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
