package com.CaioWatzko.github.Calculadora.divisor;

public class Dividir {
	
	public static int dividir(int d1, int d2) throws Exception {
		if(d2 == 0) {
			throw new Exception("Impossível dividir por 0");
		}
		return d1 / d2;
	}
}
