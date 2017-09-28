package ch02Anno._04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
    Setter: 注入字串與基本型態
 */
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ch02Anno/_04/Beans.xml");
		
		IMammal mcat = (IMammal)context.getBean("cat");
		System.out.println(mcat.getComment());
//      請練習對Dog加入應有的Annotation(@Component、@Value)
		
//		IMammal mdog = (IMammal)context.getBean("dog");
//		System.out.println(mdog.getComment());
		
		((ConfigurableApplicationContext)context).close();
	}
}
