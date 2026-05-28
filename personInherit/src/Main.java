import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final int size = 10;
        student[] students = new student[]{new student()};
        student std = new student();
        teacher[] teachers = new teacher[]{new teacher()};
        teacher tc = new teacher();


        students = new student[size];
        teachers = new teacher[size];


        int option;
        int id;
        String name;
        int grade;
        String program;

        int studentcounter=0;
        int teachercounter=0;


        while (true)
        {
            System.out.println("1. set teacher details");
            System.out.println("2. set student details");
            System.out.println("3. View teacher details");
            System.out.println("4. View student details");
            System.out.println("0. Exit Program");
            System.out.println("Enter your option: ");
            option = in.nextInt();

            if (option == 0)
            {
                break;
            }

            switch (option)
            {
                case 1:
                    System.out.println("Enter Teacher ID: ");
                    id = in.nextInt();
                    System.out.println("Enter Teacher Name: ");
                    name = in.next();
                    tc.person(id, name);
                    System.out.println("Enter Grade: ");
                    grade = in.nextInt();
                    tc.teacher(grade);
                    teachers[teachercounter] = tc;
                    studentcounter++;
                    break;
                case 2:
                    System.out.println("Enter Student ID: ");
                    id = in.nextInt();
                    System.out.println("Enter Student Name: ");
                    name = in.next();
                    std.person(id, name);
                    System.out.println("Enter Program: ");
                    program = in.next();
                    std.student(program);
                    students[studentcounter] = std;
                    teachercounter++;
                    break;

                case 3:
                    for (int i=0; i<=teachercounter; i++)
                    {
                        System.out.println("Student No. " + (i+1));
                        System.out.println("Student ID: " + students[i].getId());
                        System.out.println("Student Name: " + students[i].getName());
                        System.out.println("Student Program: " + students[i].getProgram());
                    }

                    break;
                case 4:
                    for (int i=0; i<=teachercounter; i++)
                    {
                        System.out.println("Teacher No. " + (i+1));
                        System.out.println("Teacher ID: " + teachers[i].getId());
                        System.out.println("Teacher Name: " + teachers[i].getName());
                        System.out.println("Teacher Grade: " + teachers[i].getGrade());
                    }

                    break;

                default:
                    System.out.println("Invalid Option.");
            }

        }

    }
}