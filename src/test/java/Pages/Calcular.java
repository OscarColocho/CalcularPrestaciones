package Pages;

import Screenshot.ScreenshotPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;
public class Calcular {

    public void prestacionMensual(String monMensual, WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/calcular-prestaciones']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='salario']"))).sendKeys(monMensual);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='calcular']"))).click();
        try{
            Thread.sleep(3000);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        JavascriptExecutor scrollDown =(JavascriptExecutor) driver;
        WebElement scrollToresults = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Resultados de Calculos')]")));
        scrollDown.executeScript("arguments[0].scrollIntoView();", scrollToresults);

        try{
            Thread.sleep(5000);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        ScreenshotPage takeSC = new ScreenshotPage();
        takeSC.TakeScreenshot(1, driver);
    }

    public void prestacionQuincenal(String monQuincenal, WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/calcular-prestaciones']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='salario']"))).sendKeys(monQuincenal);

        WebElement dropdownlist = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"tipo\"]")));
        Select dropDownOption = new Select(dropdownlist);
        dropDownOption.selectByVisibleText("Quincenal");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='calcular']"))).click();

        try{
            Thread.sleep(3000);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        JavascriptExecutor scrollDown =(JavascriptExecutor) driver;
        WebElement scrollToresults = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Resultados de Calculos')]")));
        scrollDown.executeScript("arguments[0].scrollIntoView();", scrollToresults);

        try{
            Thread.sleep(5000);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        ScreenshotPage takeSC = new ScreenshotPage();
        takeSC.TakeScreenshot(2, driver);


    }

    public void prestacionSemanal(String monSemanal, WebDriver driver){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href ='/calcular-prestaciones']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='salario']"))).sendKeys(monSemanal);

        WebElement dropdownlist = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"tipo\"]")));
        Select dropDownOption = new Select(dropdownlist);
        dropDownOption.selectByVisibleText("Semanal");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='calcular']"))).click();

        try{
            Thread.sleep(3000);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        JavascriptExecutor scrollDown =(JavascriptExecutor) driver;
        WebElement scrollToresults = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Resultados de Calculos')]")));
        scrollDown.executeScript("arguments[0].scrollIntoView();", scrollToresults);

        try{
            Thread.sleep(5000);
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        ScreenshotPage takeSC = new ScreenshotPage();
        takeSC.TakeScreenshot(3, driver);


    }
}
