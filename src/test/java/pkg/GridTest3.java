package pkg;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest3 {

	@Test
	public static void mantri() throws MalformedURLException {

		WebDriver driver = null;
		ChromeOptions options = new ChromeOptions();

		String value = "in Chrome+ GridTest3";

		driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
		driver.get("https://www.xe.com");
		String currTitle = driver.getTitle();
		System.out.println(currTitle);

		long id = Thread.currentThread().getId();
		System.out.println("Test " + value + ". Thread id is: " + id);
		System.out.printf("%n%n");

		driver.quit();

	}

}
