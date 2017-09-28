// 設計程式SendMessage.java，此類別實作Regard介面。
// SendMessage類別有一個實例變數message、與此變數對應的Getter/Setter、預設建構子與
// Regard介面定義的方法: public void sayHello()。

package ch01.xml;

public class SendMessage implements IRegard {
	private String message;
	public SendMessage() { 	}
	
	public SendMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void sayHello() {
		System.out.println(message);
	}
}
