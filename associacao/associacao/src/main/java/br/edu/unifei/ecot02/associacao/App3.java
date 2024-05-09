package br.edu.unifei.ecot02.associacao;

public class App3 {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		e.setRazao("UNIFEI");
		Funcionario f1 = new Funcionario();
		f1.setNome("Enzo");
		f1.setEmpregador(e);
		Funcionario f2 = new Funcionario();
		f2.setNome("Thatyana");	
		f2.setEmpregador(e);		
	}

}
