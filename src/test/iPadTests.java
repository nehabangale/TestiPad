import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iPadTests {
	
	@BeforeSuite
	public void setup()
	{
		File app = new File("/Users/qa/AuctionAppFile/Auction.com.app");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.VERSION, "7.0");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("deviceName", "iPad");
		WebDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@Test
	public void login1()
	{
		
	}

}
