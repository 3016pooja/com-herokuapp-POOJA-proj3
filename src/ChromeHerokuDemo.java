import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHerokuDemo {
    public static void main(String[] args) {
        //1.set the browser
        String baseurl="http://the-internet.herokuapp.com/login ";
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2)open the URL
        driver.get(baseurl);

        //3)print the tilte of the page
        System.out.println("Print the title of the page"+driver.getTitle());

        //4.Print the current url
        System.out.println("Print the current Url"+driver.getCurrentUrl());
        //5.Print the page source
        System.out.println("Page source is"+driver.getPageSource());

        //6.Enter the email to email field
        WebElement emailidField=driver.findElement(By.id("username"));
        //writing the email id to the field
        emailidField.sendKeys("Pooja123@gmail.com");

        //7.Enter the password to password field
        WebElement passwordField=driver.findElement(By.name("password"));
        //writng the  password to passwrod field
        passwordField.sendKeys("poojarony12354");

        //  8.Close the browser
        //driver.quit();

    }
}
