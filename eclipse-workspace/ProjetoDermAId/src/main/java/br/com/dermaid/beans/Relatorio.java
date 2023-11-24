package br.com.dermaid.beans;

public class Relatorio {

	private Perguntas perguntas;
	private Agendamento agendamento;
	public Perguntas getPerguntas() {
		return perguntas;
	}
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setPerguntas(Perguntas perguntas) {
		this.perguntas = perguntas;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	public Relatorio() {
		super();
	}
	public Relatorio(Perguntas perguntas, Agendamento agendamento) {
		super();
		this.perguntas = perguntas;
		this.agendamento = agendamento;
	}
	
	
}
