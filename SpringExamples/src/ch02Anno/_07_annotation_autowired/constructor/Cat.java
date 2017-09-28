package ch02Anno._07_annotation_autowired.constructor;
import org.springframework.beans.factory.annotation.Autowired;

public class Cat {
	private int age;
	private double salary;
	private String name;
	private PetHouse pethouse	;
	@Autowired
	public Cat(Integer age, String name, PetHouse pethouse, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.pethouse = pethouse;
		this.salary = salary;
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
	public String toString(){
		return "姓名: " + name + "\n" +
			   "年齡: " + age + "\n" + 
			   "薪水: " + salary + "\n" +
			   "Pethouse: " + pethouse.size + "\n" ;
	}
	
}
