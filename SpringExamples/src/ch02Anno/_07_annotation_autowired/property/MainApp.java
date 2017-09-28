package ch02Anno._07_annotation_autowired.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"ch03/_05_annotation_autowired/property/Beans.xml");
		//Cat kitty = (Cat) context.getBean(Cat.class);
		Cat kitty = (Cat) context.getBean("kitty");

		System.out.println(kitty.toString());
	}
}
