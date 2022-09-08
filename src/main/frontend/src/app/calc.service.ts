import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable, BehaviorSubject} from 'rxjs';
import { AmortizationDetails } from './amortization-details';
import { AmortizationTable } from './amortization-table';

@Injectable()
export class CalcService {
 	private amortizationTable = new BehaviorSubject(<AmortizationTable>{});
    currentData = this.amortizationTable.asObservable();

	AMORTIZATIONCALCULATE: string = "/api/calculator/amortization-table";

	constructor(private http: HttpClient) { }

	setAmortizationTable(amortizationTable: AmortizationTable) {
      this.amortizationTable.next(amortizationTable);
    }
	
	getAmortizationTable(amortizationDetails: AmortizationDetails): Observable<AmortizationTable> {
		return this.http.put<AmortizationTable>(this.AMORTIZATIONCALCULATE, amortizationDetails);
	}
}
