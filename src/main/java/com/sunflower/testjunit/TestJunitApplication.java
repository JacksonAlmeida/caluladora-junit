package com.sunflower.testjunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunflower.testjunit.entities.Calculadora;

@SpringBootApplication
public class TestJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestJunitApplication.class, args);

		Calculadora calc = new Calculadora();
		calc.setN1(7);
		calc.setN2(3);
		System.out.println("Result= "+calc.adicao(calc.getN1(), calc.getN2()));
	}

}
