package com.CaioWatzko.github.Calculadora.subtracao;

public class Subtrair {

	public static int subtrair(int su1, int su2) throws Exception {
		if(su2 == 0) {
			throw new Exception("Impossível subtrair com 0");
		}
		return su1 / su2;
	}
}
