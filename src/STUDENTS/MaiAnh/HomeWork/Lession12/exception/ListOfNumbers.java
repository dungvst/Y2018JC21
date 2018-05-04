package STUDENTS.MaiAnh.HomeWork.Lession12.exception;
import java.io.*;
import java.util.Vector;

public class ListOfNumbers {
    private Vector victor;
    private static final int size = 10;

    public ListOfNumbers () {
        victor = new Vector(size);
        for (int i = 0; i < size; i++)
            victor.addElement(new Integer(i));
    }
    public void writeList() {
        PrintStream out = null;

        try {
            System.out.println("Entering try statement");
            out = new PrintStream(new FileOutputStream("OutFile.txt"));

            for (int i = 0; i < size; i++)
                out.println("Value at: " + i + " = " + victor.elementAt(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                    e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally {
            if (out != null) {
                System.out.println("Closing PrintStream");
                out.close();
            } else {
                System.out.println("PrintStream not open");
            }
        }
    }

    public void readList(){
        try {
            FileInputStream in = new FileInputStream("OutFile.txt");
            DataInputStream dataIn = new DataInputStream(in);
            int items = dataIn.readInt();
            for(int i=0; i<items; i++){
                int n=dataIn.readInt();
                System.out.println(n);
                victor.addElement(new Integer(n));
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
        list.readList();
    }
}
