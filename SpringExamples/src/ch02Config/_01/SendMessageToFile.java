package ch02Config._01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SendMessageToFile implements Regard {
	private String message;
	private File folder;
	private String filename;
	public SendMessageToFile(File folder, String filename, String message) {
		System.out.println("in SendMessageToFile(用在Constructor上) <init>(File, String), filename=" + filename);
		this.folder = folder;
		this.filename = filename;
		this.message = message;
	}

	public void init() {
		System.out.println("in @PostConstruct");
		if (!folder.exists()) {
			folder.mkdirs();
			System.out.println("@PostConstruct: 成功資料夾建立");
		}
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
}

