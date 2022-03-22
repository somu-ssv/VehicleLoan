import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { NewloanComponent } from './newloan/newloan.component';
import { ShowloanComponent } from './showloan/showloan.component';

const routes: Routes = [
  {path:'AddLoan',component:NewloanComponent},
  {path:'ShowLoan',component:ShowloanComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
