package DEMO.enums;

public class EnumDemo {
    /*enum Season{
        SPRING, SUMMER, FALL, WINTER;

    }*/
    enum Season {
        SPRING(5), SUMMER(10), FALL(15), WINTER(30);

        private int value;

        Season(int value) {
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }
    }

    public static void main(String[] args) {
        Season season = Season.WINTER;
//        System.out.println(season);
//        System.out.println(season.getValue());

       // traverse enum
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.value);
        }

         // switch case with enum
        switch (season) {
            case SUMMER:
                System.out.println("sumer");
                break;
            case FALL:
                System.out.println("fall");
                break;
            default:
                System.out.println("other day");
        }



    }

}