public class person
{
    private int Id;
    private String Name;

    public person()
    {
        Id = 0;
        Name = "";
    }

    public void person(int id, String name)
    {
        Id = id;
        Name = name;
    }

    public int getId()
    {

        return Id;
    }

    public String getName()
    {
        return Name;
    }
}
