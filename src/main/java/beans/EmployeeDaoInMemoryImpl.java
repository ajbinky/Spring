package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeDaoInMemoryImpl implements EmployeeDao {
	
	HashMap<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	{
		Employee e0 = new Employee(0, "AJ", "Behncke", Integer.MIN_VALUE, 24, "Student");
		Employee e1 = new Employee(1, "Will", "Tinguely", 20000, 20, "Software Engineer Intern");
		Employee e2 = new Employee(2, "Bill", "Gates", Integer.MAX_VALUE, 61, "Legend");
		
		employees.put(e0.getId(), e0);
		employees.put(e1.getId(), e1);
		employees.put(e2.getId(), e2);
	}

	@Override
	public void insert(Employee employee) {
		employees.put(employee.getId(), employee);
	}

	@Override
	public void update(Employee employee) {
		insert(employee);
	}

	@Override
	public void update(List<Employee> employees) {
		for (Employee e : employees) {
			insert(e);
		}
	}

	@Override
	public void delete(int employeeId) {
		employees.remove(employeeId);
	}

	@Override
	public Employee find(int employeeId) {
		return employees.get(employeeId);
	}

	@Override
	public List<Employee> find(String firstName, String lastName) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee e : employees) {
			if (e.getFirstName().equals(firstName) && e.getLastName().equals(lastName)) {
				employees.add(e);
			}
		}
		return employees;
	}

	@Override
	public List<Employee> find(List<Integer> employeeIds) {
		List<Employee> employees = new ArrayList<Employee>();
		for (int i : employeeIds) {
			employees.add(find(i));
		}
		return employees;
	}

	@Override
	public List<Employee> find(String title) {
		List<Employee> employees = new ArrayList<Employee>();
		for (Employee e : employees) {
			if (e.getTitle().equals(title)) {
				employees.add(e);
			}
		}
		return employees;
	}

}
