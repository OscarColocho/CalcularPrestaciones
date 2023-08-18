import Pages.Calcular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PrestacionQuincenal {
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("web-driver.chrome.driver","C:\\Users\\OscarPC\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jmbauditores.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void prestacion(){

        //Digite el monto salarial aqui siempre en formato string
        String montoQuincenal = "1200";
        Calcular quincenal = new Calcular();
        quincenal.prestacionQuincenal(montoQuincenal ,driver);
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
