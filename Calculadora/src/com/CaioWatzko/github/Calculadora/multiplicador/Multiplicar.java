package com.CaioWatzko.github.Calculadora.multiplicador;

public class Multiplicar {

	public static int multiplicar(int m1, int m2) throws Exception {
		if(m2 == 0) {
			throw new Exception("Impossível multiplicar por 0");
		}
		return m1 / m2;
	}
}
