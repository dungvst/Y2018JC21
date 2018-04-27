package STUDENTS.HOANGDV.BTVN.enumex;

public class EnumEx {
    enum Day {
        Monday, Tuesday, Wedday, Thursday, Friday, Saturday, Sunday;
    }

    public static void main(String[] args) {
        printDay();
    }

    public static void printDay() {
        for (Day day : Day.values()) {
            if (day == Day.Monday) {
                System.out.println("Mondays are bad");
            } else if (day == Day.Sunday) {
                System.out.println("Weekends are best");
            } else {
                System.out.println("Midweek days are so-so");
            }
        }
    }
}
