package ch02Config._01;
  
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
                                   
public class MainApp {  
	public static void main(String[] args) {
	    
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext();
		
		context.register(SendMessageConfig.class);
		context.refresh();
		
		Regard reg = (Regard)context.getBean("toFile");
		reg.sayHello();
		
		((ConfigurableApplicationContext)context).close();

	}    
}
