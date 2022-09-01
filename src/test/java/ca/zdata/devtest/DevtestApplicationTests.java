package ca.zdata.devtest;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ca.zdata.devtest.domain.calculator.AmortizationTable;
import ca.zdata.devtest.domain.calculator.AmortizationTable.AmortizationRecord;

@SpringBootTest
class DevtestApplicationTests {

	@Test
	void testAmortization() {
		AmortizationTable table = new AmortizationTable();

		table.generateAmortizationTable(24, 20400.00, .255);
	
		ArrayList<AmortizationRecord> records = table.getAmortizationRecords();
		for (AmortizationRecord record:records)
		{
			System.out.println(record.toString());
		}
	}

}
