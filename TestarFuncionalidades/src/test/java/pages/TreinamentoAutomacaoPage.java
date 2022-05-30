package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TreinamentoAutomacaoPage extends BasePage {

	public TreinamentoAutomacaoPage(WebDriver driver) {
		super(driver);
		
	}		
		public ListarFuncionalidades clicarComecaAutomacao() {
			//clicar no botão Começar Automação através do xpath
			//a[@href="/treinamento/home"]
			driver.findElement(By.xpath("//a[@href=\"/treinamento/home\"]")).click();
			return new ListarFuncionalidades(driver);
			
		}
	}


