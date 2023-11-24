package br.com.dermaid.beans;

public class Perguntas {
	private Long cpf;
	private String textoPergunta;
	private String resposta;
	
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public String getTextoPergunta() {
		return textoPergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setTextoPergunta(String textoPergunta) {
		this.textoPergunta = textoPergunta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public Perguntas() {
		super();
	}
	public Perguntas(Long cpf, String textoPergunta, String resposta) {
		super();
		this.cpf = cpf;
		this.textoPergunta = textoPergunta;
		this.resposta = resposta;
	}

	

}
