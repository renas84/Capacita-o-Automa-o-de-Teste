package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.TreinamentoAutomacaoPage;
import suporte.PaginaInicial;

public class AutomacaoFuncionalidadesTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = PaginaInicial.acessaPaginaInicial();
	}

	@Test
	public void testFuncionalidadesAutomacao() {
		new TreinamentoAutomacaoPage(driver)
		.clicarComecaAutomacao()
		.opcaoExpandirFormUser()
		.opcaoCriarUsuario()
		.cadastrarNovoUsuario()
		.validarCadastro()
		.ListarUsuariosCadastrado();

	}

	@After
	public void tearDown() {
		 driver.quit();
	}
}
