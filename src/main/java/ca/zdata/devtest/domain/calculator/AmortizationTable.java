package ca.zdata.devtest.domain.calculator;

import java.util.ArrayList;
import java.util.List;

public class AmortizationTable {
	
	private int tenor;
	private double totalAmount;
	private double interestRate;
	private double monthlyPayment;
	
	
	List<AmortizationContent> interestTable = new ArrayList<>();

	public List<AmortizationContent> getInterestTable() {
		return interestTable;
	}

	public void setInterestTable(List<AmortizationContent> interestTable) {
		this.interestTable = interestTable;
	}

	public int getTenor() {
		return tenor;
	}

	public void setTenor(int tenor) {
		this.tenor = tenor;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	

	

}
