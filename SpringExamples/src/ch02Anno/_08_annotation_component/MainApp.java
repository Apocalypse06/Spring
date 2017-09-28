package ch02Anno._08_annotation_component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ch03/_06_annotation_component/Beans.xml");
		System.out.println("-------------------------------");
		Cat kitty = (Cat) context.getBean("catie");
		Cat garfield = (Cat) context.getBean("catie");
		System.out.println(kitty.hashCode());
		System.out.println(garfield.hashCode());
		System.out.println(kitty);
		System.out.println(garfield);
		((ConfigurableApplicationContext)context).close();
		
	}

}
