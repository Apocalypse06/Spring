package ch02._01_setter._01;

public class Employee implements IPerson {
    String name;
    int salary;
    double weight;
    boolean married;
    char code;
    
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	@Override
	public String getComment() {
		return String.format("名字:%-6s 薪水=%3d 體重:%4.1f 已婚:%5s 代號:%c", 
				name, salary, weight, married, code);
	}
	
}
