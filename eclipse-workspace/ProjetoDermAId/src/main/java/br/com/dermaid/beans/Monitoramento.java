package br.com.dermaid.beans;

public class Monitoramento {
	
	private long cpf;
	private String perguntaMonitoramento;
	private int respostaMonitoramento;
	public long getCpf() {
		return cpf;
	}
	public String getPerguntaMonitoramento() {
		return perguntaMonitoramento;
	}
	public int getRespostaMonitoramento() {
		return respostaMonitoramento;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public void setPerguntaMonitoramento(String perguntaMonitoramento) {
		this.perguntaMonitoramento = perguntaMonitoramento;
	}
	public void setRespostaMonitoramento(int respostaMonitoramento) {
		this.respostaMonitoramento = respostaMonitoramento;
	}
	public Monitoramento() {
		super();
	}
	public Monitoramento(long cpf, String perguntaMonitoramento, int respostaMonitoramento) {
		super();
		this.cpf = cpf;
		this.perguntaMonitoramento = perguntaMonitoramento;
		this.respostaMonitoramento = respostaMonitoramento;
	}
	
	

}
