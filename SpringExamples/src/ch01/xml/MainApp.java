package ch01.xml;
  
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	    // Spring框架讓我們能夠以更穩健、更輕鬆的方式來變更程式的功能
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("ch01/xml/BeansToFile.xml");
		IRegard reg = (IRegard)context.getBean(ch01.xml.SendMessageToFile.class);
		reg.sayHello();
		
		((ConfigurableApplicationContext)context).close();

	}    
}
// ch01/xml/Beans.xml
// ch01/xml/BeansToFile.xml
// ch01/xml/BeansToZipFile.xml