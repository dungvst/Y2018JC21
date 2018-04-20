package DEMO.exception;

import java.io.UncheckedIOException;

public class UncheckedException extends RuntimeException {
}
class TestUncheckedException{
    public static void main(String[] args) {
        testUncheckedException();
    }
    public static void testUncheckedException() throws UncheckedIOException{
        System.out.println("Unchecked exception demo");
    }
}