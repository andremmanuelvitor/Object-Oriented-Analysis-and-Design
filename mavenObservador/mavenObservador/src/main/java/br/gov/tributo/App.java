package br.gov.tributo;

public class App {

	public static void main(String[] args) {
		Salario s = new Salario();
		s.getImpostos().add(new Fgts());
		s.getImpostos().add(new Inss());
		s.getImpostos().add(new Irrf());
		s.setMensal(10000);
		for (Imposto i : s.getImpostos()) {
			System.out.println(i.getClass().getSimpleName() + "=" + i.getValor());
		}
	}

}
