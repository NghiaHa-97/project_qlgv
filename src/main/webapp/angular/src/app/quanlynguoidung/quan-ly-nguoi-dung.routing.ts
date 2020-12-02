import {Routes} from "@angular/router";
import {NguoiDungComponent} from "./nguoi-dung/nguoi-dung.component";
import {QuyenHanComponent} from "./quyen-han/quyen-han.component";

export const quanLyNguoiDungRoute:Routes=[
    {
        path:'',
        children:[
            {
                path:'nguoidung',
                component:NguoiDungComponent
            },
            {
                path:'quyenhan',
                component:QuyenHanComponent
            }
        ]
    }
]
