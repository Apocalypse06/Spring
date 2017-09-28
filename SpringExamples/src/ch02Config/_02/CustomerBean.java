package ch02Config._02;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class CustomerBean {
	@Value("${customer.name}")
    private String name;
	@Value("${customer.birthday}")
    private Date birthday;
	@Value("${customer.score}")
    private int score;
	
	public String getMessage() {
        //return String.format("Hello! 我的名字是 %s. 生日: %ty/%tm/%td.", name, birthday, birthday, birthday);
		return String.format("Hello! 我的名字是 %s, 生日: %s, 分數:%d", name, birthday, score);
		
    }
}
