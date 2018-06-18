 class Name
{
    String name;
    
    public  void firstname(String  frstname)
    {
        System.out.println("first name="+ frstname);
    }
}
public  class Print extends Name
{
    public void secondname(String secondname)
    {
        System.out.println("second name="+ secondname);
    
    
    }
    public static void main(String[] args)
    {
        Print c = new Print();
        
        c.firstname("mounica");
        c.secondname("vegesna");
        
    }
}