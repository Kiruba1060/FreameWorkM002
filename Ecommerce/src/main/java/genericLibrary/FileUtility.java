package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public static String getproperty(String key)throws IOException{
		
		//Step-1 get the javarepresentation of the physical properties
		FileInputStream fis=new FileInputStream("./src/test/resources/Resource/CommonData.properties");
		
		//Step-02 Create the object of Propreties
		Properties pobj=new Properties();
		
		//Step-3 Load all the key and value to properties
		pobj.load(fis);
		
		//Step-4 Get the value using getproperties(key)
		return pobj.getProperty(key);
	}

}
 