package br.gov.financa;

public class Central implements Banco {
	private float dinheiro;
	public boolean emprestimo(float v) {
		if (dinheiro >= v) {
			dinheiro -= v;
			return true;
		} else
			return false;
	}

	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float i) {
		dinheiro = i;
	}
}
