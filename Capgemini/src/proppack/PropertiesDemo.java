package proppack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties p=new Properties();
		
		p.setProperty("url", "jdbc::orcle:thin");
		p.setProperty("username", "1001");
		FileOutputStream out=new FileOutputStream("app.properties");
		p.store(out, "stored");
		out.close();
		
		FileInputStream in =new FileInputStream("app.properties");
		p.load(in);
		System.out.println(p.getProperty("username"));
		//p.list(System.out);
	}

}
