import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import {MdModule} from "../md/md.module";
import {MaterialModule} from "../app.module";
import {RouterModule} from "@angular/router";
import {NguoiDungComponent} from "./nguoi-dung/nguoi-dung.component";
import {QuyenHanComponent} from "./quyen-han/quyen-han.component";
import {quanLyNguoiDungRoute} from "./quan-ly-nguoi-dung.routing";

@NgModule({
    imports:[
        CommonModule,
        FormsModule,
        MdModule,
        MaterialModule,
        RouterModule.forChild(quanLyNguoiDungRoute)
    ],
    declarations:[
        NguoiDungComponent,
        QuyenHanComponent
    ]

})
export class QuanLyNguoiDungModule{}
