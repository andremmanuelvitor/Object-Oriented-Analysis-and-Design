package com.editora;

public class Importado implements Origem {
	private String idioma;
	@Override
	public float imposto(float preco) {
		return preco *0.5f;
	}
	//gets e sets
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

}
