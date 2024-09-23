/**
 Shailesh Yannam
*/ 

import java.util.Scanner;
public class PA1
{
    public static void main(String[] args)
    {
        /* Declare the variables. */

        int seconds_count;
        int minutes_count;
        int hours_count;
        int days_count;
        
        /* Get the input. */
        Scanner dc = new Scanner(System.in);
        System.out.print("Enter time in Seconds:  ");
        int time = dc.nextInt();

        /* Do the computations. */
        seconds_count = time%60;
        time = time/60;
        minutes_count = time%60;
        time = time/60;
        hours_count = time%24;
        days_count = time/24;

        /* Output the results. */
        System.out.println(days_count +" days");
		System.out.println(hours_count +" hours");
		System.out.println(minutes_count +" minutes");
		System.out.println(seconds_count +" seconds");
	}

}