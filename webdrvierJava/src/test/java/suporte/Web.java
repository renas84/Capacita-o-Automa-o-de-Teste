package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SempreIT\\drivers\\chromedriver.exe");
        //Abrindo Navegador
		WebDriver navegador = new ChromeDriver();

		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		navegador.manage().window().maximize();
		
        //Navegando na Pagina
		navegador.get("http://www.juliodelima.com.br/taskit");
		
		return navegador;
	}

}
