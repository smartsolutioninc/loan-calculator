package ca.zdata.devtest.domain.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public AmortizationTable calculate() {
		AmortizationTable table = new AmortizationTable();
		
		//TODO: Implement Rule of 78 calculation here
		
		table.generateAmortizationTable(48, 10000.00, 1.0);
		
		return table;
	}

}
