package STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex1;


public class CalculateSum extends Thread {
    private int indexFrom;
    private int indexTo;
    IntegerNumbers integerNumbers;


    @Override
    public void run() {
        int sum = 0;
        for(int i=this.indexFrom; i<this.indexTo; i++){
            sum = sum + integerNumbers.getIntNumbers()[i];
        }
        this.integerNumbers.getListSum().add(sum);
    }

    public CalculateSum(int indexFrom, int indexTo, IntegerNumbers integerNumbers) {
        this.integerNumbers = integerNumbers;
        this.indexFrom = indexFrom;
        this.indexTo = indexTo;
    }

//    public void calculateSum(){
//        int sum = 0;
//        for(int i=this.indexFrom; i<=this.indexTo; i++){
//            sum = sum + integerNumbers.getIntNumbers()[i];
//        }
//        integerNumbers.getListSum().add(sum);
//    }
}
