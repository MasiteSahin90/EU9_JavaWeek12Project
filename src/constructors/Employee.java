package constructors;

public class Employee {
    public String name, jobTitle;
    public int ID;
    public double salary;
    public static String companyName;

    static {
        companyName = "Microsoft";
    }
    public Employee(){
        salary = 10000; // this stands for not given salary
    }


}