package Questions_Solutions.Question10;


import java.util.LinkedHashSet;

class Employee
{
    String name;
    Integer id;
    Employee(String name, Integer id)
    {
        this.name = name;
        this.id = id;
    }

    //overriding hashCode function
    @Override
    public int hashCode(){
        System.out.println("In hashcode");
        int hashcode = 0;
        hashcode = id*20;
        hashcode += name.hashCode();
        return hashcode;
    }

    //overriding equals function to compare elements
    @Override
    public boolean equals(Object object)
    {
        System.out.println("In equals");
        if (object instanceof Employee)
        {
            Employee employee = (Employee) object;
            return (employee.name.equals(this.name) && employee.id == this.id);
        }
        else
        {
            return false;
        }
    }
}

public class Remove_Duplicates
{
    public static void main(String[] args)
    {
        LinkedHashSet<Employee> employeesSet = new LinkedHashSet<>();
        employeesSet.add(new Employee("Riya", 20));
        employeesSet.add(new Employee("Jasleen", 40));
        employeesSet.add(new Employee("Sahil", 30));
        employeesSet.add(new Employee("Riya", 20));

        for (Employee employee: employeesSet)
        {
            System.out.println(employee.name+" "+employee.id);
        }

    }
}
