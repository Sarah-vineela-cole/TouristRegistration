import { Component, OnInit } from '@angular/core';
import { Tourist } from '../tourist'
import { TouristService } from '../tourists.service';

import { Router } from '@angular/router';
@Component({
  selector: 'app-tourist-list',
  templateUrl: './tourist-list.component.html',
  styleUrls: ['./tourist-list.component.css']
})
export class TouristListComponent implements OnInit {

  tourists: Tourist[] | undefined;

  constructor(private TouristService: TouristService) { }

  ngOnInit(): void {
    this.getTourists();
  }

  private getTourists(){
    this.TouristService.getTouristsList().subscribe(data => {
      this.tourists = data;
    });
  }


  }


