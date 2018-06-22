import java.util.*;

class Dates {

	public static HashMap<String, String> date = new HashMap<String, String>();
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> last = new HashMap<String, String>();
	public static HashMap<String, String> first = new HashMap<String, String>();

	public static void date()
	{
		date.put("01", "First");
		date.put("02", "Second");
		date.put("03", "Third");
		date.put("04", "Fourth");
		date.put("05", "Fifth");
		date.put("06", "Sixth");
		date.put("07", "Seventh");
		date.put("08", "Eighth");
		date.put("09", "Ninth");
		date.put("10", "Tenth");
		date.put("11", "Eleventh");
		date.put("12", "Twelveth");
		date.put("13", "Thirteenth");
		date.put("14", "Fourteenth");
		date.put("15", "Fifteenth");
		date.put("16", "Sixteenth");
		date.put("17", "Seventeenth");
		date.put("18", "Eighteenth");
		date.put("19", "Nineteenth");
		date.put("20", "Twenty");
		date.put("21", "Twenty First");
		date.put("22", "Twenty Second");
		date.put("23", "Twenty Third");
		date.put("24", "Twenty Fourth");
		date.put("25", "Twenty Fifth");
		date.put("26", "Twenty Sixth");
		date.put("27", "Twenty Seventh");
		date.put("28", "Twenty Eighth");
		date.put("29", "Twenty Ninth");
		date.put("30", "Thirty");
		date.put("31", "Thirty First");

		month.put("01", "January");
		month.put("02", "February");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "September");
		month.put("10", "October");
		month.put("11", "November");
		month.put("12", "December");

		
		first.put("00", "Hundred");
		first.put("01", "First");
		first.put("02", "Second");
		first.put("03", "Third");
		first.put("04", "Fourth");
		first.put("05", "Fifth");
		first.put("06", "Sixth");
		first.put("07", "Seventh");
		first.put("08", "Eighth");
		first.put("09", "Ninth");
		first.put("10", "Tenth");
		first.put("11", "Eleventh");
		first.put("12", "Twelve");
		first.put("13", "Thirteen");
		first.put("14", "Fourteen");
		first.put("15", "Fifteen");
		first.put("16", "Sixteen");
		first.put("17", "Seventeen");
		first.put("18", "Eighteen");
		first.put("19", "Nineteen");
		first.put("20", "Twenty");
		first.put("21", "Twenty One");
		first.put("22", "Twenty Two");
		first.put("23", "Twenty Three");
		first.put("24", "Twenty Four");
		first.put("25", "Twenty Five");
		first.put("26", "Twenty Six");
		first.put("27", "Twenty Seven");
		first.put("28", "Twenty Eight");
		first.put("29", "Twenty Nine");
		first.put("30", "Thirty");
		first.put("40", "Forty");
		first.put("50", "Fifty");
		first.put("60", "Sixty");
		first.put("70", "Seventy");
		first.put("80", "Eighty");
		first.put("90", "Ninety");
		
		
		last.put("07", "Seven");
		last.put("08", "Eight");
		last.put("09", "Nine");
		last.put("10", "Ten");
		last.put("11", "Eleven");
		last.put("12", "Twelve");
		last.put("13", "Thirteen");
		last.put("14", "Fourteen");
		last.put("15", "Fifteen");
		last.put("16", "Sixteen");
		last.put("17", "Seventeen");
		last.put("18", "Eighteen");
		last.put("19", "Nineteen");
		last.put("20", "Twenty");
		last.put("21", "Twenty One");
		last.put("22", "Twenty Two");
		last.put("23", "Twenty Thee");
		last.put("24", "Twenty Four");
		last.put("25", "Twenty Five");
		last.put("26", "Twenty Six");
		last.put("27", "Twenty Seven");
		last.put("28", "Twenty Eight");
		last.put("29", "Twenty Nine");
		last.put("30", "Thirty");

	}

	public static String convert(String Input) 
	{
		String d = Input.substring(0, 2);
		String m = Input.substring(3, 5);
		String yL = Input.substring(6, 8);
		String yF = Input.substring(8, 10);
		return date.get(d) + " " + month.get(m) + " " + last.get(yL) + " " + first.get(yF);
	}

	public static void main(String args[]) 
	{
		date();
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date in the format: DD-MM-YYYY");
		String a = sc.nextLine();
		System.out.println(convert(a));  */

		System.out.println("21-06-2018");
		System.out.println(convert("21-06-2018"));


	}
}