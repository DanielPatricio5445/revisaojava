package br.edu.fatecpg.sobrecarga.view;

import br.edu.fatecpg.sobrecarga.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		
		System.out.println(cal.somar(2,5));
		System.out.println(cal.somar(2.3,5.5));
		System.out.println(cal.somar(2,5,3));

	}

}
