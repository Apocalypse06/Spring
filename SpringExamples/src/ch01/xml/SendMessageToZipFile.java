// 設計程式SendMessageToZipFile.java，此類別實作Regard介面。
// SendMessageToZipFile類別有一個實例變數message、與此變數對應的Getter/Setter、預設建構子與
// Regard介面定義的方法: public void sayHello()。
// 本類別的sayHello()會將訊息寫入壓縮檔。

package ch01.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class SendMessageToZipFile implements IRegard {
	private String message;
	File folder;
	String filename;
	
	public SendMessageToZipFile(File folder, String filename) {
		this.folder = folder;
		this.filename = filename;
		if (!folder.exists()) {  
			folder.mkdirs();
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    // 現在程式要新增功能，除了原有的功能外，還要能將訊息寫入指定的『壓縮檔』。
	@Override
	public void sayHello() {
		File file = new File(folder, filename);
		String subtitle = filename.substring(0, filename.lastIndexOf("."));
		try (
		   FileOutputStream fos = new FileOutputStream(file);
		   ZipOutputStream zos  = new ZipOutputStream(fos);
		   OutputStreamWriter osw  = new OutputStreamWriter(zos, "BIG5");
		   PrintWriter pw = new PrintWriter(osw);
		) {
			ZipEntry ze= new ZipEntry(subtitle);
			zos.putNextEntry(ze);
			pw.println(message);
			System.out.println(message);
		} catch(IOException e){
			System.out.println("發生錯誤: " + e.getMessage());
		}
	}
}
