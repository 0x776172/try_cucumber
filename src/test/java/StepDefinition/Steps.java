package StepDefinition;

import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
  WebDriver driver = null;

  @Given("Open the Chrome and launch app the application")
  public void open_browser_and_launch_app() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

    if (driver == null) {
      driver = new ChromeDriver();
    }
    // driver.manage().window().maximize();
    driver.get("https://demo.guru99.com/v4");
  }

  @When("^Enter the (.*) and (.*)$")
  public void test_username_and_pass(String uname, String pw) throws Throwable {
    driver.findElement(By.name("uid")).sendKeys(uname);
    driver.findElement(By.name("password")).sendKeys(pw);
  }

  @Then("Reset the credential")
  public void reset_credential() throws Throwable {
    driver.findElement(By.name("btnReset")).click();
  }

  @After
  public void closeBrowser() throws Throwable {
    driver.manage().deleteAllCookies();
  }
}