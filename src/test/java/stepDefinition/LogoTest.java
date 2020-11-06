package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoTest   {
	WebDriver d;
	WebElement wb;
	String path = System.getProperty("user.dir");
	String searchBox="//input[@name='q']";
	String clickOnFirstValue="(//ul[@role='listbox']/li)[1]";
	String logo="//img[contains(@id,'wp_thbn')]";
	
	
	@Given("^Open \"([^\"]*)\" and navigate to \"([^\"]*)\"$")
	public void Open_and_navigate_to(String browser, String url) throws Throwable {
		if(browser.equalsIgnoreCase("chrome"))
		{
        System.out.println("Open chrome browser");
		System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	    DesiredCapabilities dc=DesiredCapabilities.chrome();
	    dc.setCapability(ChromeOptions.CAPABILITY, options);
	    d = new ChromeDriver(dc);
		d.manage().window().maximize();
	    d.get(url);
	    }
		else
		{
		  System.out.println("Given browser doesnot exist");	
		}
		
		
	}

	@When("^user need to search for \"([^\"]*)\"$")
	public void user_need_to_search_for(String valueToBeSearched) throws Throwable {
	
		d.findElement(By.xpath(searchBox)).sendKeys(valueToBeSearched);
	
	  }

	@When("^click on first result returned by google$")
	public void click_on_first_result() throws Throwable {
		 WebDriverWait wait=new WebDriverWait(d, 10);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickOnFirstValue))).click();
		 
	}

	@Then("^logo should be displayed$")
	public void logo_should_be_displayed() throws Throwable {
	   boolean b= d.findElement(By.xpath(logo)).isDisplayed();
	   if(b)
	   {
		   System.out.println("JP Morgan logo is displayed successfully");
	   }
	   
	   else
	   {
		   System.out.println("JP Morgan logo is not displayed");
	   }
	   d.close();
	}
	
       
      

} 