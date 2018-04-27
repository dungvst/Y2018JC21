package STUDENTS.HOANGDV.BTVN.threadex;

import java.util.Random;

public class ThreadSum extends Thread {

    private int[] arrayInput;
    private int begin, end;
    private int sum;
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }



    ThreadSum(int[] _arrayInput, int _begin, int _end) {
        arrayInput = _arrayInput;
        begin = _begin;
        end = _end;
    }

    private int sumCalculate(){
        int sumStamp = 0;
        for (int i = begin; i < end; i++) {
            sumStamp += arrayInput[i];
        }
        return sumStamp;
    }
    @Override
    public void run() {
        setSum(sumCalculate());
    }
}
