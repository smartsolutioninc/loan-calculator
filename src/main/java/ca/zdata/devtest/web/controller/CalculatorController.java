package ca.zdata.devtest.web.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.zdata.devtest.domain.calculator.AmortizationTable;
import ca.zdata.devtest.domain.calculator.CalculatorService;
import ca.zdata.devtest.exception.ValidationException;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

	@Autowired
	private CalculatorService calculator;

	// TODO: Add calculation parameters
	@GetMapping("/amortization-table")
	@CrossOrigin(origins = "http://localhost:8080")
	public AmortizationTable calculate(@PathParam(value = "tenure") Integer tenure,
			@PathParam(value = "amount") Integer amount, @PathParam(value = "interestRate") Double interestRate,
			@PathParam(value = "arrangementFee") Double arrangementFee) throws ValidationException {
		return calculator.calculate(tenure, amount, interestRate, arrangementFee);
	}

}
