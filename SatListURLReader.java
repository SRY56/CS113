/**
Reads Satellite data from a website
Websites:
    https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
    https://celestrak.org/NORAD/elements/
    https://en.wikipedia.org/wiki/Two-line_element_set
    https://www.programiz.com/java-programming/library/string/substring
    https://www.digitalocean.com/community/tutorials/java-convert-string-to-double
    https://www.geeksforgeeks.org/java-string-format-method-with-examples/
    https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
    https://www.digitalocean.com/community/tutorials/java-printf-method
    https://www.n2yo.com/database/
    https://www.n2yo.com/satellite/?s=45324#results
    http://www.satobs.org/seesat/Dec-2002/0197.html
*/
import java.net.*; // URL
import java.io.*; // BufferedReader, InputStreamReader
public class SatListURLReader
{
    public static void main(String[] args) throws Exception 
    {
        URL url = new URL("https://celestrak.org/NORAD/elements/gp.php?GROUP=visual&FORMAT=tle");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String name, line1, line2, cat_num;
        int launch_year_yy;
        while ((name = in.readLine()) != null)
        {
            line1 = in.readLine();
            line2 = in.readLine();
            cat_num = line1.substring(2, 7);
            launch_year_yy = Integer.parseInt(line1.substring(9, 11));
            System.out.println(String.format("%02d\t%5s\t%s", launch_year_yy, cat_num, name));
        }
        in.close();
    }
}