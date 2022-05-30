package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//como a classe pai BasePage possui um atributo protected quando a classe filha
//Mepage extende a classe pai é herdada esse atributo ou metodo
public class Mepage extends BasePage{

	public Mepage(WebDriver navegador) {
		super(navegador);
		
	}
	
	public Mepage clicarAbaMoreDataAboutYou() {
		navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();
		
		return this;
		
	}
	
	public AddContactPage clicarBotaoAddMoreDataAboutYou(){
		navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();
		
		return new AddContactPage(navegador);
		
	}
	
	

}
