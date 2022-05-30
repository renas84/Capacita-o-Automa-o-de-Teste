package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListarFuncionalidades extends BasePage {

	public ListarFuncionalidades(WebDriver driver) {
		super(driver);

	}

	public ListarFuncionalidades opcaoExpandirFormUser() {
		// clicar na opcao formulario atrav�s do xpath
		// a[text()="Formul�rio"]
		driver.findElement(By.xpath("//a[text()=\"Formul�rio\"]")).click();
		return this;
	}

	public FormUser opcaoCriarUsuario() {
		// clicar na op��o criar usuarios
		// a[@href="/users/new"]
		driver.findElement(By.xpath("//a[@href=\"/users/new\"]")).click();
		return new FormUser(driver);
	}

}
