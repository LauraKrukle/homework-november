package Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritingProperties {

	public static void main(String[] args) {
		try (OutputStream output = new FileOutputStream("newConfig.properties")) {
			Properties prop = new Properties();
			
			prop.setProperty("db.url", "localhost:8080");
			
			prop.store(output, null);
			
			System.out.println(prop);
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
