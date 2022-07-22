package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class configRead {
	Properties prop;

	public configRead() throws Exception {

		FileInputStream fis = new FileInputStream("./config/configData.properties");

		prop = new Properties();
		prop.load(fis);

	}

	public String getApplication_QAURL() {

		String appURL = prop.getProperty("appURL_QA");
		return appURL;

	}

    public String getApplication_DEVURL() {
    	
    	return prop.getProperty("appURL_DEV");
    	
    }
    public String getApplication_PRODURL() {
    	    	
    	    	return prop.getProperty("appURL_PROD");
    	   }
	
    public String getadminUserName() {
    	
    	return prop.getProperty("Admin");
   }
    public String getadminPassword() {
    	
    	return prop.getProperty("admin123");
   }

}
