package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}
	/**
	 * Metodo que permite validar si dada la suma de dos numero el resultado es el
	 * correcto
	 */
	@Test
	public void primeraPU() {
		Long resultadoEsperado = 2159L;
		Long sumando1 = 1500L;
		Long sumando2 = 659L;
		Long resultado = sumando1 + sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
	}

	/**
	 * 
	 * Metodo encargado de dada una cadena invertir su posicion y retornarla al
	 * revez
	 * 
	 * @param cadena
	 * @return cadena
	 */
	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		return cadenaInvertida;
	}
	/**
	 * Metodo que permite validar si la cadena se invirtio correctamente
	 */
	@Test
	public void segundaPU() {
		String resultadoEsperado = "odnuM aloH";
		String resultado = invertirCadena("Hola Mundo");
		Assert.assertEquals(resultado, resultadoEsperado);
		resultadoEsperado = "aloH";
		Assert.assertNotEquals(resultado, resultadoEsperado);
	}
}
