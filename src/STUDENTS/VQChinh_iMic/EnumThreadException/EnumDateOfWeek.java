package VQChinh_iMic.EnumThreadException;

public class EnumDateOfWeek {
	enum dateOfWeek {
		MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"),THURDAY("THUR"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");
		
		private String date;

		private dateOfWeek(String date) {
			this.date = date;
		}
		
	}
	
	public static void main(String[] args) {
		printDate("moday");
		printDate("wednesday");
		printDate("sunday");
		printDate("mon");
		printDate("fri");
		printDate("sat");		
	}
	
	private static void printDate(String date) {
		if(date.equalsIgnoreCase(dateOfWeek.MONDAY.toString()) | date.equalsIgnoreCase(dateOfWeek.MONDAY.date)) {
			System.out.println("Monday is bad");
		} else if (date.equalsIgnoreCase(dateOfWeek.SATURDAY.toString()) || date.equalsIgnoreCase(dateOfWeek.SUNDAY.toString()) || date.equalsIgnoreCase(dateOfWeek.SATURDAY.date) || date.equalsIgnoreCase(dateOfWeek.SUNDAY.date)) {
			System.out.println("Weekends are best");
		} else {
			System.out.println("Mid week days are so so");
		}
	}
}
