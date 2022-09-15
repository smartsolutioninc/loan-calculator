import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CalcFormComponent } from './calc-form/calc-form.component';
import { CalcResultComponent } from './calc-result/calc-result.component';
import { CalcService } from "./calc.service";
import { TableModule } from 'primeng/table';

@NgModule({
	declarations: [
		AppComponent,
		CalcFormComponent,
		CalcResultComponent
	],
	imports: [
		BrowserModule,
		FormsModule,
		ReactiveFormsModule,
		AppRoutingModule,
		HttpClientModule,
		TableModule
	],
	providers: [
			CalcService
	],
	bootstrap: [AppComponent]
})
export class AppModule { }
