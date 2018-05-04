package STUDENTS.MaiAnh.HomeWork.Lession12.enumm;

public class EnumExercise {
    enum Days{
        Monday(2, "Monday"), Tueday(3, "Tudeday"), Wednesday(4,"Wednesday"), Thursday(5, "Thursday"), Satturday(7, "Saturday"), Sunday(8, "Sunday");
        private int value;
        private String s;

        Days(int value, String s) {
            this.value = value;
            this.s = s;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getS() {
            return s;
        }

        public void setS(String s) {
            this.s = s;
        }
    }

    public static void printEmotion(){
        for(Days d: Days.values()){
            if(d.getValue()==2){
                System.out.println(d.getS() + "__ Mondays are bad");
            }if(d.getValue()==7||d.getValue()==8){
                System.out.println(d.getS() + "__ Weekends are best");
            }else{
                System.out.println(d.getS() +"__MidWeek day are so_so");
            }
        }
    }

    public static void main(String[] args) {
        EnumExercise.printEmotion();
    }


}
