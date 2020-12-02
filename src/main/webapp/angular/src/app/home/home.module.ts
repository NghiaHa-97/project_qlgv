import {NgModule} from "@angular/core";
import {HomeComponent} from "./home.component";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {MdModule} from "../md/md.module";
import {MaterialModule} from "../app.module";
import { RouterModule} from "@angular/router";
import {homeRoute} from "./home.routing";

@NgModule({
    imports:[
        CommonModule,
        FormsModule,
        MdModule,
        MaterialModule,
        RouterModule.forChild(homeRoute)
    ],
    declarations:[
        HomeComponent
    ]
})
export class HomeModule{}
