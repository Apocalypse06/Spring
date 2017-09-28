package ex02;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import ex02.pets.Animal;

public class Student {
	private String name;
	private double weight;
	private int height;
	private Date birthday;
	private java.sql.Date examDate;
	private List<String> hobby;
	private String[] talent;
	private Map<String, Animal> pet;
	private Long nullObj;

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public java.sql.Date getExamDate() {
		return examDate;
	}

	public void setExamDate(java.sql.Date examDate) {
		this.examDate = examDate;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public String[] getTalent() {
		return talent;
	}

	public void setTalent(String[] talent) {
		this.talent = talent;
	}

	public Map<String, Animal> getPet() {
		return pet;
	}

	public void setPet(Map<String, Animal> pet) {
		this.pet = pet;
	}

	public Long getNullObj() {
		return nullObj;
	}

	public void setNullObj(Long nullObj) {
		this.nullObj = nullObj;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", weight=" + weight + ", height=" + height + ", birthday=" + birthday
				+ ", examDate=" + examDate + ", hobby=" + hobby + ", talent=" + Arrays.toString(talent) + ", pet=" + pet
				+ ", nullObj=" + nullObj + "]";
	}
	

}
