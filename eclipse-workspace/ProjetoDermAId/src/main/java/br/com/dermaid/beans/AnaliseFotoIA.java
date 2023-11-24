package br.com.dermaid.beans;

public class AnaliseFotoIA {
	
	private String resultado;
	private Long cpf;
	public String getResultado() {
		return resultado;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public AnaliseFotoIA() {
		super();
	}
	public AnaliseFotoIA(String resultado, Long cpf) {
		super();
		this.resultado = resultado;
		this.cpf = cpf;
	}
	
	

}
