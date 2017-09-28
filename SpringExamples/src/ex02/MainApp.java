package ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ex02/Beans.xml");
		Student  student=(Student) context.getBean("student");
		System.out.println(student.toString());
		((ConfigurableApplicationContext)context).close();
	}
}
