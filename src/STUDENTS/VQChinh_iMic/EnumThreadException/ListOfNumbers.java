package VQChinh_iMic.EnumThreadException;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Vector;

public class ListOfNumbers {
	private Vector victor;
	private static final int size = 10;	
	
	public static void main(String[] args) {
		ListOfNumbers list = new ListOfNumbers();
		list.writeList();
		list.readList();
	}
	
	public ListOfNumbers() {
		victor = new Vector(size);
		for (int i = 0; i < size; i++)
			victor.addElement(new Integer(i));
	}
	
	public void readList() {
		Vector<String> vector = new Vector<>();
		try (BufferedReader buffer = new BufferedReader(new FileReader("OutFile.txt"))) {
			String output;
			while((output = buffer.readLine()) != null) {
				System.out.println(output);
				String tmp = output.substring(10);
				System.out.println("\t" + tmp);
				String[] tmpArray = tmp.split(" = ");
				vector.add(Integer.parseInt(tmpArray[0]), tmpArray[1]);				
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("New Vector");
		for(String v : vector) {
			System.out.print("\t" + v + " ");
		}
	}

	public void writeList() {		
		PrintStream out = null;

		try {
			System.out.println("Entering try statement");
			out = new PrintStream(new FileOutputStream("OutFile.txt"));

			for (int i = 0; i < size; i++)
				out.println("Value at: " + i + " = " + victor.elementAt(i));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
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
}
