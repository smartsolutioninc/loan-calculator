package ca.zdata.devtest.domain.calculator;

public class AmortizationContent {

	private int instalment;
	private double paymentAmount;
	private double principle;
	private double interest;
	
	public int getInstalment() {
		return instalment;
	}
	public void setInstalment(int instalment) {
		this.instalment = instalment;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
}
