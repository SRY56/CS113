/* * 
Shailesh Yannam
 */

import java.util.*;

public class Satellite2 {
    private String sat_name = null; // data members
    private String TLE_Line_1 = null;
    private String TLE_Line_2 = null;

    // Constructor
    public Satellite2(String name, String line1, String line2) {
        sat_name = name;
        TLE_Line_1 = line1;
        TLE_Line_2 = line2;
    }

    // Return catalog number as a string
    public String catalog_number() {
        return TLE_Line_1.substring(2, 7);
    }


    // Return name as a string
    public String name() {
        return sat_name;
    }

    // Return 2 digit launch year as an int
    public int launch_year_yy() {
        return Integer.parseInt(TLE_Line_1.substring(9, 11));
    }

    // Convert a 2 digit launch year to 4 digit
    public static int launch_year_yyyy(int yy) {
        // Assuming the 2-digit year is in the range 00-99 and converting to 4-digit
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentCentury = currentYear / 100;
        int currentDecade = currentYear % 100 / 10;

        int century = currentCentury * 100;
        int decade = currentDecade * 10;

        int year = century + decade + yy;

        if (year > currentYear) {
            // If the calculated year is in the future, it might belong to the previous century
            return year - 100;
        } else {
            return year;
        }
    }

    // Return 4 digit launch year (use previous method)
    public int launch_year_yyyy() {
        return launch_year_yyyy(launch_year_yy());
    }

    // Return inclination as a double
    public double inclination() {
        return Double.parseDouble(TLE_Line_2.substring(8, 16));
    }

    // Return mean motion as a double
    public double mean_motion() {
        return Double.parseDouble(TLE_Line_2.substring(52, 63));
    }

    // Return eccentricity as a double
    public double eccentricity() {
        return Double.parseDouble("0." + TLE_Line_2.substring(26, 33).trim());
    }

    // Convert to string, return catalog number, launch year, inclination, mean motion, eccentricity, and name
    public String toString() {
        return String.format("%6s\t%4d\t%.2f\t%.8f\t%.7f\t%s",
                catalog_number(), launch_year_yyyy(), inclination(), mean_motion(), eccentricity(), name());
    }
}