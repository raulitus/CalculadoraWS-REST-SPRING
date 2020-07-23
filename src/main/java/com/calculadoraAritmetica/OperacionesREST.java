package com.calculadoraAritmetica;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class OperacionesREST {
	public int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	public int restar(int x, int y) {
		int resultado;
		resultado = x - y;
		return resultado;
	}

	public float dividir(float x, float y) {
		float resultado;
		resultado = x / y;
		return resultado;
	}

	public BigDecimal multiplicar(int x, int y) {
		BigDecimal resultado = new BigDecimal(x * y);
		return resultado;
	}

	public BigDecimal fact(int numero) {
		double z = 1;
		for (int i = 1; i <= numero; i++) {
			z *=i;

		}
		BigDecimal resultado = new BigDecimal(z);
		return resultado;
	}
}