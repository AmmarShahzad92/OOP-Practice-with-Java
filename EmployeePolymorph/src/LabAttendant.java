public class LabAttendant extends Employee
{   // LabAttendant class

    // attributes
    private String LastCertification;
    private int noOfCertifications;

    public LabAttendant()
    {   // constructor
        LastCertification = "";
        noOfCertifications = 0;
    }   // end of constructor

    public void LabAttendant(String lastCertification, int noOfCertifications)
    {   // method to set the lab attendant
        LastCertification = lastCertification;
    }   // end of method

    public String getLastCertification()
    {   // method to get the last certification
        return LastCertification;
    }   // end of method

    public int getNoOfCertifications()
    {   // method to get the number of certifications
        return noOfCertifications;
    }   // end of method

    public double computeSalary(int workingDays, int Certifications)
    {   // method to compute the salary
        double GrossSal = workingDays * 5000 + (Certifications * 5000);
        double NetSal = GrossSal - (0.05 * GrossSal);
        return NetSal;
    }   // end of method

}   // end of class LabAttendant
