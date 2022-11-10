import { Component, OnInit } from '@angular/core';
import { Tourist } from '../tourist';
import { Router } from '@angular/router';
import { TouristService } from '../tourists.service';

@Component({
  selector: 'app-create-tourist-list',
  templateUrl: './create-tourist-list.component.html',
  styleUrls: ['./create-tourist-list.component.css']
})
export class CreatTouristListComponent implements OnInit {

  tourist: Tourist = new Tourist();
  constructor(private touristService: TouristService,
    private router: Router) { }

  ngOnInit(): void {
  }

  saveTourist(){
    this.touristService.createTourist(this.tourist).subscribe( data =>{
      console.log(data);
      this.goToTouristList();
    },
    error => console.log(error));
  }

  goToTouristList(){
    this.router.navigate(['/tourists']);
  }
  
  onSubmit(){
    console.log(this.tourist);
    this.saveTourist();
    alert("Sucessfully Submit");
  }
}