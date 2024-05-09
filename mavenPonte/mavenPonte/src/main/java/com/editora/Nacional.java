package com.editora;

public class Nacional implements Origem {
	private String uf;
	@Override
	public float imposto(float preco) {
		return preco *0.1f;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

}
