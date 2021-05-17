package lmt;

import org.openqa.selenium.By;

public class Elementos {

	private By faço = By.id("make");
	private By modelo = By.id("model");
	private By cilindro = By.id("cylindercapacity");
	private By desempenho = By.id("engineperformance");
	private By dataFabricação = By.id("dateofmanufacture");
	private By numeroAssentos = By.id("numberofseats");
	private By direcaoDireita = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	private By assento = By.id("numberofseatsmotorcycle");
	private By combustivel = By.id("fuel");
	private By carga = By.id("payload");
	private By peso = By.id("totalweight");
	private By preco = By.id("listprice");
	private By matricula = By.id("licenseplatenumber");
	private By quilometragem = By.id("annualmileage");
	private By proximo = By.id("nextenterinsurantdata");
	private By primeiroNome = By.id("firstname");
	private By sobreNome = By.id("lastname");
	private By dataNascimento = By.id("birthdate");
	private By genero = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	private By endereço = By.id("streetaddress");
	private By país = By.id("country");
	private By codigoPostal = By.id("zipcode");
	private By cidade = By.id("city");
	private By ocupacao = By.id("occupation");
	private By hobb = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	private By local = By.id("website");
	private By foto = By.id("picture");
	private By dataInicio = By.id("startdate");
	private By somaSeguro = By.id("insurancesum");
	private By classificacaoMerito = By.id("meritrating");
	private By segurosDados = By.id("damageinsurance");
	private By produtosOpcionais = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By carroCortesia = By.id("courtesycar");
	private By prata = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(1) > span");
	private By email = By.id("email");
	private By tel = By.id("phone");
	private By nomeUsuario = By.id("username");
	private By senha = By.id("password");
	private By confirmarSenha = By.id("confirmpassword");
	private By comentarios = By.id("Comments");
	private By botao = By.id("sendemail");
	private By next = By.id("nextenterproductdata");
	private By nestSelect = By.id("nextselectpriceoption");
	private By nextSend = By.id("nextsendquote");
	private By ok = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
	
	
	
	
	
	
	
	
	public By getOk() {
		return ok;
	}
	public By getNextSend() {
		return nextSend;
	}
	public By getNestSelect() {
		return nestSelect;
	}
	public By getNext() {
		return next;
	}
	public By getFaço() {
		return faço;
	}
	public By getModelo() {
		return modelo;
	}
	public By getCilindro() {
		return cilindro;
	}
	public By getDesempenho() {
		return desempenho;
	}
	public By getDataFabricação() {
		return dataFabricação;
	}
	public By getNumeroAssentos() {
		return numeroAssentos;
	}
	public By getDirecaoDireita() {
		return direcaoDireita;
	}
	public By getAssento() {
		return assento;
	}
	public By getCombustivel() {
		return combustivel;
	}
	public By getCarga() {
		return carga;
	}
	public By getPeso() {
		return peso;
	}
	public By getPreco() {
		return preco;
	}
	public By getMatricula() {
		return matricula;
	}
	public By getQuilometragem() {
		return quilometragem;
	}
	public By getProximo() {
		return proximo;
	}
	public By getPrimeiroNome() {
		return primeiroNome;
	}
	public By getSobreNome() {
		return sobreNome;
	}
	public By getDataNascimento() {
		return dataNascimento;
	}
	public By getGenero() {
		return genero;
	}
	public By getEndereço() {
		return endereço;
	}
	public By getPaís() {
		return país;
	}
	public By getCodigoPostal() {
		return codigoPostal;
	}
	public By getCidade() {
		return cidade;
	}
	public By getOcupacao() {
		return ocupacao;
	}
	
	
	public By getHobb() {
		return hobb;
	}
	public By getLocal() {
		return local;
	}
	public By getFoto() {
		return foto;
	}
	public By getDataInicio() {
		return dataInicio;
	}
	public By getSomaSeguro() {
		return somaSeguro;
	}
	public By getClassificacaoMerito() {
		return classificacaoMerito;
	}
	public By getSegurosDados() {
		return segurosDados;
	}
	public By getProdutosOpcionais() {
		return produtosOpcionais;
	}
	public By getCarroCortesia() {
		return carroCortesia;
	}
	public By getPrata() {
		return prata;
	}
	public By getEmail() {
		return email;
	}
	public By getTel() {
		return tel;
	}
	public By getNomeUsuario() {
		return nomeUsuario;
	}
	public By getSenha() {
		return senha;
	}
	public By getConfirmarSenha() {
		return confirmarSenha;
	}
	public By getComentarios() {
		return comentarios;
	}
	public By getBotao() {
		return botao;
	}
	
	
	
	
	
}
