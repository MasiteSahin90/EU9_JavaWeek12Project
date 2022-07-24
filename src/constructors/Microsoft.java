package constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Microsoft {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Masite";
        e1.jobTitle = "SDET";
        e1.ID = 12;
        e1.salary = 80000;
        Employee e2 = new Employee("Masite","QA leader",21,100000);

        System.out.println(e1);

        System.out.println(e2);

        ArrayList<Employee> team = new ArrayList<>();
        team.addAll(Arrays.asList(e1,e2));

        team.add(new Employee("Reha","PM",24,150000));

        System.out.println(team);

        double maxSalary = Double.MIN_VALUE;

        for (Employee each : team){
            if (each.salary>maxSalary){
                maxSalary = each.salary;
            }
        }
        System.out.println(maxSalary);

        Employee.companyName = "Tesla";

        for (Employee each : team) {
            if(each.name.equalsIgnoreCase("reha")){
                System.out.println(each.jobTitle);
            }
        }


        for (Employee each : team) {
            System.out.println(each.name + " is working for " + each.companyName);
        }

    }



}
