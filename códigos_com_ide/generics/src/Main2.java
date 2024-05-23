import com.github.eduubraga.crm.Client;
import com.github.eduubraga.crm.Employee;
import com.github.eduubraga.crm.Researcher;

public class Main2 {
    public static void main(String[] args) {
        Client[] clients = {
                new Client("HP", 30_000),
                new Client("VV", 50_000),
                new Client("CE", 80_000)
        };

        Employee[] employees = {
                new Employee("Weslley", 1_375d),
                new Employee("Silas", 3_575d)
        };

        Client clientFound = Researcher.research(clients, "HP");
        Employee employeeFound = Researcher.research(employees, "Silas");

        System.out.println("Cliente encontrado: " + clientFound.getName());
        System.out.println("Funcionário encontrado encontrado: " + employeeFound.getName());
    }
}
