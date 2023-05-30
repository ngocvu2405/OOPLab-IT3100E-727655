package displaydaysofmonth;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class DaysOfMonthYear {

	//check valid method: year non-negative, month in rule to write
	static boolean checkValidMonth(String[] month, String mMonth) {
		for (int i = 0; i < month.length; i++) {
			if (month[i].equals(mMonth)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean checkValidYear(int yYear) {
		boolean check = false;
		if (yYear >0) {
			check = true;
		}
		return check;
	}
	
	static boolean checkValidInp(String[] month, String mMonth, int yYear) {
		boolean check;
		if (checkValidYear(yYear) && checkValidMonth(month, mMonth)) {
			check =true;
		}
		else {
			check = false;
		}
		return check;
	}
	
	//check leap year
	static boolean checkLeapYear(int mMonth, int yYear) {
		boolean check = false;	
		if ((yYear % 4 == 0 && yYear %100 != 0) || yYear%400 == 0) {
			check = true;
		}
		return check;
	}
	
	//change month to integer month	
    static int changeIntMonth(String[] month, String mMonth)
    {
        for (int i=0; i<month.length; i++){
            if (month[i].equals(mMonth)){
                return i%12+1;
            }
        }
        return 0;
    }

	//dayOfMonth
	static int dayOfMonth(int mMonth, int yYear) {
		int day = 0;
		
		//Months have 30 days
		int [] m30Days = {4, 6, 9, 11};
		
		//Days of a Month
		for (int i = 0; i < m30Days.length; i++) {
			if (m30Days[i] == mMonth) {
				day = 30;
				break;
			}
			else if (mMonth == 2) {
				if (checkLeapYear(mMonth, yYear)) {
					day = 29;
				}
				else {
					day = 28;
				}
				break;
			}
			else {
				day = 31;
			}
		}
		return day;
	}
	
	//Main method
	public static void main(String[] args) {
			
		//declare month & year
		int yYear;
		String mMonth;
		Scanner keyboard = new Scanner(System.in);
		
		//List of month
		String [] month = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", 
			"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
			"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",
			"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		//back if not valid input
        while (true) {
			System.out.println("Which year?");
			yYear = keyboard.nextInt();
			System.out.println("Which month?");
			mMonth = keyboard.next();
	            if (checkValidInp(month,mMonth, yYear)) {
	                break;
            }
	        System.out.println("Please, try again with a valid input!");
        }
        
		int monthInt = changeIntMonth(month, mMonth);				
		int dayOfMonth_Year= dayOfMonth(monthInt, yYear);
		System.out.println("The number of days in " + month[monthInt+35] + ", " + yYear + " is " + dayOfMonth_Year + " days.");	
		keyboard.close();
	}
}
