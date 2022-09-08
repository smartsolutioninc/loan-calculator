import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormControl, Validators } from '@angular/forms';
import { CalcService } from '../calc.service';
import { AmortizationDetails } from '../amortization-details';
import { AmortizationTable } from '../amortization-table';
import { AmortizationRecord } from '../amortization-record';

@Component({
	selector: 'app-calc-form',
	templateUrl: './calc-form.component.html',
	styleUrls: ['./calc-form.component.scss']
})
export class CalcFormComponent implements OnInit {
	form: FormGroup= new FormGroup({});
	amortizationTable: AmortizationTable = <AmortizationTable>{};
	
	constructor(
		private formBuilder: FormBuilder,
		private calcService: CalcService
	) { }

	ngOnInit() {
		this.amortizationTable = <AmortizationTable>{};
		this.form = this.formBuilder.group({
      term: '',
      interestRate: '',
      loanAmount: ''
    });
	}


	calculateAmortization() {
		let amortizationDetails = this.form.value;
		this.calcService.getAmortizationTable(amortizationDetails).subscribe(m => {
			if (m == null) {
				this.amortizationTable = <AmortizationTable>{};
			} else {
				this.amortizationTable = m;
			}
			this.calcService.setAmortizationTable(this.amortizationTable);
		});
	}
}
