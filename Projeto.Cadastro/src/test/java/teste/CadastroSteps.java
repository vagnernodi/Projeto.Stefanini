package teste;


import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class CadastroSteps {

      Metodos metodo = new Metodos();
	
	@Dado("que acesse o site de cadastro de usuario {string}")
	public void que_acesse_o_site_de_cadastro_de_usuario(String site) {
		metodo.abrirNavegador(site);
	}

	@Quando("preencher {string}, {string} e {string}")
	public void preencher (String nome, String email,String senha) {
		metodo.preencher(nome, email, senha);
	    
	}

	@Quando("clicar em cadastrar")
	public void clicar_em_cadastrar() {
		metodo.Cadastrar("clicar em Cadastrar");
	}

	@Entao("o sistema deve exibir mensagem de confirmacao de cadastro {string}")
	public void o_sistema_deve_exibir_mensagem_de_confirma_o_de_cadastro(String mensagem) {
		metodo.pausarTeste(500);
		metodo.barra();
		metodo.evidenciasFoto(mensagem, "Evidenciar Teste");
		metodo.pausarTeste(500);
		metodo.fecharBrowser();
	}

	@Quando("excluir um usuario")
	public void excluir_um_usuario(){
		metodo.preencherUsers("Vagner franca", "vagnernodi29@gmai.com", "12345678");
		metodo.Cadastrar("clicar em Cadastro");
		metodo.pausarTeste(500);	
		metodo.preencherUsers("vah franca", "vah@gmail.com", "87654321");
		metodo.Cadastrar("clicar em Cadastro");
		metodo.barra();
		metodo.pausarTeste(500);
		metodo.evidenciasFoto("2 usuarios incluidos na tabela com sucesso", "Evidenciar Teste");
		metodo.ExcluirUser("Excluir usuario");
		
		
	}

	@Entao("o sistema deve exibir mensagem de confirmacao de exclusão")
	public void o_sistema_deve_exibir_mensagem_de_confirmacao_de_exclusão() {
	  	metodo.evidenciasFoto("Usuario excluido com sucesso", "Evidenciar Teste");
		metodo.fecharBrowser();
	}
}


