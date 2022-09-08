package ca.zdata.devtest.domain.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public AmortizationTable calculate(AmortizationDetails amortizationDetails) {
		AmortizationTable table = new AmortizationTable();
		
		//TODO: Implement Rule of 78 calculation here
		if (amortizationDetails==null||amortizationDetails.getTerm()==null||amortizationDetails.getLoanAmount()==null|| amortizationDetails.getInterestRate()==null)
		{
			return table;
		}
		table.generateAmortizationTable(amortizationDetails.getTerm(), amortizationDetails.getLoanAmount(), amortizationDetails.getInterestRate());
		
		return table;
	}

}
