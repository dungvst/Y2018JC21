package STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex2;

import STUDENTS.MaiAnh.HomeWork.Lession12.thread.ex1.IntegerNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FindMax implements Runnable{

    private int indexTo;
    private int indexFrom;
    IntegerNumbers integerNumbers;


    public FindMax(int indexTo, int indexFrom, IntegerNumbers integerNumbers) {
        this.indexTo = indexTo;
        this.indexFrom = indexFrom;
        this.integerNumbers  = integerNumbers;

    }

    @Override
    public void run() {
        for(int i = indexFrom; i<=indexTo; i++){
            if(integerNumbers.getIntNumbers()[i]>integerNumbers.getMax()){
                integerNumbers.setMax(integerNumbers.getIntNumbers()[i]);
            }
        }
    }
}
