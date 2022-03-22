import { Component, OnInit } from '@angular/core';
import { LoanService } from '../loan.service';

@Component({
  selector: 'app-showloan',
  templateUrl: './showloan.component.html',
  styleUrls: ['./showloan.component.css']
})
export class ShowloanComponent implements OnInit {

  constructor(private loas:LoanService) { }

  loanList:any;

  ngOnInit(): void 
  {
    this.loas.getAllLoans().subscribe(
      (data)=>{
        console.log(data);
        this.loanList=data;

      },
      (error)=>
      {
        console.log(error);
      }
    )
  }

}
