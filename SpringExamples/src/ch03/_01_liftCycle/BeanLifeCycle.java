package ch03._01_liftCycle;

public class BeanLifeCycle implements Regard {
	private String message;
	private int age;
	
	public BeanLifeCycle() { 
		System.out.println("In <init>(), 正在執行Bean元件的建構子，新建Bean元件");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("In setMessage(), message=" + message);
		this.message = message;
	}
	public void sayHello() {
		System.out.println(message);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("In setAge(), age=" + age);
		this.age = age;
	}
	public void init() {
		System.out.println("In init-method(), 已經新建Bean元件，正在init-method屬性所指定的方法, message=" + message);
	}
	public void destroy() {
		System.out.println("In destroy-method(), 準備銷毀Bean元件，正在destroy-method屬性所指定的方法");
	}
}