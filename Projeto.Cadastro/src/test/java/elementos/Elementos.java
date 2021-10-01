package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nome = By.id("name");
	private By email = By.id("email");
	private By senha = By.id("password");
	private By cadastrar = By.id("register");
	private By excluir = By.id("removeUser1");

	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	}
	public By getCadastrar() {
		return cadastrar;
	}
	public By getExcluir() {
		return excluir;
	}
	

}
