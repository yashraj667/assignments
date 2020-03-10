package logpack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogDemo {
	
	static Logger log=Logger.getLogger("logdemo");
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		new LogDemo().businessMethod();
		System.out.println("success");
	}

	public void businessMethod() {
		// TODO Auto-generated method stub
		log.debug("debug msg");
		log.info("info msg");
	}

}
