package com.CaioWatzko.github.Calculadora.somador;

public class Somar {
	
	public static int somar(int s1, int s2) throws Exception {
		if(s2 == 0) {
			throw new Exception("Impossível somar com 0");
		}
		return s1 / s2;
	}
}
