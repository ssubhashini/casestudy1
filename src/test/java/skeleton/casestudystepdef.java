package skeleton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudystepdef {
	 ChromeDriver driver;
	@Given("open the application")
	public void open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver selenium\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}

	@Then("provide user {word}")
	public void username(String uname) {
	     
		driver.findElement(By.id("userName")).sendKeys(uname);
		
	}
	 
	@Then("provide user1 {word}")
	public void firstname(String fname)
	{
		driver.findElement(By.id("firstName")).sendKeys(fname);
	}
	
	@And("giving {word}")
	public void lastname(String lname)
	{
		driver.findElement(By.id("lastName")).sendKeys(lname);
	}
	
	@And("gave {word}")
	public void password(String pass)
	{
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@And("given {word}")
	public void cpassword(String cpass)
	{
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpass);
	}
     
	
	@And("mail as {word}")
	public void email(String email)
	{
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}
	
	@Then("give no as {word}")
	public void mobileno(String mobile)
	{
		driver.findElement(By.id("mobileNumber")).sendKeys(mobile);
	}
	
	@Then("dob as {word}")
	public void userinfo(String dob) {
		
		driver.findElement(By.id("dob")).sendKeys(dob);
		
	}

	@Then("type {word}")
	public void add(String address)
	{
		driver.findElement(By.id("address")).sendKeys(address);
		WebElement dropdown=driver.findElement(By.name("securityQuestion"));
		Select s=new Select(dropdown);
		s.selectByIndex(1);
	}
	
	@And("final {word}")
	public void security(String answer) {
		
	    driver.findElement(By.name("answer")).sendKeys(answer);
	    driver.findElement(By.name("Submit")).click();
	}

}
