package tests;

//import static-> fazendo importa��o de todos os metodos static que pertence a classe Assert
import static org.junit.Assert.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import suporte.Generator;
import suporte.Screenshot;

//utilizando as bibliotecas do easytest atrav�s das anota��es(@RunWith, @DataLoader)
@RunWith(DataDrivenTestRunner.class)
@DataLoader(filePaths = "InformacoesUsuarioTestData.csv")
public class InformacoesUsuariosTest {
	private WebDriver navegador;

	// @Before-> sempre � executado antes de iniciar os metodos de teste declarado
	// com @Test
	// @After-> sempre � executado ap�s(depois) a execu��o de todos os metodos
	// declarados com @Test
	// 
	
	@Rule
	public TestName test = new TestName();

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SempreIT\\drivers\\chromedriver.exe");

		navegador = new ChromeDriver();

		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		navegador.manage().window().maximize();

		navegador.get("http://www.juliodelima.com.br/taskit");
		
		navegador.findElement(By.linkText("Sign in")).click();

		// identificando formulario de login
		WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

		// digitar no campo name "login" que est� dentro do formul�rio de id "signinbox"
		// o texto "natosan"
		formularioSignInBox.findElement(By.name("login")).sendKeys("natosan");

		// digitar no campo name "password" que est� dentro do formul�rio de id
		// "signinbox" o texto "natosan84
		formularioSignInBox.findElement(By.name("password")).sendKeys("natosan84");

		// clicar no link com o texto "SIGN IN
		navegador.findElement(By.linkText("SIGN IN")).click();

		// clicar em um link que possui a class "me"
		navegador.findElement(By.className("me")).click();

