package ch02Anno._04;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements IMammal {
	String name;
    int iq;
    double weight;
    boolean mature;
    char code;

	public Dog() { 	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isMature() {
		return mature;
	}

	public void setMature(boolean mature) {
		this.mature = mature;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	@Override
	public String getComment() {
		return String.format("名字:%-6s IQ=%3d 體重:%4.1f 成熟:%b 代號:%c", 
				name, iq, weight, mature, code);
	}
}
