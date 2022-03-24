import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-eligcal',
  templateUrl: './eligcal.component.html',
  styleUrls: ['./eligcal.component.css']
})
export class EligcalComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  monthlyincome:any;
  eligibility:any;
  
  flag: boolean=false;
  

  cal()
  {
  this.eligibility=30*(0.6*this.monthlyincome);
  this.eligibility=Math.round(this.eligibility);
  this.flag=true;
  }

  handleMonthlyIncomeEvent(event:any){
    let val= event.target.value;
    this.monthlyincome= parseInt(val);
  }


}
