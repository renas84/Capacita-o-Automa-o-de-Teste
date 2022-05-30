package suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaInicial {
	public static WebDriver acessaPaginaInicial() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SempreIT\\drivers\\chromedriver.exe");
		// Abrir navegador
		WebDriver driver = new ChromeDriver();
		// maximizar tela
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// acessar URL
		driver.get("https://automacaocombatista.herokuapp.com");

		return driver;

	}

}
