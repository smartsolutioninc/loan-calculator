import { Component, OnInit } from '@angular/core';
import { CalcService } from '../calc.service';
import { AmortizationTable } from '../amortization-table';
import { AmortizationRecord } from '../amortization-record';


@Component({
	selector: 'app-calc-result',
	templateUrl: './calc-result.component.html',
	styleUrls: ['./calc-result.component.scss']
})
export class CalcResultComponent implements OnInit {
	amortizationTable: AmortizationTable = <AmortizationTable>{};
	constructor(private calcService: CalcService) { }

	ngOnInit(): void {
	 	this.calcService.currentData.subscribe(data => {
     	 console.log(data);
     	 this.amortizationTable=data;
    	});
	}

}
