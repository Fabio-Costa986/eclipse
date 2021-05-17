package mtd;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Metod {

	WebDriver driver;

	public void abrirNavegador(String url, String Navegador) {

		
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();

	}

	public void fechar() {

		driver.quit();
	}

	public void escrever(By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
		
	}

	public void selecionar(By elemento) {
		
		WebElement element = driver.findElement(elemento);
		Select selecao = new Select(element);
		selecao.selectByIndex(2);
		
		
	}
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}
	
	public void esperaImplicita() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void validarMensagem() {
		
		String mensagem = "Sending e-mail success!";
		String mensagemValidar = driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2")).getText();
		Assert.assertEquals(mensagem, mensagemValidar);
		
		
	}
}
