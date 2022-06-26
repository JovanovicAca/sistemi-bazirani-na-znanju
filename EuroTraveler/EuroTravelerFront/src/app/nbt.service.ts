import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Request } from 'src/app/Request';

@Injectable({
  providedIn: 'root'
})
export class NbtService {

  private headers = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(private http: HttpClient) {}

  search(data : Request): Observable<string> {
    return this.http.post<string>("http://localhost:8081/api/request", data, {
      headers: this.headers,
      responseType: "json",
    });
  }
}
