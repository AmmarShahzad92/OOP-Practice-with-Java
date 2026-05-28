import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws Exception 
    {   // main method

        // Create a Scanner object
        Scanner in = new Scanner(System.in);
        int option = 0;
        // Create objects of the classes
        Teacher teacher = new Teacher();
        LabAttendant labAttendant = new LabAttendant();
        int wDays;
        int scale;
        int noOfCertifications;
        
        while (true)
        {   // while loop to display the menu
            System.out.println("1. Compute Teacher Salary");
            System.out.println("2. Compute Lab Attendant Salary");
            System.out.println("0. Exit");
            System.out.println("Enter your option: ");
            option = in.nextInt();

            if (option == 0)
            {   // if statement to exit the program
                break;
            }   // end of if statement

            switch (option)
            {   // switch statement to select the option
                case 1:     // case 1 to compute the teacher salary
                    System.out.println("Enter the number of working days: ");
                    wDays = in.nextInt();
                    System.out.println("Enter the scale: ");
                    scale = in.nextInt();
                    System.out.println("The salary of the teacher is: " + teacher.computeSalary(wDays, scale));
                    break;

                case 2:     // case 2 to compute the lab attendant salary
                    System.out.println("Enter the number of working days: ");
                    wDays = in.nextInt();
                    System.out.println("Enter the number of certifications: ");
                    noOfCertifications = in.nextInt();
                    System.out.println("The salary of the lab attendant is: " + labAttendant.computeSalary(wDays, noOfCertifications));
                    break;

                default:    // default case
                    System.out.println("Invalid option");
                    break;
            }   // end of switch statement
        }   // end of while loop
    }   // end of main method
}
