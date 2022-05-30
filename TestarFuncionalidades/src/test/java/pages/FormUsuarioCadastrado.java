package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormUsuarioCadastrado extends BasePage {

	public FormUsuarioCadastrado(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public FormUsuarioCadastrado validarCadastro() {
		// p[text()="Usuário Criado com sucesso"]
		WebElement mensagem = driver.findElement(By.xpath("//p[text()=\"Usuário Criado com sucesso\"]"));
		Assert.assertEquals(mensagem.getText(), "Usuário Criado com sucesso");

		return new FormUsuarioCadastrado(driver);
	}
	
	public FormUsuarioCadastrado ListarUsuariosCadastrado() {
		//clicar no botão voltar após efetuar a inclusão de um novo usuário para listar 
		//os usuarios cadastrados //a[@href="/users"]
		driver.findElement(By.xpath("//a[@href=\"/users\"]")).click();
		return this;
	}

}
