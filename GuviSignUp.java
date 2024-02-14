package Task20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuviSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using chrome Browser 
				WebDriver driver = new ChromeDriver();

				//Maximizing the window 
				driver.manage().window().maximize();
				
				//Navigating the URL
				driver.navigate().to("https://www.guvi.in/");
				
				//Using ImplicitlyWait for page to wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
				//Clicking SignUp button
				driver.findElement(By.xpath("(//a[text()='Sign up'])[1]")).click();
				
				//Input for SignUp Page
				driver.findElement(By.className("form-control")).sendKeys("Inba");
				driver.findElement(By.id("email")).sendKeys("inbavenu04@gmail.com");
				driver.findElement(By.cssSelector("input#password")).sendKeys("4398@Inba");
				driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("987654321");
				
				List<WebElement> signup = driver.findElements(By.tagName("a"));
		        for (WebElement signup1 : signup) 
		        {
					if (signup1.getAttribute("id").equals("signup-btn")) 
					{
						signup1.click();
					}
				}
			}
			
		

	}


