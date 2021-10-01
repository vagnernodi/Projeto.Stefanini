package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import elementos.Elementos;

public class Metodos extends Elementos{

WebDriver driver;
public void abrirNavegador(String site) {

	// Configura��o do browser que ser� utilizado;
	// Na primeiro key incluimos o nome do driver;
	// Na segunda key incluimos o caminho do driver (neste caso ainda estou
	// utilizando o do meu hd).
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sempre IT\\Downloads\\Driver93\\chromedriver.exe");

	// abrir navegador atrav�s do objeto driver.
	driver = new ChromeDriver();

	// acessar o site desejado.
	driver.get(site);
	// maximizar a tela.
	driver.manage().window().maximize();

}

public void preencher(String nome,String email,String senha) {
	driver.findElement(getNome()).sendKeys(nome);
	driver.findElement(getEmail()).sendKeys(email);
	driver.findElement(getSenha()).sendKeys(senha);
}

public void preencherUsers(String nome,String email,String senha) {
	driver.findElement(getNome()).sendKeys(nome);
	driver.findElement(getEmail()).sendKeys(email);
	driver.findElement(getSenha()).sendKeys(senha);
}
public void Cadastrar(String descricao) {
	try {
		driver.findElement(getCadastrar()).click();
	} catch (Exception e) {
		System.out.println("#####_erro_#####-na linha " + e);
	}

}
public void evidenciasFoto(String foto, String descricao) {
	try {
		TakesScreenshot fotevd = ((TakesScreenshot) driver);
		File scrfile = fotevd.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./src/evidencias/" + foto + ".png");
		FileUtils.copyFile(scrfile, destfile);
	} catch (IOException e) {
		System.out.println("#####_erro_#####-na linha " + e.getCause());
	}

}
public void fecharBrowser() {
	driver.quit();

}
public void barra() {
	try {
	WebElement element = driver.findElement(By.id("removeUser1"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	} catch (Exception e) {
	}
}	
public void pausarTeste(int tempo) {
	try {
		Thread.sleep(tempo);
	} catch (Exception e) {
		System.out.println("#####_erro_#####-na linha " + e);
	}
}	
public void ExcluirUser(String descricao) {
	try {
		driver.findElement(getExcluir()).click();
	} catch (Exception e) {
		System.out.println("#####_erro_#####-ao clicar em excluir " + e);
	}

}

	
}

