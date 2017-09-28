package ch02._01_setter._02;

public class Dog implements IMammal {
	String petName;
	@Override
	public void cry() {
		System.out.println(petName + "打針，WouWouuu...");
	}
	public void bark() {
		System.out.println(petName + ":WannWannWaannn...");
	}
	
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}
}
