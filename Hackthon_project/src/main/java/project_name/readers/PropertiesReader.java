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

//	public static void main(String[] args) throws FileNotFoundException {
//
//		String currentProjectLocation = System.getProperty("user.dir");
//		String insideProjectFileLocation = "/src/main/resources/configuration.properties";
//
//		String configgurationPageLocation = currentProjectLocation + insideProjectFileLocation;
//		FileReader fr = new FileReader(configgurationPageLocation);
//		Properties properties = new Properties();
//		try {
//			properties.load(fr);
//			String bn = (String) properties.get("browsername");
//			System.out.println(bn);
//			String hardWait = (String) properties.get("hardWait");
//			int h = Integer.parseInt(hardWait);
//			System.out.println(h);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
}
