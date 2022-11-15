package project_name.readers;

import java.io.FileReader;
import java.util.Properties;



/**
 * 
 * @author User
 *
 */
public class PropertiesReader {

	Properties properties = null;

	public PropertiesReader() {
		
PathReader pr = new PathReader();
		String configgurationPageLocation = pr.getConfigPropPath();
		FileReader fr = null;
		properties = new Properties();
		try {
			fr = new FileReader(configgurationPageLocation);
			properties.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * fetching bowser name
	 * @return browser name
	 */
	public String getBrowserName() {
		return (String) properties.get("browser");
	}
	
	/**
	 * 
	 * @return
	 */
	public String getURL() {
		return (String) properties.get("url");
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getImplicitWait() {
		String implicitWait = (String) properties.get("implicitWait");
		return Integer.parseInt(implicitWait);
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getExplicitWait() {
		String explicitWait = (String) properties.get("explicitWait");
		return Integer.parseInt(explicitWait);
	}
	
	/**
	 * 
	 * @return
	 */
	public Integer getHardWait() {
		String hardWait = (String) properties.get("hardWait");
		return Integer.parseInt(hardWait);
	}
}