		// Clicar em um texto que possui o texto "MORE DATA ABOUT YOU"
		navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

	}

	// @Test -> anota��o para indicar que o metodo criado � voltado para teste
	// por padr�o do junit todo metodo deve ser public void e iniciar seu nome com
	// test
	//@Test se estiver comentado a anota��o isso fara que o junit n�o execute este metodo
	//@ignore -> ignora o metodo a ser executado
	
	//@Ignore
	//@Test
	//public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
		// Maven-> gest�o de dependencias
		// pow-> arquivo xml para definir quais as dependencias a serem baixadas para
		// utiliza��o do projeto
		// Assert->classe do junit que cont�m inumeros metodos staticos
		// Assert.assertEquals(1, 5);
		// assertEquals(1, 5);

		// fazendo apontamento onde o chromedriver est� salvo
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\SempreIT\\drivers\\chromedriver.exe");

		// Abrindo Navegador
		// WebDriver navegador = new ChromeDriver();
		// definindo um timeout para interagir com os elementos
		// navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// maximizando janela do navegador
		// navegador.manage().window().maximize();

		// Navegando para pagina do Taskit!
		// navegador.get("http://www.juliodelima.com.br/taskit");

		/*
		 * identificando elementos na pagina 
		 * 1 - clicar no link que possui o texto "Sign in"
		 * 2 - clicar com name "login" que est� dentro do formulario de id "signinbox"
		 * 3 - digitar no campo name "login" que est� dentro do formul�rio
		 * de id "signinbox" o texto "natosan"
		 * 4 - clicar com name "password" que est� dentro do formulario de id "signinbox"
		 * 5 - digitar no campo name "password" que est� dentro do formul�rio
		 * de id "signinbox" o texto "natosan84"
		 * 6 - clicar no link com o texto "SIGN IN"
		 * 7 - validar dentro do elemento com class "me" est� o texto "Hi, Renato"
		 * 8 - fechar o navegador
		 */

		// procurar elemento dentro de um determinado escopo e interagir com ele atrav�s
		// do metodo click
		//navegador.findElement(By.linkText("Sign in")).click();

		// identificando formulario de login
		//WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

		// digitar no campo name "login" que est� dentro do formul�rio de id "signinbox"
		// o texto "natosan"
		//formularioSignInBox.findElement(By.name("login")).sendKeys("natosan");

		// digitar no campo name "password" que est� dentro do formul�rio de id
		// "signinbox" o texto "natosan84
		//formularioSignInBox.findElement(By.name("password")).sendKeys("natosan84");

		// clicar no link com o texto "SIGN IN
		//navegador.findElement(By.linkText("SIGN IN")).click();

		// clicar em um link que possui a class "me"
		//navegador.findElement(By.className("me")).click();

		// Clicar em um texto que possui o texto "MORE DATA ABOUT YOU"
		//navegador.findElement(By.linkText("MORE DATA ABOUT YOU")).click();

		// Clicar no bot�o atrav�s do seu xpath //button[@data-target="addmoredata"]
		//navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

		// Identificar a popup onde est� o formul�rio de id addmoredata
		//WebElement popupAddMoredata = navegador.findElement(By.id("addmoredata"));

		// Na combo de name "type" escolher a op��o "Phone"
		//WebElement campoType = popupAddMoredata.findElement(By.name("type"));
		//new Select(campoType).selectByVisibleText("Phone");

		// No campo de name "contact" digitar "+551199999999"
		//popupAddMoredata.findElement(By.name("contact")).sendKeys("551199999999");

		// Clicar No link de text "SAVE" que est� na popup
		//popupAddMoredata.findElement(By.linkText("SAVE")).click();

		// Na mensagem de id "toast-container" validar que o texto � o "Your contact has
		// been added!"
		//WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
		//String mensagem = mensagemPop.getText();

		//assertEquals("Your contact has been added!", mensagem);
		
		

		// validar dentro do elemento com class "me" est� o texto "Hi, Renato"
		// WebElement me = navegador.findElement(By.className("me"));
		// pegando a informa��o que est� dentro da tag
		// String textoNoElementoMe = me.getText();

		// assertEquals("Hi, Renato", textoNoElementoMe);

		// fechar o navegador(quit fecha todas as abas aberta enquanto o close s� a aba
		// que est� ativa no momento)
		// navegador.quit();

	//}
	
	@Test
	public void testAdicionarUmaInformacaoAdicionalDoUsuario(@Param(name="tipo")String tipo,
			@Param(name="contato")String contato, @Param(name="mensagem")String msg) {
		
		// Clicar no bot�o atrav�s do seu xpath //button[@data-target="addmoredata"]
				navegador.findElement(By.xpath("//button[@data-target=\"addmoredata\"]")).click();

				// Identificar a popup onde est� o formul�rio de id addmoredata
				WebElement popupAddMoredata = navegador.findElement(By.id("addmoredata"));

				// Na combo de name "type" escolher a op��o "Phone"
				WebElement campoType = popupAddMoredata.findElement(By.name("type"));
				new Select(campoType).selectByVisibleText(tipo);

				// No campo de name "contact" digitar "+551199999999"
				popupAddMoredata.findElement(By.name("contact")).sendKeys(contato);

				// Clicar No link de text "SAVE" que est� na popup
				popupAddMoredata.findElement(By.linkText("SAVE")).click();

				// Na mensagem de id "toast-container" validar que o texto � o "Your contact has
				// been added!"
				WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
				String mensagem = mensagemPop.getText();

				assertEquals(msg, mensagem);
		
	}
	
	
    @Ignore
	@Test
	public void removerUmContatoDeUmUsuario() {
		//clicar no elemento pelo seu xpath //span[text()="551198761235"]/following-sibling::a
		navegador.findElement(By.xpath("//span[text()=\"551198761235\"]/following-sibling::a")).click();
		
		
		//Confirmar a janela javascript 
		navegador.switchTo().alert().accept();
		
		//Validar que a mensagem apresentada foi "Rest in peace, dear phone!"
		
		WebElement mensagemPop = navegador.findElement(By.id("toast-container"));
		String mensagem = mensagemPop.getText();
		
		assertEquals("Rest in peace, dear phone!", mensagem);
		
		String screenshotArquivo = ("C:\\Users\\SempreIT\\Evidencias\\taskit\\"
		+ Generator.dataHoraParaArquivo() + test.getMethodName() + ".png");
		Screenshot.tirar(navegador, screenshotArquivo);
		
		//Aguarda at� 10 segundos para que a janela desapare�a
	    WebDriverWait aguardar = new WebDriverWait(navegador, Duration.ofSeconds(10));
		aguardar.until(ExpectedConditions.stalenessOf(mensagemPop));
		
				
		//Clicar no link com texto fazer "Logout"
		navegador.findElement(By.linkText("Logout")).click();
		
	}
	
	@After
	public void tearDown() {
		// navegador.quit();

	}

}
