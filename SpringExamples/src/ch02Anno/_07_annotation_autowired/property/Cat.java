package ch02Anno._07_annotation_autowired.property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("kitty")
public class Cat {
	@Autowired
	private int age;
	@Autowired
	private double salary;
	@Autowired
	private String name;
	@Autowired
	private PetHouse pethouse	;
	
	public Cat(){}
	
	public String toString(){
		return "姓名: " + name + "\n" +
			   "年齡: " + age + "\n" + 
			   "薪水: " + salary + "\n" +
			   "Pethouse: " + pethouse.size + "\n" ;
	}
	
	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}	
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public PetHouse getPethouse() {
//		return pethouse;
//	}
//	public void setPethouse(PetHouse pethouse) {
//		this.pethouse = pethouse;
//	}	
	
}
