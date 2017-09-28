package ch02Anno._08_annotation_component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("catie")
@Scope("prototype")  //
//@Scope(value="singleton")
@Lazy(false)

public class Cat {
	@Resource
	private int age;
	@Resource
	private String name;
//	public void setAge(Integer age) {
//		this.age = age;
//	}
//	public int getAge() {
//		return age;
//	}
//	@Required
//	@Resource
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getName() {
//		return name;
//	}
	public String toString() {
		return "姓名:" + name +"\n" +  
			   "年齡:" + age +"\n" ;
	}
    @PostConstruct
	public void init(){
		System.out.println("本類別的init()被執行");
	}
    @PreDestroy
	public void destroy(){
		System.out.println("本類別的destroy()被執行");
	}
}
