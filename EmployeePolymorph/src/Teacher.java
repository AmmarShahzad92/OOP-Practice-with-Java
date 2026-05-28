public class Teacher extends Employee
{   // Teacher class

    // attributes
    private int workingDays;
    private int Scale;

    public Teacher()
    {   // constructor
        workingDays = 0;
        Scale = 0;
    }   // end of constructor

    public void Teacher(int wDays, int scale)
    {   // method to set the teacher
        workingDays = wDays;
        Scale = scale;
    }   // end of method

    public int getworkingDays()
    {   // method to get the number of days
        return workingDays;
    }   // end of method

    public int getScale()
    {   // method to get the scale
        return Scale;
    }   // end of method

    public double computeSalary(int workingDays, int Scale)
    {   // method to compute the salary

        // calculate the gross salary
        double GrossSal = workingDays * 10000;
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

}   // end of class Teacher