package suporte;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void tirar(WebDriver navegador, String arquivo) {
		File screenhot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenhot, new File(arquivo));	
		} catch(Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta: " + e.getMessage());
		}
		
	}

}
