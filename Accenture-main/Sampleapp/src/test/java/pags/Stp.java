package pags;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lmt.Elementos;
import mtd.Metod;

public class Stp {

	Metod meto = new Metod();
	Elementos el = new Elementos();


	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {

		meto.abrirNavegador(url, "CHROME");

	}

	@When("^fazer os cadastro com os dados validos$")
	public void fazer_os_cadastro_com_os_dados_validos() throws Throwable {
		
		meto.selecionar(el.getFaço());
		meto.selecionar(el.getModelo());
		meto.escrever(el.getCilindro(), "6");
		meto.escrever(el.getDesempenho(), "100");
		meto.escrever(el.getDataFabricação(), "01/03/2021");
		meto.selecionar(el.getNumeroAssentos());
		meto.clicar(el.getDirecaoDireita());
		meto.selecionar(el.getAssento());
		meto.selecionar(el.getCombustivel());
		meto.escrever(el.getCarga(), "100");
		meto.escrever(el.getPeso(), "200");
		meto.escrever(el.getPreco(), " 30000");
		meto.escrever(el.getMatricula(), "123440");
		meto.escrever(el.getQuilometragem(), "10000");
		meto.clicar(el.getProximo());
		meto.escrever(el.getPrimeiroNome(), "Jonas");
		meto.escrever(el.getSobreNome(), "Felix");
		meto.escrever(el.getDataNascimento(), "07/20/1994");
		meto.clicar(el.getGenero());
		meto.escrever(el.getEndereço(), "Rua Boninas");
		meto.selecionar(el.getPaís());
		meto.escrever(el.getCodigoPostal(), "06123300");
		meto.escrever(el.getCidade(), "Osasco");
		meto.selecionar(el.getOcupacao());
		meto.esperaImplicita();
		meto.clicar(el.getHobb());
		meto.escrever(el.getLocal(), "https://www.accenture.com.br");
		meto.escrever(el.getFoto(), "postman");
		meto.clicar(el.getNext());
		meto.escrever(el.getDataInicio(), "06/08/2021");
		meto.selecionar(el.getSomaSeguro());
		meto.selecionar(el.getClassificacaoMerito());
		meto.selecionar(el.getSegurosDados());
		meto.clicar(el.getProdutosOpcionais());
		meto.selecionar(el.getCarroCortesia());
		meto.clicar(el.getNestSelect());
		meto.esperaImplicita();
		meto.clicar(el.getPrata());
		meto.clicar(el.getNextSend());
		meto.esperaImplicita();
		meto.escrever(el.getEmail(), "jfelix@gamil.com");
		meto.escrever(el.getTel(), "11987055786");
		meto.escrever(el.getNomeUsuario(), "felix");
		meto.escrever(el.getSenha(), "4321Jf");
		meto.escrever(el.getConfirmarSenha(), "4321Jf");
		meto.escrever(el.getComentarios(), "Boa sorte");
		meto.clicar(el.getBotao());
		
	
		
		
		
	
		

	}

	@Then("^valido a informacao$")
	public void valido_a_informacao() throws Throwable {
		
		meto.validarMensagem();
		meto.clicar(el.getOk());
		meto.fechar();

	}

}
