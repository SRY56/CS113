/**
 Shailesh Yannam
*/ 

import java.util.Scanner;
public class ProgrammingAssignment1
{
	public static void main(String[] args) 
    {
	    Scanner myObj = new Scanner(System.in);
		System.out.print("Enter time in seconds:  ");
		int time = myObj.nextInt();
		System.out.print("\n");
        System.out.println(time+" seconds is:\n");
		//finding seconds
		int seconds = time%60;
		time=time/60;
		//finding minutes
		int minutes = time%60;
		time=time/60;
		//finding hours
		int hours = time%24;
		//finding days
		int days=time/24;
		System.out.println(days +" days");
		System.out.println(hours +" hours");
		System.out.println(minutes +" minutes");
		System.out.println(seconds +" seconds");
	}
}