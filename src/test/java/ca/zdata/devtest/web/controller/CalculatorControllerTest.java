package ca.zdata.devtest.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.zdata.devtest.domain.calculator.AmortizationTable;
import ca.zdata.devtest.domain.calculator.CalculatorService;
import ca.zdata.devtest.exception.ValidationException;

@SpringBootTest
public class CalculatorControllerTest {
	
	@Autowired
	private CalculatorService calculator;
	
	@Autowired
	CalculatorController calculatorController;
	
	
	
	@Test
	public void calculate() {
		assertThrows(ValidationException.class, ()->calculatorController.calculate(null, null, null, null)
		);
		
	}
	
	@Test
	public void calculate1() {
		assertThrows(ValidationException.class, ()->calculatorController.calculate(24, null, null, null)
		);
		
	}
	@Test
	public void calculate2() {
		assertThrows(ValidationException.class, ()->calculatorController.calculate(24, 20000, null, null)
		);
		
	}
	@Test
	public void calculate3() {
		assertThrows(ValidationException.class, ()->calculatorController.calculate(24, 20000, 0.255, null)
		);
		
	}
	
	@Test
	public void calculate4() throws ValidationException {
		Double d = new Double(1);
		AmortizationTable resulst = calculatorController.calculate(24, 20000, 0.255, d);
		assertEquals(resulst.getMonthlyPayment(), 902.02);
	}

}
