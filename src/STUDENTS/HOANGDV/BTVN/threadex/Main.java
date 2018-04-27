package STUDENTS.HOANGDV.BTVN.threadex;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Sum of Array
        int []arrayInput = new int[100];
        for (int i = 0; i<arrayInput.length; i++){
            arrayInput[i] = new Random().nextInt(100);
        }
        ThreadSum threadSum1 = new ThreadSum(arrayInput,0,25);
        threadSum1.start();
        ThreadSum threadSum2 = new ThreadSum(arrayInput,26,50);
        threadSum2.start();
        ThreadSum threadSum3 = new ThreadSum(arrayInput,51,75);
        threadSum3.start();
        ThreadSum threadSum4 = new ThreadSum(arrayInput,76,99);
        threadSum4.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum of Array: "+(threadSum1.getSum()+ threadSum2.getSum()+ threadSum3.getSum()+ threadSum4.getSum()));

        //Max of Array
        ThreadFindMax threadFindMax1 = new ThreadFindMax(arrayInput);
        System.out.print(threadFindMax1.getName()+" find ");
        threadFindMax1.start();
        ThreadFindMax threadFindMax2 = new ThreadFindMax(arrayInput);
        System.out.print(threadFindMax2.getName()+" find ");
        threadFindMax2.start();
        ThreadFindMax threadFindMax3 = new ThreadFindMax(arrayInput);
        System.out.print(threadFindMax3.getName()+" find ");
        threadFindMax3.start();
        ThreadFindMax threadFindMax4 = new ThreadFindMax(arrayInput);
        System.out.print(threadFindMax4.getName()+" find ");
        threadFindMax4.start();
    }
}
