package ca.zdata.devtest.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.zdata.devtest.domain.calculator.AmortizationTable;
import ca.zdata.devtest.domain.calculator.CalculatorService;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculator;

	//TODO: Add calculation parameters
	@GetMapping("/amortization-table")
	private AmortizationTable calculate() {
		
		return calculator.calculate();
	}
	
}
