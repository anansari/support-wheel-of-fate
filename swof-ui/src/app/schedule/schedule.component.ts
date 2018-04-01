import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-schedule',
  templateUrl: './schedule.component.html',
  styleUrls: ['./schedule.component.css']
})

export class ScheduleComponent implements OnInit {

  constructor(private http: HttpClient){
    
  }

  name = "Foo";
  results;

  ngOnInit(): void {
    this.http.get('http://localhost:4567/schedule').subscribe(data => {
    this.results = data;  
    });   
  }

}
