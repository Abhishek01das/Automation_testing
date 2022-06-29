import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OrangeHrm {
    public static void main(String[] args) throws InterruptedException{
        //open the chrome browser
        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //open the url
        driver.navigate().to("https://opensource-demo.orangehrmlive.com");
        //maximize the window
        driver.manage().window().maximize();

        //enter username and password
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        //clear username and password
        Thread.sleep(5000);
        driver.findElement(By.id("txtUsername")).clear();
        driver.findElement(By.id("txtPassword")).clear();

        //submit login button
        driver.findElement(By.id("btnLogin")).submit();

        //get text of forgot password linktext
        String Gettext= driver.findElement(By.linkText("Forgot your password?")).getText();
        System.out.println("the text is: "+Gettext);

        //get location of username element
        WebElement element= driver.findElement(By.id("txtUsername"));
        Point point =element.getLocation();
        System.out.println("x co-ordinates: "+point.x);
        System.out.println("y co-ordinates: "+point.y);

        //getsize of username element
        WebElement element1=driver.findElement(By.id("txtUsername"));
        Dimension dim= element1.getSize();
        System.out.println("Height is: "+dim.height);
        System.out.println("Width is: "+dim.width);

        //getTagname of username element
        String gettagname =driver.findElement(By.id("txtUsername")).getTagName();
        System.out.println("tagname is: "+gettagname);

        //to print the no of links on the page
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //to check if login button is displayed or not
        Boolean bool1=driver.findElement(By.xpath("//input[@id='btnLogin']")).isDisplayed();//T
        System.out.println(bool1);

        //to check if login button is enabled or not
        Boolean bool2= driver.findElement(By.xpath("//input[@id='btnLogin']")).isEnabled();//T
        System.out.println(bool2);

        //to check if login button is selected or not(its for radio button)
        Boolean bool3= driver.findElement(By.xpath("//input[@id='btnLogin']")).isSelected();//F
        System.out.println(bool3);

        //quit the browser
        Thread.sleep(5000);
        driver.quit();





    }
}
