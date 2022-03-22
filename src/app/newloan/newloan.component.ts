import { Component, OnInit } from '@angular/core';
import { Loan } from '../loan';
import { LoanService } from '../loan.service';

@Component({
  selector: 'app-newloan',
  templateUrl: './newloan.component.html',
  styleUrls: ['./newloan.component.css']
})
export class NewloanComponent implements OnInit {

  constructor(private loas:LoanService) { }

  ngOnInit(): void {
  }
  loan:Loan=new Loan();

  saveloan(loanForm:any)
  {
    this.loan=loanForm.value;
    console.log(this.loan);
    this.loas.addLoan(this.loan).subscribe(
      (data)=>{
        console.log(data);
        alert("Loan Added!")

      },
      (error)=>
      {
        console.log(error);
      }

    )

  }

}
