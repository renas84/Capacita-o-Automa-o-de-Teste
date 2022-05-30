package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormUser extends BasePage {

	public FormUser(WebDriver driver) {
		super(driver);

	}

	public FormUsuarioCadastrado cadastrarNovoUsuario() {

		driver.findElement(By.id("user_name")).sendKeys("Renato");
		driver.findElement(By.id("user_lastname")).sendKeys("Santos");
		driver.findElement(By.id("user_email")).sendKeys("renato.santos@hotmail.com");
		driver.findElement(By.id("user_address")).sendKeys("Rua xv 321");
		driver.findElement(By.id("user_university")).sendKeys("Estacio de Sá");
		driver.findElement(By.id("user_profile")).sendKeys("Analista de Teste");
		driver.findElement(By.id("user_gender")).sendKeys("Masculino");
		driver.findElement(By.id("user_age")).sendKeys("31");

		// input[contains(@Value,"Criar")]
		driver.findElement(By.xpath("//input[contains(@Value,\"Criar\")]")).click();

		return new FormUsuarioCadastrado(driver);
	}

}
