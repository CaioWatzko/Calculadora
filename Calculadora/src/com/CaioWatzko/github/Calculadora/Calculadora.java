package com.CaioWatzko.github.Calculadora;

import com.CaioWatzko.github.Calculadora.divisor.Dividir;
import com.CaioWatzko.github.Calculadora.multiplicador.Multiplicar;
import com.CaioWatzko.github.Calculadora.somador.Somar;
import com.CaioWatzko.github.Calculadora.subtracao.Subtrair;

/**
 * Programa que simula uma calculadora orientada a objetos
 * 
 * <p>
 * Esta calculadora farásempre os seguintes cálculos:
 * 
 * Divisão de 152 por 4
 * Multiplicação de 13 por 5
 * Soma de 23 e 43
 * Subtração de 199 e 125
 * <p>
 * 
 * @see
 * Informações Legais
 * 
 * @author CaioWatzko
 * @version 1.0
 */

public class Calculadora {

	public static void main(String[] args) throws Exception {
		
		System.out.println(Dividir.dividir(152, 4));
		System.out.println(Multiplicar.multiplicar(13, 5));
		System.out.println(Somar.somar(27, 43));
		System.out.println(Subtrair.subtrair(199, 125));
	}
}
