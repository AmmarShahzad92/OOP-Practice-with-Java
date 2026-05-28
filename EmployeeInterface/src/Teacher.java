public class Teacher implements employees
{
    private int scale;

    public void Teacher()
    {
        scale = 0;
    }

    public double computeSalary(int wDays, int Scale)
    {   // method to compute the salary

        // calculate the gross salary
        double GrossSal = wDays * 10000;
        double NetSal = 0;
        if (Scale > 16 && Scale < 19)
        {   // if statement to check the scale
            NetSal = GrossSal - (0.17 * GrossSal); 
        }   // end of if statement
        else if (Scale >= 19 && Scale < 21)
        {   // else if statement to check the scale
            NetSal = GrossSal - (0.20 * GrossSal);
        }   // end of else if statement
        else
        {   // else statement to check the scale
            NetSal = GrossSal - (0.25 * GrossSal);
        }   // end of else statement
        return NetSal;
    }   // end of method
}
