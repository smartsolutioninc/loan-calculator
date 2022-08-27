package ca.zdata.devtest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.zdata.devtest.domain.calculator.CalculatorService;
import ca.zdata.devtest.domain.calculator.InstallmentTable;

@RestController("/api/calculator")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculator;

	@PostMapping("/installment-table")
	private InstallmentTable calculate() {
		return calculator.calculate();
	}
	
}
