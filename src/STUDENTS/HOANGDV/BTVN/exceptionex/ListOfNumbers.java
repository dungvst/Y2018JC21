package STUDENTS.HOANGDV.BTVN.exceptionex;

import java.io.*;
import java.util.Vector;

public class ListOfNumbers {
    private Vector victor;
    private static final int size = 10;

    public ListOfNumbers() {
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

    public void readList(String pathFile) {
        InputStream in = null;

        try {
            System.out.println("Entering try statement");
            in = new FileInputStream(pathFile);
            byte[] readByte = new byte[size];
            in.read(readByte);
            for (int i = 0; i < readByte.length; i++) {
                System.out.println("Val " + (i + 1) + ": " + readByte[i]);
            }
        } catch (Exception e) {
            System.err.println("Caught Exception: " + e.getMessage());
        } finally {
            if (in != null) {
                System.out.println("Closing PrintStream");
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("PrintStream not open");
            }
        }
    }
}

