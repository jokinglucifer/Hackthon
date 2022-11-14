package project_name.readers;

/**
 * 
 * @author User
 *
 */
public class PathReader {

	private String getBasePath() {
		return System.getProperty("user.dir");
	}

	public String getConfigPropPath() {
		return getBasePath() + "/src/main/resources/configuration.properties";
	}

	private String getScreenShotPageLocation() {
		return getBasePath() + "/screenshots";
	}
	
	public String saveImgFileInScreenShootLocation(String filename) {
		return getScreenShotPageLocation()+"/"+filename+".jpg";
	}

}
