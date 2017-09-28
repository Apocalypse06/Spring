package ex02.pets;

public class Cat implements Animal {
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getComment() {
		return String.format("小貓咪: 名字:%-5s \n",	name);
	}

}
