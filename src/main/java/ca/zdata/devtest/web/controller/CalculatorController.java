package ca.zdata.devtest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.zdata.devtest.domain.calculator.CalculatorService;
import ca.zdata.devtest.domain.calculator.InstallmentTable;

@RestController
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculator;

	@GetMapping("/api/calculator/installment-table")
	private InstallmentTable calculate() {
		return calculator.calculate();
	}
	
}
