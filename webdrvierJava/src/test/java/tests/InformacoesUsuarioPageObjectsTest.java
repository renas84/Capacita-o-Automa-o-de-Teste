package tests;

import static org.junit.Assert.assertEquals;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static junit.framework.Assert.*;
import pages.LoginPage;
import suporte.Web;

@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioPageObjectsTest.csv")
public class InformacoesUsuarioPageObjectsTest {
	private WebDriver navegador;

	@Before
	public void setUp() {
		navegador = Web.createChrome();
	}

	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario( 
	  @Param(name="login")String login,
	  @Param(name="senha")String senha,
	  @Param(name="tipo")String tipo,
	  @Param(name="contato")String contato,
	  @Param(name="mensagem")String msgesperada) {
			
		
		String textoToast = new LoginPage(navegador)
		.clickSignIn()
		.typeLogin(login)
		.typePassword(senha)
		.clicarSignIn()
		.clicarMe()
		.clicarAbaMoreDataAboutYou()
		.clicarBotaoAddMoreDataAboutYou()
		.adicionarContato(tipo,contato)
		.capturarTextoToast();
		
		 assertEquals(msgesperada, textoToast);
	}
	

	//@Test
	// public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
	// @Param(name="login")String login,
	// @Param(name="senha")String senha,
	// @Param(name="tipo")String tipo,
	// @Param(name="contato")String contato,
	// @Param(name="mensagem")String msgesperada) {

	// String textoToast = new LoginPage(navegador)
	// .clickSignIn()
	// .typeLogin("natosan")
	// .typePassword("natosan84")
	// .clicarSignIn()
	// .clicarMe()
	// .clicarAbaMoreDataAboutYou()
	// .clicarBotaoAddMoreDataAboutYou()
	// .adicionarContato("Phone","+551198543222")
	// .capturarTextoToast();

	// assertEquals("Your contact has been added!", textoToast);

	// }

	@After
	public void tearDown() {
		// navegador.quit();
	}

}
