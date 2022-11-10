import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TouristListComponent } from './tourist-list/tourist-list.component';
import { CreatTouristListComponent } from './create-tourist-list/create-tourist-list.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'tourists', component: TouristListComponent},
  {path: 'create-tourist-list', component: CreatTouristListComponent},
 
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],                                                                                                                                                                                                                                                                                                          
  exports: [RouterModule]
})
export class AppRoutingModule { }