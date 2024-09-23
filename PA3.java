/*
Shailesh yannam
 */

import java.net.*; // URL
import java.io.*; // BufferedReader, InputStreamReader
public class PA3 {
    public static void main(String[] args) throws Exception 
    {
        URL url = new URL("https://celestrak.org/NORAD/elements/gp.php?GROUP=geo&FORMAT=tle");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String name, line1, line2, cat_num;
        int launch_year_yy;
        while ((name = in.readLine()) != null) {
            line1 = in.readLine();
            line2 = in.readLine();
            cat_num = line1.substring(2, 7);
            launch_year_yy = Integer.parseInt(line1.substring(9, 11));
            double inclination = Double.parseDouble(line2.substring(8,16));
            if (inclination >= 45.0) {
                System.out.println(String.format("%02d\t%5s\t%s\t%.2f", launch_year_yy, cat_num, name, inclination));
            }
        }
        in.close();
    }
}