import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {BehaviorSubject, Observable, Subject} from "rxjs";
import {AuthenticationResponse} from "../../model/AuthenticationResponse";
import {AuthenticationRequest} from "../../model/AuthenticationRequest";
import {SERVER_API_URL} from "../../const/app.const";


@Injectable({providedIn:"root"})
export class LoginService{

    private url=SERVER_API_URL;
    private userSubject=new BehaviorSubject<AuthenticationResponse>(null);

    constructor(private http:HttpClient) {
    }
    getUserSubject():Observable<AuthenticationResponse> {
        return this.userSubject.asObservable();
    }
    setUserSubject(value:AuthenticationResponse){
        this.userSubject.next(value);
    }

    login(req:AuthenticationRequest):Observable<AuthenticationResponse>{
        return this.http.post<AuthenticationResponse>(this.url+"api/authenticate",req,{
            observe:"body"
        });
    }


}
