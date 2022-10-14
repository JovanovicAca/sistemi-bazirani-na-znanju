
import { Component, Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Request } from 'src/app/Request';
import { Observable } from 'rxjs';
import { NbtService } from './nbt.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EuroTravelerFront';

  constructor(private http: HttpClient,private nbtService: NbtService ) {
    }


submit(){
  let travelingHoursLet : number = +(<HTMLInputElement>document.getElementById("traveling-hours")).value;
  let budgetLet : number = +(<HTMLInputElement>document.getElementById("budget")).value;
  let values = (<HTMLInputElement>document.getElementById("putnik")).value;
  let ageCategoryLet = values.split(",");
  let finnalList = [];
  for(let i = 0 ; i < ageCategoryLet.length ; i++){
    let broj : number = + ageCategoryLet[i];
    finnalList.push(broj);
  }
  console.log(finnalList);

  let dateFromLet = (<HTMLInputElement>document.getElementById("od")).value;
  let dateFromNew = new Date(dateFromLet);

  let dateToLet = (<HTMLInputElement>document.getElementById("od")).value;
  let dateToNew = new Date(dateToLet);

  let interests = [];

  let request : Request = {
    budget: budgetLet,
    travelingHours: travelingHoursLet,
    transportType : (<HTMLInputElement>document.getElementById("transport-type")).value,
    ageCategory : finnalList,
    dateFrom : dateFromNew,
    dateTo : dateToNew,
    interests : ["SKIJANJE"]
  };

  this.nbtService.search(request).subscribe({
    next: (result) => {
    },
    error: (error) => {
      console.log(error)
    },
  });
  }
}



@Injectable()
export class ConfigService {
  constructor(private http: HttpClient) { }

  private headers = new HttpHeaders({ "Content-Type": "application/json"});
}