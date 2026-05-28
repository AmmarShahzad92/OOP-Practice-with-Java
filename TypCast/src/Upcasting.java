public class Upcasting 
{
    public int num = 20;

    public void setNum(int  num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return num;
    }

    public void printData()
    {
        System.out.println("parent class method");
    }
}

class child extends Upcasting
{
    public int num = 30;

    public void printData()
    {
        System.out.println("child class method");
    }
}