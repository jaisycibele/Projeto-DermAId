package br.com.dermaid.excecoes;

public class Excecoes extends Exception{
	/**
	 * @autor
	 */
	
	public Excecoes() {
		super();
	}
	
	public Excecoes (Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Digite um numero valido");
		}else {
			System.out.println("Falha desconhecida");
			e.printStackTrace();
		}
	}
}
