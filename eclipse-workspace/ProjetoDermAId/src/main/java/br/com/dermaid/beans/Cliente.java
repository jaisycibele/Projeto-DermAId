package br.com.dermaid.beans;

public class Cliente {
	
	private long cpf;
	private String email;
	private String nome;
	private String senha;
	private String idade;
	private String genero;
	public long getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public String getIdade() {
		return idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Cliente() {
		super();
	}
	public Cliente(long cpf, String email, String nome, String senha, String idade, String genero) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.idade = idade;
		this.genero = genero;
	}
	
	
	

}
