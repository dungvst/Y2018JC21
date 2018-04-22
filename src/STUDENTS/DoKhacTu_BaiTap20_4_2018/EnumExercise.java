package DoKhacTu_BaiTap20_4_2018;

public class EnumExercise {
    enum Day {
        MONDAY("Mondays are bad"), TUESDAY("Midweek days are so-so"), WEDNESDAY("Midweek days are so-so"), THURSDAY("Midweek days are so-so"), FRIDAY("Midweek days are so-so"), 
        SATURDAY("Weekends are best"), SUNDAY("Weekends are best");
        private String a;

		private Day(String a) {
			this.a = a;
		}
        
    }

	public static void main(String[] args) {
		EnumExercise c = new EnumExercise();
		c.printDay();

	}
	public void printDay() 
	{
		 for (Day b : Day.values()) {
	            System.out.println(b  + ": " + b.a);
	        }

	}

}
