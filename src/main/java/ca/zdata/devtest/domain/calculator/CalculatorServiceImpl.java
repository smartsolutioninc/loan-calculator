package ca.zdata.devtest.domain.calculator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ca.zdata.devtest.exception.ValidationException;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public AmortizationTable calculate(Integer tenure, Integer amount, Double interestRate, Double arrangementFee) throws ValidationException {
		
		validate(tenure,amount, interestRate, arrangementFee);

		// interestPortion will be calculate with the formula of ((n+1)*n)/2
		int interestPortion = ((tenure + 1) * tenure) / 2;
		// loanpriciple is equal to loan amount requested and arrangementFee (processing// fee)
		double processingFeePerAnum = (amount * arrangementFee) / 100;
		// Calculate processing free as per the tenure
		double processingFee = (processingFeePerAnum * tenure) / 12;
		// Total Principle equal to amount plus processing free
		double totalPrinciple = amount + processingFee;
		// Total Interest Calculation
		double totalInterest = (totalPrinciple * interestRate * tenure) / 100;
		// TotalAmount is equal to interest and amount
		double totalInterestAndAmount = totalPrinciple + totalInterest;
		double monthlyPayment = (totalPrinciple + totalInterest) / tenure;
		List<AmortizationContent> interestTable = new ArrayList<>();
		// logic to find monthly payments
		for (int i = 0; i < tenure; i++) {
			AmortizationContent content = new AmortizationContent();
			content.setInstalment(i+1);
			content.setInterest((totalInterest*(tenure-i))/interestPortion);
			content.setInterest((double)Math.round(content.getInterest()*100)/100);
			content.setPrinciple((totalInterestAndAmount/tenure) -  content.getInterest());
			content.setPrinciple((double)Math.round(content.getPrinciple()*100)/100);
			content.setPaymentAmount((double)Math.round((content.getInterest()+content.getPrinciple())*100)/100);
			interestTable.add(content);
		}
		AmortizationTable table = new AmortizationTable();
		table.setTotalAmount((double) Math.round(totalPrinciple * 100) / 100);
		table.setInterestRate(interestRate);
		table.setTenor(tenure);
		table.setMonthlyPayment((double) Math.round(monthlyPayment * 100) / 100);
		table.setInterestTable(interestTable);
		return table;
	}

	private void validate(Integer tenure, Integer amount, Double interestRate, Double arrangementFee) throws ValidationException {
		if (null == tenure || tenure <= 0) {
			throw new ValidationException("1001", "Tenure should not be empty or zero");
		}
		if (null == amount || amount <= 0) {
			throw new ValidationException("1002", "Amount Should not be empty or zero");
		}
		if (null == interestRate || interestRate <= 0) {
			throw new ValidationException("1003", "InterestRate should not be empty or zero");
		}
		if (null == arrangementFee || arrangementFee <= 0) {
			throw new ValidationException("1004", "ArrangementFee Should not be empty or zero");
		}
		
	}

}
