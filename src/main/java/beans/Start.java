package beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		
		System.out.println(employeeService.getEmployee(0).toString());
		System.out.println(employeeService.getEmployee(1).toString());
		System.out.println(employeeService.getEmployee(2).toString());
		employeeService.promote(0, "Software Engineer", 70000);
		System.out.println(employeeService.getEmployee(0).toString());
		System.out.println("¯\\_(ツ)_/¯");
	}

}
