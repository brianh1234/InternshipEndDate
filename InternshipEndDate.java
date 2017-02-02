import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.GregorianCalendar;

import java.util.Scanner; 

public class InternshipEndDate
{

	public static void main(String[] args) 
	{
	
		Scanner scan = new Scanner(System.in); 

		String datePattern = "yyyy-MMM-dd";
		
		System.out.println("When does my Internship end?"); 
		System.out.println("(Created by Brian Hagopian)" + "\n");
		System.out.println("Hello welcome to the program." + " " + "This program will tell you when your internship is going to end." + "\n"); 
		System.out.println("Enter numbers into the prompts" + "\n"); 
		
		
		
		int userYear;
		int userMonth; 
		int userDay; 
		int lengthOfInternship; 
		
		
		System.out.print("Start Year: "); 
		userYear = scan.nextInt(); 
		
		System.out.print("Start Month: "); 
		userMonth = scan.nextInt(); 
		userMonth = userMonth - 1; 
		
		System.out.print("Start Day: "); 
		userDay = scan.nextInt(); 
		
		System.out.print("Length of the internship in days: "); 
		lengthOfInternship = scan.nextInt(); 
		
		System.out.println();
		
		

		Calendar userCal = new GregorianCalendar(userYear, userMonth, userDay); 

		SimpleDateFormat yyyymmdd = new SimpleDateFormat(datePattern);

		userCal.add((GregorianCalendar.DATE), lengthOfInternship); 
		
		System.out.println("Your internship end date: " + yyyymmdd.format(userCal.getTime()));
	}
}