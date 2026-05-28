import java.io.*;
import java.util.Scanner;

public class BufferedFileHandling 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) 
        {
            System.out.println("Welcome to the File Handling Program");
            System.out.println("1. Create a file");
            System.out.println("2. Update a file");
            System.out.println("3. View a file");
            System.out.println("4. Delete a file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            in.nextLine();  // Consume leftover newline

            String filePath = "D:\\CUI Assignments\\Intellij for java\\FileHandling\\file.txt";

            switch (choice) 
            {
                case 1:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) 
                    {
                        String text = "COMSATS University Islamabad (CUI), CS, Lahore Campus";
                        writer.write(text);
                        System.out.println("File created and data written successfully.");
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("An error occurred while creating the file.");
                    }
                    break;

                case 2:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) 
                    {
                        String text = "\nOOP Assignment, CS, Lahore Campus.";
                        writer.write(text);
                        System.out.println("File updated successfully.");
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("An error occurred while updating the file.");
                    }
                    break;

                case 3:
                    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) 
                    {
                        String line;
                        while ((line = reader.readLine()) != null) 
                        {
                            System.out.println(line);
                        }
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("File not found or cannot be read.");
                    }
                    break;

                case 4:
                    File file = new File(filePath);
                    if (file.delete()) 
                    {
                        System.out.println("File deleted successfully.");
                    } 
                    else 
                    {
                        System.out.println("File not found or cannot be deleted.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
