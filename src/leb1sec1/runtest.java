package leb1sec1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

class runtest {

	@Test
	void test() {
//		fail("Not yet implemented");
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\KEN\\Desktop\\Home work\\ปี 2 เทอม 2\\driveredge\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://www.google.com");
//		driver.quit();
	}

}
