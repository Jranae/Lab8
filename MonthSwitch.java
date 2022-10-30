import java.util.Scanner;
public class MonthSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int Number_Of_DaysInMonth = 0;
		String MonthOfName = "Unknown";
		System.out.println("Input a month number:");
		int month = scan.nextInt();
		System.out.println("Input a year:");
		int year = scan.nextInt();
		
		switch (month)
		{
		case 1:
			MonthOfName = "January";
			Number_Of_DaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "February";
			if((year % 400 == 0) || ((year % 4 ==0) && (year % 100 !=00))) {
				Number_Of_DaysInMonth = 29;
			}
			else {
				Number_Of_DaysInMonth = 28;
			}
			break;
		case 3:
			MonthOfName = "March";
			Number_Of_DaysInMonth = 31;
			break;
		case 4:
			MonthOfName = "April";
			Number_Of_DaysInMonth = 30;
			break;
		case 5:
			MonthOfName = "May";
			Number_Of_DaysInMonth = 31;
			break;
		case 6:
			MonthOfName = "June";
			Number_Of_DaysInMonth = 30;
			break;
		case 7:
			MonthOfName = "July";
			Number_Of_DaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "August";
			Number_Of_DaysInMonth = 31;
			break;
		case 9:
			MonthOfName = "September";
			Number_Of_DaysInMonth = 30;
			break;
		case 10:
			MonthOfName = "October";
			Number_Of_DaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "November";
			Number_Of_DaysInMonth = 30;
			break;
		case 12:
			MonthOfName = "December";
			Number_Of_DaysInMonth = 31;
			break;
		}
		System.out.println(MonthOfName + " " + year + " has " + Number_Of_DaysInMonth + " days\n");
			}
	}


