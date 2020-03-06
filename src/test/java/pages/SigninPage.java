package pages;

import org.openqa.selenium.By;

import suporte.BasePage;

public class SigninPage extends BasePage {
	
	public void setEmail(String email) {
		escreverCampo("email_create", email);
	}
	
	public void clicarBotaoCriarConta() {
		clicarBotao(By.id("SubmitCreate"));
	}
	
	public void setSexoMasculino() {
		clicarBotao(By.id("id_gender1"));
	}
	
	public void setPrimeiroNome(String nome) {
		escreverCampo(By.id("customer_firstname"), nome);
	}
	
	public void setUltimoNome(String nome) {
		escreverCampo(By.id("customer_lastname"), nome);
	}
	
	public void setSenha(String senha) {
		escreverCampo(By.id("passwd"), senha);
	}
	
	public void setDiaAniversario(String dia) {
		selecionarComboValue("days", dia);
	}
	
	public void setMesAniversario(String mes) {
		selecionarComboVisible("months", mes);
	}
	
	public void setAnoAniversario(String ano) {
		selecionarComboValue("years", ano);
	}
	
	public void setPrimeiroNomeEndereco(String nome) {
		escreverCampo(By.id("firstname"), nome);
	}
	
	public void setUltimoNomeEndereco(String nome) {
		escreverCampo(By.id("lastname"), nome);
	}
	
	public void setEndereco(String endereco) {
		escreverCampo(By.id("address1"), endereco);
	}
	
	public void setComplemento(String complemento) {
		escreverCampo(By.id("address2"), complemento);
	}
	
	public void setCidade(String cidade) {
		escreverCampo(By.id("city"), cidade);
	}
	
	public void setEstado(String estado) {
		selecionarComboVisible("id_state", estado);
	}
	
	public void setCep(String cep) {
		escreverCampo(By.id("postcode"), cep);
	}
	
	public void setPais(String pais) {
		selecionarComboVisible("id_country", pais);
	}
	
	public void setCelular(String celular) {
		escreverCampo(By.id("phone_mobile"), celular);
	}
	
	public void setEmailAlternativo(String email) {
		escreverCampo("alias", email);
	}
	
	public void clicarBotaoRegistrar() {
		clicarBotao(By.id("submitAccount"));
	}
	
	public String validarEndereco() {
		return obterValorCampo(By.xpath("//ul [@id='address_delivery']"));
	}
	
	
	public void cadastrarUsuario(String nome, String ultimo_nome, String senha, String dia,
						  String mes, String ano, String primeiro_nome_endereco, String ultimo_nome_endereco, 
						  String endereco, String complemento, String cidade, String estado, String cep,
						  String pais, String celular, String email_alternativo) {
		setSexoMasculino();
		setPrimeiroNome(nome);
		setUltimoNome(ultimo_nome);
		setSenha(senha);
		setDiaAniversario(dia);
		setMesAniversario(mes);
		setAnoAniversario(ano);
		setPrimeiroNomeEndereco(primeiro_nome_endereco);
		setUltimoNomeEndereco(ultimo_nome_endereco);
		setEndereco(endereco);
		setComplemento(complemento);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setPais(pais);
		setCelular(celular);
		setEmailAlternativo(email_alternativo);
		clicarBotaoRegistrar();
	}

}
