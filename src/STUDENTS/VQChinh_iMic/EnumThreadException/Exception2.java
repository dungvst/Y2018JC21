package VQChinh_iMic.EnumThreadException;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exception2 {

	public static void main(String[] args) {

	}
	
	public static void cat(File named) throws IOException {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(named, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } finally {
	        if (input != null) {
	            input.close();
	        }
	    }
	}


}
