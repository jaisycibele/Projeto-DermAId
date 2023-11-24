package br.com.dermaid.beans;

public class EsqueceuSenha {

	private Long cpf;
	private String email;
	private String novaSenha;
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email; 
	}
	public String getNovaSenha() {
		return novaSenha;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}
	public EsqueceuSenha() {
		super();
	}
	public EsqueceuSenha(Long cpf, String email, String novaSenha) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.novaSenha = novaSenha;
	}
	
	
}
