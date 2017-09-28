// 設計程式HelloWorld.java，此類別實作Regard介面。
package ch02Config._00;
public class HelloWorld implements Regard {
	private String message;
	public HelloWorld() { 
		message = "Hello JavaConfig...";
		System.out.println("正在執行Bean元件的建構子，新建Bean元件");
	}
	public HelloWorld(String message) {
		System.out.println("正在執行Bean元件的有參數的建構子，新建Bean元件");
		this.message = message;
	}
	public void sayHello() {
		System.out.println(message + ", hashCode=" + hashCode());
	}
	public void init() {
		System.out.println("已經新建Bean元件，在這裡進行初始化的工作");
	}
	public void destroy() {
		System.out.println("準備要銷毀Bean元件，在這裡進行結束化的工作");
	}
}

