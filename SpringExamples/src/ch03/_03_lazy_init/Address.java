package ch03._03_lazy_init;

public class Address {
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	static {
		System.out.println("in Address類別的靜態區塊，Address類別被載入");
	}
}
