package s1_SeleniumBasics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log4jdemo {
	private static Logger log =LogManager.getLogger(Log4jdemo.class.getName());
	
	//LogManager is an api with getLogger method

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Debug msg
		//Error msg
		if(4>3)
		{
			log.debug("I am debugging");
		}
		else
		{
			log.error("zero is not greater than 3 so error");
			log.info("i  am just giving info of the test");
			
		}
		log.debug("i am debug");
		log.fatal("i am debug");
		
		
	}

}
