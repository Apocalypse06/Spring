package ch02Config._00;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// 本檔案的內容相當於一個xml組態檔

@Configuration
public class HelloWorldConfig {
     @Bean
     //@Scope("singleton")
     @Scope("prototype")
     // 本方法等同於一個<bean>標籤，方法名稱就是bean的id屬性值，傳回值的型態就是bean的class屬性值。
     // Spring容器會依下列定義產生一個HelloWorld物件(singleton)或多個HelloWorld物件(prototype)
     // 程式使用"hello"來取出本物件
     public HelloWorld helloABC(){
    	 return new HelloWorld();
     }
     @Bean(initMethod = "init", destroyMethod = "destroy" )
     //@Scope("singleton")
     @Scope("prototype")
     // 本方法等同於一個<bean>標籤，方法名稱就是bean的id屬性值，傳回值的型態就是class屬性值。
     // Spring容器會依下列定義產生一個HelloWorld物件(singleton)或多個HelloWorld物件(prototype)
     // 程式使用"helloAgain"來取出本物件
     
     public HelloWorld helloAgain(){
    	 return new HelloWorld("大家好");
     }
}
