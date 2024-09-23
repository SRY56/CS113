/**
 Shailesh Yannam
 */

public class Satellite
{
    private int launch_year_yy;
    private int cat_num;
    private double line1;
    private double line2;
    private String name;
    
    private Satellite(int launch_year_yy, int cat_num, double line1, double line2, String name)
    {
        this.launch_year_yy = launch_year_yy;
        this.cat_num = cat_num;
        this.line1 = line1;
        this.line2 = line2;
        this.name = name;
    }

    public int getlaunch_year_yy() 
    {
        return launch_year_yy;
    }
    public void setlaunch_year_yy(int launch_year_yy) 
    {
        this.launch_year_yy = launch_year_yy;
    }

    public int getcat_num()
    {
        return cat_num;
    }
    public void setcat_num(int cat_num)
    {
        this.cat_num = cat_num;
    }
    
    public double getline1()
    {
        return line1;
    }
    public void setline1(double line1)
    {
        this.line1 = line1;
    }
    
    public double getline2()
    {
        return line2;
    }
    public void setline2(double line2)
    {
        this.line2 = line2;
    }

    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return String.format("%.2f, %.2f, %.2f, %04d, %d, %s", launch_year_yy, cat_num, line1, line2, name);
    }

    public double period_min()
    {
        return 0.0;
    }

    public double apogee() 
    {
        return 0.0;
    }

    public double perigee()
    {
        return 0.0;
    }
}