public class LabAttendant implements employees
{
    private int noOfCertifications;

    public void LabAttendant()
    {
        noOfCertifications = 0;
    }

    public double computeSalary(int wDays, int Certifications)
    {   // method to compute the salary
        double GrossSal = wDays * 5000 + (Certifications * 5000);
        double NetSal = GrossSal - (0.05 * GrossSal);
        return NetSal;
    }   // end of method

}
