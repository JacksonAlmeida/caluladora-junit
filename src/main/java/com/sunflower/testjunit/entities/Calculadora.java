package com.sunflower.testjunit.entities;

public class Calculadora {

	private int n1, n2;
	
	public Calculadora() {
		
	}

	public Calculadora(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int adicao(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public int subtracao(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public int multiplicacao(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public double divisao(int n1, int n2) {
		double result = n1 / n2;
		return result;
	}
}