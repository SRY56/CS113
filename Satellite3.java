/*
Shailesh Yannam
 */

import java.util.*;

public class Satellite3 {
    private String sat_name = null;
    private String TLE_Line_1 = null;
    private String TLE_Line_2 = null;

    public Satellite3(String name, String line1, String line2) {
        sat_name = name;
        TLE_Line_1 = line1;
        TLE_Line_2 = line2;
    }

    public String catalog_number() {
        return TLE_Line_1.substring(2, 7);
    }

    public String name() {
        return sat_name;
    }

    public int launch_year_yy() {
        return Integer.parseInt(TLE_Line_1.substring(9, 11));
    }

    public static int launch_year_yyyy(int yy) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentCentury = currentYear / 100;
        int currentDecade = currentYear % 100 / 10;

        int century = currentCentury * 100;
        int decade = currentDecade * 10;

        int year = century + decade + yy;

        if (year > currentYear) {
            return year - 100;
        } else {
            return year;
        }
    }

    public int launch_year_yyyy() {
        return launch_year_yyyy(launch_year_yy());
    }

    public double inclination() {
        return Double.parseDouble(TLE_Line_2.substring(8, 16));
    }

    public double mean_motion() {
        return Double.parseDouble(TLE_Line_2.substring(52, 63));
    }

    public double eccentricity() {
        return Double.parseDouble("0." + TLE_Line_2.substring(26, 33).trim());
    }

    public double aopgee() {
        return Double.parseDouble(TLE_Line_2.substring(34, 42).trim());
    }

    public double perigee() {
        return Double.parseDouble(TLE_Line_2.substring(44, 51).trim());
    }

    public double period() {
        double mean_motion = mean_motion();
        return (1440.0 / mean_motion); // Assuming mean motion is in orbits per day
    }

    public String toString() {
        return String.format("%6s\t%4d\t%.2f\t%.8f\t%.7f\t%.2f\t%.2f\t%.2f\t%s",
                catalog_number(), launch_year_yyyy(), inclination(), mean_motion(),
                eccentricity(), aopgee(), perigee(), period(), name());
    }
}
