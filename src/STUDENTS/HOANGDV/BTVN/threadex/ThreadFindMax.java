package STUDENTS.HOANGDV.BTVN.threadex;

public class ThreadFindMax extends Thread {

    private int[] arrayInput;
    ThreadFindMax(int[] _arrayInput){
        arrayInput = _arrayInput;
    }
    @Override
    public void run() {
        int max = 0;
        for (int i :arrayInput){
            if(max < i){
                max = i;
            }
        }
        System.out.println("Max of Array is: "+max);
    }
}
