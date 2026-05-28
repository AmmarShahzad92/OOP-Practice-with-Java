public class Downcasting 
{
    public String name = "Farrukh";
    
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void printData()
    {
        System.out.println("parent class method");
    }
}

class child2 extends Downcasting
{
    public int age = 45;
    
    public void printData()
    {
        System.out.println("child class method");
    }
}