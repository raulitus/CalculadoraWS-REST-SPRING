package com.calculadoraAritmetica;


import java.math.BigDecimal;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operaciones")
public class CalculadoraAritmeticaRESTController {
	public CalculadoraAritmeticaRESTController() {
	}

	@RequestMapping(value = "/suma", method = RequestMethod.GET, params = { "num1", "num2" })
	public int suma(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
		OperacionesREST operacionesREST = new OperacionesREST();
		return operacionesREST.sumar(num1, num2);
	}
	
	@RequestMapping(value = "/resta", method = RequestMethod.GET, params = { "num1", "num2" })
	public int resta(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
		OperacionesREST operacionesREST = new OperacionesREST();
		return operacionesREST.restar(num1, num2);
	}
	
	@RequestMapping(value = "/multiplica", method = RequestMethod.GET, params = { "num1", "num2" })
	public BigDecimal multiplicar(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		OperacionesREST operacionesREST = new OperacionesREST();
		return operacionesREST.multiplicar(num1, num2);
	}
	
	@RequestMapping(value = "/divide", method = RequestMethod.GET, params = { "num1", "num2" })
	public float dividir(@RequestParam("num1") float num1, @RequestParam("num2") float num2){
		OperacionesREST operacionesREST = new OperacionesREST();
		return operacionesREST.dividir(num1, num2);
	}
	
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "num1" })
	public BigDecimal factorial(@RequestParam("num1") int num1) { 
		OperacionesREST operacionesREST = new OperacionesREST();
		return operacionesREST.fact(num1);
	}
	
	@RequestMapping(value = "/raizcuadrada", method = RequestMethod.GET, params = { "num1" })
	public double raizcuadrada(@RequestParam("num1") Integer num1) {
		return Math.sqrt(num1);
	}
}
