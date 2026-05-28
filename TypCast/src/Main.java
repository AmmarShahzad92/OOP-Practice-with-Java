import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) 
        { 
            System.out.println("1. Upcasting");
            System.out.println("2. Downcasting");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    Upcasting obj1 = new Upcasting();
                    Upcasting obj2 = (Upcasting) new child();
                    obj1.printData();
                    obj2.printData();
                    break;
                case 2:
                    Downcasting obj3 = new child2();
                    obj3.name = "Farrukh";
                    child2 obj4 = (child2) obj3;
                    System.out.println(obj4.name);
                    System.out.println(obj4.age);
                    obj4.printData();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
