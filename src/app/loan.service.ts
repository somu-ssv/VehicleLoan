import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Loan } from './loan';

@Injectable({
  providedIn: 'root'
})
export class LoanService {

  constructor(private myhttp:HttpClient) { }

  restUrl:string="http://localhost:9095/rest/api";

  getAllLoans()
  {
    return this.myhttp.get(this.restUrl+"/Loan")
  }

  addLoan(loa:Loan)
  {
    return this.myhttp.post(this.restUrl+"/Loan",loa);
  }
}
