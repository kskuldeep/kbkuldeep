package Utils;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	public static void take_log(String message, String classname) 
	{
		DOMConfigurator.configure(".//logsss.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
		
	}

}
