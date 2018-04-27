package STUDENTS.MaiAnh.HomeWork.Lession12.exception;

import java.io.*;

public class Ex2 {
    public static void cat (File named) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(named, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        } finally {
            try{
            if (input != null) {
                input.close();
            }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }

}
