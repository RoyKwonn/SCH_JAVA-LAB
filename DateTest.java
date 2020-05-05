package four;

import java.util.*;
//import java.text.SimpleDateFormat;

class Date{
	
	int year;
	int month;
	int day;
	
	//연도, 월, 일 
	void print1() {
		// 2012.7.12
		System.out.println(year + "." + month + "." + day);
	}
	void print2() {
		// July 12, 2012
		//SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
		//String date_type = sdf.format(this);
		//System.out.println(date_type);
		
		switch (month) {
		case 1:
			System.out.print("January ");
			break;
		case 2:
			System.out.print("February ");
			break;
		case 3:
			System.out.print("March ");
			break;
		case 4:
			System.out.print("April ");
			break;
		case 5:
			System.out.print("May ");
			break;
		case 6:
			System.out.print("June ");
			break;
		case 7:
			System.out.print("July ");
			break;
		case 8:
			System.out.print("August ");
			break;
		case 9:
			System.out.print("September ");
			break;
		case 10:
			System.out.print("October ");
			break;
		case 11:
			System.out.print("November ");
			break;
		case 12:
			System.out.print("December ");
			break;
		}
		System.out.println(day + ", " + year);
	}
	
	Date(){
		Calendar cal = Calendar.getInstance();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day =  cal.get(Calendar.DAY_OF_MONTH);
	}
}



public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		date.print1();
		date.print2();
		
	}

}
