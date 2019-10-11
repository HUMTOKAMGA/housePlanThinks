import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './users.model';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  apiUrl = "http://localhost:8080/hpt/users";

  constructor(private _http: HttpClient) { }
  getUsers() {
    return this._http.get<User[]>(this.apiUrl);
  }
}
