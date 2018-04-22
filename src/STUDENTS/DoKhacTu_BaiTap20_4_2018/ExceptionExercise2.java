package DoKhacTu_BaiTap20_4_2018;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ExceptionExercise2 {
	public static void cat(File named)  {
	    RandomAccessFile input = null;
	    String line = null;

	    try {
	        input = new RandomAccessFile(named, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
	        }
	        return;
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        if (input != null) {
	            try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	    }
	}

}
