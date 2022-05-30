package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreinamentoAutomacaoPage extends BasePage {

	public TreinamentoAutomacaoPage(WebDriver driver) {
		super(driver);
		
	}		
		public ListarFuncionalidades clicarComecaAutomacao() {
			//clicar no bot�o Come�ar Automa��o atrav�s do xpath
			//a[@href="/treinamento/home"]
			driver.findElement(By.xpath("//a[@href=\"/treinamento/home\"]")).click();
			return new ListarFuncionalidades(driver);
			
		}
	}


