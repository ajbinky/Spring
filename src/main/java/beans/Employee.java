package beans;

public class Employee {
	private String firstName;
	private String lastName;
	private int id;
	private double salary;
	private int age;
	private String title;
	
	public Employee() {
		
	}
	
	public Employee(int id, String firstName, String lastName, double salary, int age, String title) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Employee #" + id + "\n\t" + firstName + " " + lastName + "\n\tAge: " + age + "\n\tTitle: " + title + "\n\tSalary: " + salary;
	}
	
}
