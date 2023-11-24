package br.com.dermaid.beans;

public class Agendamento {
	
	private String regiao;
	private String consultorio;
	private String data;
	
	public String getRegiao() {
		return regiao;
	}
	public String getConsultorio() {
		return consultorio;
	}
	public String getData() {
		return data;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Agendamento() {
		super();
	}
	public Agendamento(String regiao, String consultorio, String data) {
		super();
		this.regiao = regiao;
		this.consultorio = consultorio;
		this.data = data;
	}
	
	

}
