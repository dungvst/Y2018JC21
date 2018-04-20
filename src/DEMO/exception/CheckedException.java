package DEMO.exception;

public class CheckedException extends Exception {
}

class TestCheckedException {
    public static void main(String[] args) {
//        testCheckedException();
    }
    private static void testCheckedException() throws CheckedException {
        System.out.println("Checked exception demo");
    }
}
