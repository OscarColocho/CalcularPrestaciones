package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ScreenshotPage {
    public void TakeScreenshot(int option, WebDriver driver){
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String timestamp = dayFormat.format(new Date());
        String fileName = timestamp + ".png";

        File scFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        if(option == 1 )
        {
            String scDir = "src/test/SCMensual/";
            String scPath = scDir + fileName;
            try{
                FileUtils.copyFile(scFile, new File(scPath));
                System.out.println("SC tomado y guardado");
            }
            catch (Exception  ex){
                ex.printStackTrace();
            }
        }
        else if (option == 2)
        {
            String scDir = "src/test/SCQuincenal/";
            String scPath = scDir + fileName;
            try{
                FileUtils.copyFile(scFile, new File(scPath));
                System.out.println("SC tomado y guardado");
            }
            catch (Exception  ex){
                ex.printStackTrace();
            }
        }
        else
        {
            String scDir = "src/test/SCSemanal/";
            String scPath = scDir + fileName;
            try{
                FileUtils.copyFile(scFile, new File(scPath));
                System.out.println("SC tomado y guardado");
            }
            catch (Exception  ex){
                ex.printStackTrace();
            }
        }


        //String scDir = "src/test/SCMensual/";
        //String scPath = scDir + fileName;


    }
}
