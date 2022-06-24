package com.sunflower.testjunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sunflower.testjunit.entities.Calculadora;

@SpringBootTest
class TestJunitApplicationTests {

	@Test
	public void deveriaSomarDoisNumeroPosistivos() {
		Calculadora calc = new Calculadora();
		calc.setN1(2);
		calc.setN2(3);
		Assertions.assertEquals(5, calc.adicao(calc.getN1(), calc.getN2()));
		
		Calculadora calc1 = new Calculadora();
		calc1.setN1(7);
		calc1.setN2(3);
		Assertions.assertEquals(10, calc1.adicao(calc1.getN1(), calc1.getN2()));	
		
		Calculadora calc2 = new Calculadora();
		calc2.setN1(2);
		calc2.setN2(3);
		Assertions.assertEquals(5, calc2.adicao(calc2.getN1(), calc2.getN2()));	
	}
	
	@Test
	public void deveriaSubtrairDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		calc.setN1(2);
		calc.setN2(2);
		Assertions.assertEquals(0, calc.subtracao(calc.getN1(), calc.getN2()));
		
		Calculadora calc1 = new Calculadora();
		calc1.setN1(7);
		calc1.setN2(3);
		Assertions.assertEquals(4, calc1.subtracao(calc1.getN1(), calc1.getN2()));	
		
		Calculadora calc2 = new Calculadora();
		calc2.setN1(4);
		calc2.setN2(3);
		Assertions.assertEquals(1, calc2.subtracao(calc2.getN1(), calc2.getN2()));	
	}

}
