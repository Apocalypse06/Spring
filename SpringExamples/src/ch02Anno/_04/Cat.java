package ch02Anno._04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("cat")
public class Cat implements IMammal {
	//使用SpEL的語法取出定義在propertyFile.properties中，key為catName所對應的值
	@Value("${catName}") 
	String name;
	@Value("${catIq}") 
    int iq;
	@Value("${catWeight}") 
    double weight;
	@Value("${catMature}")
    boolean mature;
	@Value("${catCode}")
    char code;
    
	public Cat() { 	
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
		return String.format("名字:%-6s IQ=%3d 體重:%4.1f 成熟:%5s 代號:%c", 
				name, iq, weight, mature, code);
	}
	
}
