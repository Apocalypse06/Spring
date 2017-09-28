package ch02Config._00;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		context.register(HelloWorldConfig.class);
		context.refresh();
        System.out.println("----------------------------");
		Regard hello = (Regard)context.getBean("helloABC");
		hello.sayHello();
		System.out.println("============================");
		Regard hello2 = (Regard)context.getBean("helloABC");
		hello2.sayHello();
		System.out.println("****************************");
		Regard helloAgain1 = (Regard)context.getBean("helloAgain");
		helloAgain1.sayHello();
		System.out.println("============================");
		Regard helloAgain2 = (Regard)context.getBean("helloAgain");
		helloAgain2.sayHello();

		((ConfigurableApplicationContext) context).close();

	}
}
