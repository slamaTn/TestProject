package com.excercice.beans;


public class Calculateur {
	private String operande1 ;
	private String operande2 ;
	private int operation ;
	public String getOperande1() {
		return operande1;
	}
	public void setOperande1(String operande1) {
		this.operande1 = operande1;
	}
	public String getOperande2() {
		return operande2;
	}
	public void setOperande2(String operande2) {
		this.operande2 = operande2;
	}
	public int getOperation() {
		return operation;
	}
	public void setOperation(int operation) {
		this.operation = operation;
	}
	
	public double calcul() {
		double result = 0;
		switch (operation) {
		case 0:
			result= Double.parseDouble(operande1) + Double.parseDouble(operande2);
			break;
		case 1:
			result =  Double.parseDouble(operande1) - Double.parseDouble(operande2);
			break;
		case 2:
			result =  Double.parseDouble(operande1) * Double.parseDouble(operande2);
			break;
		default :
			result =  Double.parseDouble(operande1) / Double.parseDouble(operande2);
			break;
					
		}
		return result;
	}

}
