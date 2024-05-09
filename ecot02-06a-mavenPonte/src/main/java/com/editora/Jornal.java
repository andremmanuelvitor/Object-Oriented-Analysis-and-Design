package com.editora;

import java.util.Date;

public class Jornal extends Publicacao {
	private Date date;
	public Jornal(Origem origem) {
		super(origem);
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
