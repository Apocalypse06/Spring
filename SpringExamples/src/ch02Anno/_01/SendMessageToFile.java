package ch02Anno._01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 本範例對Setter使用@Autowired與@Resource          
// 本類別的Bean id為toFile
@Component("toFile")
@Scope("singleton")
// 效果等同 組態檔內的  <bean  id='toFile' ..../>
public class SendMessageToFile implements IRegard {

	private String message;
	@Autowired
	File folder;
	
	String filename;
	
	public SendMessageToFile(File folder, String filename) {
		System.out.println("in SendMessageToFile(用在Setter上) <init>(File, String)");
		this.folder = folder;
		this.filename = filename;
		if (!folder.exists()) {
			folder.mkdirs();
		}
	}
	public SendMessageToFile() {
		System.out.println("in SendMessageToFile(用在Setter上) <init>()");
	}
	@PostConstruct      
	public void init() {
		System.out.println("in @PostConstruct **********");
		if (!folder.exists()) {
			folder.mkdirs();
			System.out.println("@PostConstruct: 成功資料夾建立");
		}
	}
	@PreDestroy      
	public void xyz() {
		System.out.println("in @PreDestroy  ##########");
	}
	
	@Override
	public void sayHello() {
		File file = new File(folder, filename);
		try (
			PrintWriter pw = new PrintWriter(new FileWriter(file, true));
		) 
		{
			pw.println(message);
			System.out.println(message);
		} catch (IOException e) {
			System.out.println("發生錯誤: " + e.getMessage());
		}

	}
	
	public String getMessage() {
		return message;
	}
	// 下列的@Resource會尋找id為message的Bean來注入
	@Resource
	public void setMessage(String message) {
		System.out.println("in setMessage()");
		this.message = message;
	}
	public File getFolder() {
		return folder;
	}
	// 下列的@Autowired會尋找型態為File的Bean來注入
	
//	public void setFolder(File folder) {   // folder
//		System.out.println("in setFolder()");
//		this.folder = folder;
//	}
	public String getFilename() {
		return filename;
	}
	// 下列的@Resource會尋找id為filename的Bean來注入
	@Resource
	public void setFilename(String filename) {
		System.out.println("in setFilename()");
		this.filename = filename;
	}
}

