package br.edu.unifei.ecot02.heranca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
	protected String nome;
	private Calendar nascimento = new GregorianCalendar();
	public int idade() {
		return (int)ChronoUnit.YEARS.between(
				LocalDate.of(
				nascimento.get(Calendar.YEAR),
				nascimento.get(Calendar.MONTH),
				nascimento.get(Calendar.DAY_OF_MONTH)),
				LocalDate.now());
	}
	public int conhecimento() {
		return idade()/2;
	}
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}



}
