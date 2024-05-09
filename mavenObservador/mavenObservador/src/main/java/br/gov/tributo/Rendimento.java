package br.gov.tributo;

import java.util.ArrayList;
import java.util.List;

public class Rendimento {
	private List<Imposto> impostos = new ArrayList<>();
	protected void notifica(double v) {
		for (Imposto i : impostos) {
			i.atualiza(v);
		}
	}
	public List<Imposto> getImpostos() {
		return impostos;
	}
	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}
	
}
