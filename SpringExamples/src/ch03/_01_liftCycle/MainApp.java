package ch03._01_liftCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				("ch03/_01_liftCycle/Beans.xml");
        System.out.println("--------------容器初始化完畢---------------------");
		Regard reg = context.getBean(Regard.class);
		
		reg.sayHello();
		
		((ConfigurableApplicationContext)context).close();
	}
}
