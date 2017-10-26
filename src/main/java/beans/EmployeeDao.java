package beans;

import java.util.List;

public interface EmployeeDao {
	
	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee> employees);
	public void delete(int employeeId);
	public Employee find(int employeeId);
	public List<Employee> find(String firstName, String lastName);
	public List<Employee> find(List<Integer> employeeIds);
	public List<Employee> find(String title);
	
}
