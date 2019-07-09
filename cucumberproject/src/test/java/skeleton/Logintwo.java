package skeleton;

import java.sql.Driver;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;

public class Logintwo {
WebDriver driver;
	@Before
	public void init()
	{
		System.out.println("in before scenario");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, LoginPage.class);
	}
	@After
	public void destroy() 
	{
		System.out.println("in after scenario");
	}
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) 
	{
	    // Write code here that turns the phrase above into concrete actions
		String chromePath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium Workspace\\JAR\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromePath);
		
		driver.get(string);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
		//Assert.assertTrue(driver.findElement(By.linkText("Log in")).isDisplayed());
		
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters {word} as username")
	public void user_enters_as_username(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("Email")).sendKeys(string);
		LoginPage.email.sendKeys(string);
	    //throw new cucumber.api.PendingException();
	}

	@When("user enters {word} as password")
	public void user_enters_as_password(String string)
	{
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.id("Password")).sendKeys(string);
	    //throw new cucumber.api.PendingException();
		LoginPage.password.sendKeys(string);
	}

	@Then("user is in webshop as {word}")
	public void user_is_in_webshop(String type)
	{
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.cssSelector("input[value='Log in']")).click();
		LoginPage.signin.click();
		Assert.assertTrue(LoginPage.signout.isDisplayed());
		//Assert.assertTrue(driver.getCurrentUrl().contains("logout"));
	    //throw new cucumber.api.PendingException();
	}
	/*@Given("Admin of the test me app enters")
	public void admin_of_the_test_me_app_enters(io.cucumber.datatable.DataTable dataTable) 
	{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		List<List<String>> list=dataTable.asLists();
		for(List<String> strings:list)
		{
			for(String s:strings)
			{
				System.out.print(s+"\t");
			}
			System.out.println("");
		}
	}*/


}
