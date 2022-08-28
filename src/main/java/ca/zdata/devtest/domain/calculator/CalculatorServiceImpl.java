package ca.zdata.devtest.domain.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public AmortizationTable calculate() {
		AmortizationTable table = new AmortizationTable();
		
		//TODO: Implement Rule of 78 calculation here
		
		table.setDummyAmount(12345L);
		
		return table;
	}

}
