package ch02Config._01;

import java.io.File;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendMessageConfig {
	@Bean 
    public  File  file(){
		return new File("C:\\_spring\\dataConfig");
	}
	@Bean 
    public  String  filename(){
		return new String("message.txt");
	}
	@Bean 
    public  String  message(){
		return new String("Hello, 大家好(toFile), Java-based Bean Configuration");
	} 
	@Bean(initMethod = "init") 
	public SendMessageToFile toFile(){
		return new SendMessageToFile(file(), filename(), message());
	}
}
