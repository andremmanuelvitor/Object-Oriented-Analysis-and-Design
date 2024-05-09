package com.revestimento;

import java.util.Scanner;

import edu.mat.geometria.Hexagono;

public class SimuladorPiso {
	public static void main(String[] args) {
		Hexagono h = new Hexagono();
		h.setLado(10);
		System.out.print("area total aplicação do piso (cm):");
		Scanner scan = new Scanner(System.in);
		float total = scan.nextFloat();
		int num = 0;
		while (total > 0) {
			total -= h.area();
			num++;
		}
		System.out.println("quantidade:"+num);
		scan.close();
	}
}
