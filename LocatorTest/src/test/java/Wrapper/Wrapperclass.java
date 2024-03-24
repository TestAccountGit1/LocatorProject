package Wrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.test.testcases.BaseClass;

public class Wrapperclass extends BaseClass {

	public static String configurationDetails(String key) throws IOException
	{
		File file = new File("src/test/resources/Configuration/Settings");
		FileInputStream fileStream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileStream);
		String str1 = prop.getProperty(key);
		return str1;
	}
	
	public static void screenShot(WebDriver driver, String fileName)  throws IOException
	{
		TakesScreenshot screenShots = (TakesScreenshot)driver;
		File screnshotLocation = screenShots.getScreenshotAs(OutputType.FILE);
		File location = new File("src/test/resources/Screenshot"+fileName+".png");
		FileHandler.copy(screnshotLocation, location);
	}
}
