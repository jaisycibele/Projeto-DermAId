package br.com.dermaid.beans;

public class Login {
	
	private String email;
	private String senha;
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Login() {
		super();
	}
	public Login(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	

}
