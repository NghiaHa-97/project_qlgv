import {Injectable} from "@angular/core";
import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
    providedIn: "root"
})
export class AuthInterceptorService implements HttpInterceptor{
    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        const  modifParam=req.clone({
            headers:req.headers.append('Authorization',`Bearer ${JSON.parse(localStorage.getItem("auth")).jwt}`)
        });
        return next.handle(modifParam);
    }

}
