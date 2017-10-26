package beans;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void promote(int employeeId, String newTitle, int newSalary) {
		Employee e = employeeDao.find(employeeId);
		e.setTitle(newTitle);
		e.setSalary(newSalary);
		employeeDao.update(e);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.find(employeeId);
	}

}