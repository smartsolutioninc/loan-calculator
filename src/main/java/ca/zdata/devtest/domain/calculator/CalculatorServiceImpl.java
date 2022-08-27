package ca.zdata.devtest.domain.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public InstallmentTable calculate() {
		InstallmentTable table = new InstallmentTable();
		
		table.setDummyAmount(12345L);
		
		return table;
	}

}
