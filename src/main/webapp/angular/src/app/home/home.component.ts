import {Component} from "@angular/core";

@Component({
    selector:'app-home',
    templateUrl:'home.component.html',
    styleUrls:['home.component.css']
})
export class HomeComponent{
    simpleSlider = 40;
    doubleSlider = [20, 60];

    regularItems = ['Pizza', 'Pasta', 'Parmesan'];
    touch: boolean;

    selectedValue: string;
    currentCity: string[];

    selectTheme = 'primary';
    cities = [
        {value: 'paris-0', viewValue: 'Paris'},
        {value: 'miami-1', viewValue: 'Miami'},
        {value: 'bucharest-2', viewValue: 'Bucharest'},
        {value: 'new-york-3', viewValue: 'New York'},
        {value: 'london-4', viewValue: 'London'},
        {value: 'barcelona-5', viewValue: 'Barcelona'},
        {value: 'moscow-6', viewValue: 'Moscow'},
    ];
}
