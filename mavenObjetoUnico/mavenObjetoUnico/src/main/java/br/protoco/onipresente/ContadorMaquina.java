package br.protoco.onipresente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ContadorMaquina {
	private int numero;
	private static ContadorMaquina instancia = new ContadorMaquina();

	private ContadorMaquina() {
		try {
			//read file
			BufferedReader read = new BufferedReader( new FileReader(
					this.getClass().getClassLoader()
					.getResource("contador.txt").getFile()));
			this.numero = read.read();
			read.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getNumero() {
		return numero;
	}

	public void incrementa() {
		this.numero++;
		try {
			BufferedWriter write = new BufferedWriter( new FileWriter(
					this.getClass().getClassLoader()
					.getResource("contador.txt").getFile()));
			write.write(this.numero);
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ContadorMaquina getInstancia() {
		return instancia;
	}

}