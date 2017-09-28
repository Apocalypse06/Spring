package ch02Anno._06_annotation_requried;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext
                ("ch03/_04_annotation_requried/Beans.xml");
        Cat c = context.getBean(Cat.class);
        System.out.println(c.getDetails());
    }    
}

