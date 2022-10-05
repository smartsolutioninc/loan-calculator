package ca.zdata.devtest.domain.calculator;

import javax.websocket.server.PathParam;

import ca.zdata.devtest.exception.ValidationException;

public interface CalculatorService {

	AmortizationTable calculate(Integer tenure,
			Integer amount, Double interestRate,
			Double arrangementFee) throws ValidationException;
	
}
