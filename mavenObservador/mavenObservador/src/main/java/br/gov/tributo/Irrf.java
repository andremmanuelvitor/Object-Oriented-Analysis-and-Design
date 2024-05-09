package br.gov.tributo;

public class Irrf extends Imposto {

	@Override
	public void atualiza(double v) {
		valor=v*0.22;
	}

}
