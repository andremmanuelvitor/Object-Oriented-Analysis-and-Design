package br.edu.unifei.ecot02.heranca;

public class App4 {

	public static void main(String[] args) {
		Poligono p1 = new Poligono() {
			@Override public double area() {
				return 0; } }; 
		System.out.println("p1="+p1.area());
		Poligono p2 = new Poligono() {
			@Override public double area() {
				return 0; } }; 
		System.out.println("p2="+p2.area());
	}

}
