package ch02Config._02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMainJavaConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		
		//context.register(MyStringToDateConverter.class);
		context.register(CustomerBean.class);
		context.scan("ch03.javaconfig._01");
		context.refresh();
		CustomerBean cb = context.getBean(CustomerBean.class);
		System.out.println(cb.getMessage());
		System.out.println("ends");
	}

}
