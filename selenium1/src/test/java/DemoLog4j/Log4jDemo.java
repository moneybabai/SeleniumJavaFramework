package DemoLog4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	// we are creating logger for the particular class log4jDemo
	// and the variable is log
	static Logger log = LogManager.getLogger(Log4jDemo.class);
// we have used static because its used in static method    
// And to access log manager options i.e to access
// options with ref variable "log"	
	
	public static void main(String[] args) {
		
		System.out.println("\n Hello world...!  \n");
		
		log.trace("This is trace msg");
		log.info("This is information msg");
		log.error("This is an error");
		log.warn("This is an warn");
		log.fatal("This is an fatal");
		
		System.out.println("\n Completed ");

	}

}
