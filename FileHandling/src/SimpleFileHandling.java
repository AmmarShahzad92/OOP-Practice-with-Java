import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SimpleFileHandling 
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
            System.out.println("Enter your choice: ");
            choice = in.nextInt();
            String filePath = "D:\\CUI Assignments\\Intellij for java\\FileHandling\\file.txt";
            switch (choice) 
            {
                case 1:
                    try 
                    {
                        File file = new File(filePath);
                        file.createNewFile();
                        FileWriter writer = new FileWriter(filePath);
                        String text = "COMSATS University Islamabad (CUI), CS, Lahore Campus";
                        writer.write(text);
                        writer.close();
                        System.out.println("File created successfully.");
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("An error occurred while creating the file.");
                    }
                    break;

                case 2:
                    try 
                    {
                        FileWriter writer = new FileWriter(filePath, true);
                        String text = "\nOOP Assignment, CS, Lahore Campus.";
                        writer.write(text);
                        writer.close();
                        System.out.println("File updated successfully.");
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("An error occurred while updating the file.");
                    }
                    break;

                case 3:
                    try 
                    {
                        File file = new File(filePath);
                        Scanner reader = new Scanner(file);
                        while (reader.hasNextLine()) 
                        {
                            String data = reader.nextLine();
                            System.out.println(data);
                            char[] ch = data.toCharArray();
                            String str = (ch.toString()) + "Welcome";
                            System.out.println(str);
                        }
                        reader.close();
                    } 
                    catch (IOException e) 
                    {
                        System.out.println("An error occurred while reading the file.");
                    }
                    break;

                case 4:
                    try 
                    {
                        File file = new File(filePath);
                        if (file.delete()) 
                        {
                            System.out.println("File deleted successfully.");
                        } 
                        else 
                        {
                            System.out.println("File not found.");
                        }
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("An error occurred while deleting the file.");
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}