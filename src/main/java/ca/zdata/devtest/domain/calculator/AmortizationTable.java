package ca.zdata.devtest.domain.calculator;

import java.util.ArrayList;

public class AmortizationTable {
	
	public AmortizationTable()
	{
		
	}
	private ArrayList<AmortizationRecord> amortizationRecords;

	public ArrayList<AmortizationRecord> getAmortizationRecords() {
		return amortizationRecords;
	}

	public void generateAmortizationTable(int term,double balance, double rate)
	{
		amortizationRecords=new ArrayList<AmortizationRecord>();
		int interestProportion = calculateInterestProportion(term);
		//Loan principal x monthly flat rate x tenor (months)
		double totalInterest = balance*term*(rate/100.0);
		double newBalance=balance;
		double interest;
		double principal;
		double totalPayment = balance+totalInterest;
		double totalAmoutPerPayment = totalPayment/term;
		for (int currentPayment=term;currentPayment>0;--currentPayment)
		{
			balance = newBalance;
			interest = make2Decimals((totalInterest*currentPayment)/interestProportion);
			principal = make2Decimals(totalAmoutPerPayment-interest);
			newBalance = make2Decimals(newBalance-principal);
			if (newBalance<0)
			{
				newBalance = 0;
			}
			AmortizationRecord record = new AmortizationRecord(currentPayment, balance, interest, principal, newBalance);
			amortizationRecords.add(record);
		}
		
	}
	
	double make2Decimals(double in)
	{
		return Math.round(in*100.0)/100.0;
	}
	
	private int calculateInterestProportion(int term) {
		int proportion = (term+1)*(term/2);
		return proportion;
	}

	public class AmortizationRecord {
		
		public AmortizationRecord(int paymentNumber, double balance,double interest,double principal,double newBalance)
		{
			this.paymentNumber=paymentNumber;
			this.balance=balance;
			this.interest=interest;
			this.principal=principal;
			this.newBalance=newBalance;
		}
		int paymentNumber;
		double balance;
		double interest;
		double principal;
		double newBalance;
		
		public int getPaymentNumber() {
			return paymentNumber;
		}
		public void setPaymentNumber(int paymentNumber) {
			this.paymentNumber = paymentNumber;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getInterest() {
			return interest;
		}
		public void setInterest(double interest) {
			this.interest = interest;
		}
		public double getNewBalance() {
			return newBalance;
		}
		public void setNewBalance(double newBalance) {
			this.newBalance = newBalance;
		}
		public double getPrincipal() {
			return principal;
		}
		public void setPrincipal(double principal) {
			this.principal = principal;
		}
		
		public String toString()
		{
			//could use a StringBuilder here
			return  paymentNumber+" "+(interest+principal)+" "+balance+" "+interest+" "+principal+" "+newBalance;
		}
	
	}
}
