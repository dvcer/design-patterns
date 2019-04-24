import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    List<Employee> list = new ArrayList<>();

    public Employee add(Employee employee) {
        list.add(employee);
        return this;
    }

    public Employee(String name) {
        this.name = name;
    }

    protected String position;
    protected String name;

    public void print(String indent) {
        System.out.println(indent + position + " " + name);
        list.forEach(e -> e.print(indent + "\t"));

    }
}
